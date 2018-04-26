package com.atguigu.controller;

import com.atguigu.bean.TMallShoppingcar;
import com.atguigu.bean.TMallUserAccount;
import com.atguigu.server.LoginServerInf;
import com.atguigu.server.TestServerInf;
import com.atguigu.service.CartServiceInf;
import com.atguigu.service.UerService;
import com.atguigu.utils.CookieUtils;
import com.atguigu.utils.FastJsonUtils;
import com.atguigu.utils.MyWsFactoryBean;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.commons.lang3.StringUtils;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luwan on 2018/3/28.
 */
@Controller
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UerService uerService;

    @Autowired
    private TestServerInf testServerInf;

    @Autowired
    private CartServiceInf cartServiceInf;

    @Autowired
    JmsTemplate jmsTemplate;


    @Autowired
    ActiveMQQueue queueDestination;

    @Value("${login_wsdl_path}")
    private String LOGINWSDLPATH;
    @Autowired
    private LoginServerInf loginServerInf;

    @RequestMapping("login")
    public String login(@RequestParam(value="redirect",required = false)String  redirect,@RequestParam(value = "dataSource_type",defaultValue = "1")Integer  dataSourcetype,@CookieValue(value = "list_cart_cookie", required = false) String list_cart_cookie, TMallUserAccount tMallUserAccount, HttpServletResponse response, HttpSession session) {
        //登录远程用户认证
//       TMallUserAccount userAccount = uerService.login(tMallUserAccount);
      /*  LoginServerInf myWs = MyWsFactoryBean.getMyWs(LOGINWSDLPATH, LoginServerInf.class);
        JaxWsProxyFactoryBean jwfb = new JaxWsProxyFactoryBean();
        //设置远程访问地址
        jwfb.setAddress(LOGINWSDLPATH);
        //设置接口名的.class
        jwfb.setServiceClass(LoginServerInf.class);

        LoginServerInf logininf = (LoginServerInf) jwfb.create();

       String login = myWs.login(tMallUserAccount);*/
      /*  String login="";
        if(dataSourcetype==1){
           login= loginServerInf.login(tMallUserAccount);
           testServerInf.ping("haha");
            TMallUserAccount login1 = uerService.login(tMallUserAccount);
        }else{
            login = loginServerInf.login2(tMallUserAccount);
             userAccount = (TMallUserAccount) FastJsonUtils.toBean(login,TMallUserAccount.class);
        }*/

        TMallUserAccount userAccount = uerService.login(tMallUserAccount);


        if(userAccount==null){
            return "redirect:/index.do";
        }else{
            // 异步调用消息队列，发布日志的消息
            // 发送mq消息
            final String message = userAccount.getId() + "|" + userAccount.getYhMch() + "|登陆";
            jmsTemplate.send(queueDestination, new MessageCreator() {
                @Override
                public Message createMessage(Session session) throws JMSException {
                    return session.createTextMessage(message);
                }
            });
            session.setAttribute("userAccount", userAccount);
            try {
                Cookie userNameCookie = CookieUtils.createUserNameCookie(userAccount.getYhNch());

                response.addCookie(userNameCookie);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            combine_cart(userAccount,response,session,list_cart_cookie);
        }
        // 同步session，清空cookie
        session.setAttribute("list_cart_session", cartServiceInf.getListCartByUser(userAccount.getId()));
        response.addCookie(new Cookie("list_cart_cookie", ""));
        if(StringUtils.isBlank(redirect)){
            return "index";
        }else{
            return redirect;
        }

    }

    private void combine_cart(TMallUserAccount user, HttpServletResponse response, HttpSession session,
                              String list_cart_cookie) {
        List<TMallShoppingcar> list_cart = new ArrayList<TMallShoppingcar>();

        if (StringUtils.isBlank(list_cart_cookie)) {
            //
        } else {
            // TMallShoppingcar
            List<TMallShoppingcar> list_cart_db = cartServiceInf.getListCartByUser(user.getId());
            list_cart = FastJsonUtils.toList(list_cart_cookie, TMallShoppingcar.class);

            for (int i = 0; i < list_cart.size(); i++) {
                TMallShoppingcar cart = list_cart.get(i);
                cart.setYhId(user.getId());
                boolean b = cartServiceInf.if_cart_exists(list_cart.get(i));

                if (b) {
                    // 更新
                    for (int j = 0; j < list_cart_db.size(); j++) {
                        if (cart.getSkuId().equals(list_cart_db.get(j).getSkuId())) {
                            cart.setTjshl(cart.getTjshl() + list_cart_db.get(j).getTjshl());
                            cart.setHj(cart.getTjshl() * cart.getSkuJg());
                            // 老车，更新
                            cartServiceInf.update_cart(cart);
                        }
                    }
                } else {
                    // 添加
                    cartServiceInf.add_cart(cart);
                }
            }
        }

    }
    private boolean if_new_cart(List<TMallShoppingcar> list_cart, TMallShoppingcar cart) {
        boolean b = true;
        for (int i = 0; i < list_cart.size(); i++) {
            if (list_cart.get(i).getSkuId().equals(cart.getId())) {
                b = false;
            }
        }
        return b;
    }

}
