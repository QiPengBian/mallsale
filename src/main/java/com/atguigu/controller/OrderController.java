package com.atguigu.controller;

import com.atguigu.bean.*;
import com.atguigu.exception.OverSaleException;
import com.atguigu.server.AddressServerInf;
import com.atguigu.service.CartServiceInf;
import com.atguigu.service.OrderServiceInf;
import org.apache.http.HttpRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by luwan on 2018/4/6.
 */
@Controller
@SessionAttributes("order")
public class OrderController {
    private static final Logger logger = Logger.getLogger(OrderController.class);
    @Autowired
    private AddressServerInf addressServerInf;
    @Autowired
    private OrderServiceInf orderServiceInf;
    @Autowired
    private CartServiceInf cartServiceInf;

    @RequestMapping("got_chekckOrder")
    public String got_chekckOrder(HttpSession session, ModelMap map){
        List<TMallShoppingcar> list_cart=new ArrayList<>();
        //判断用户是否登录
        TMallUserAccount userAccount= (TMallUserAccount) session.getAttribute("userAccount");
        if(userAccount==null){
            return "redirect:/goto_login_redict.do";
        }else{
            //session中的数据
            list_cart = (List<TMallShoppingcar>) session.getAttribute("list_cart_session");

            TMallOrderVO orderVO=new TMallOrderVO();//订单对象
            orderVO.setYhId(userAccount.getId());
            orderVO.setJdh(1);
            orderVO.setZje(get_sum(list_cart));
            //结算业务
            // 根据购物车的选中状态，获得库存地址信息
            Set<String> set_kcdz = new HashSet<String>();
            for (int i = 0; i < list_cart.size(); i++) {
                if (list_cart.get(i).getShfxz().equals("1")) {
                    // 去重
                    set_kcdz.add(list_cart.get(i).getKcdz());
                }
            }
            // 根据库存地址封装送货清单
            List<TMallFlowVO> list_flow = new ArrayList<TMallFlowVO>();

            Iterator<String> iterator = set_kcdz.iterator();
            while(iterator.hasNext()){
                String kcdz = iterator.next();
                // 根据库存地址生成送货清单
                TMallFlowVO flow =new TMallFlowVO();
                flow.setMqdd("商品未出库");

                flow.setPsfsh("硅谷快递");

                flow.setYhId(userAccount.getId());

                List<TMallOrderInfo> list_info = new ArrayList<TMallOrderInfo>();
                // 循环购物车，将购物车对象转化成订单信息
                for (int i = 0; i < list_cart.size(); i++) {
                    if(list_cart.get(i).getShfxz().equals("1")&&list_cart.get(i).getKcdz().equals(kcdz)){
                        TMallShoppingcar cart  = list_cart.get(i);
                        TMallOrderInfo info=new TMallOrderInfo();
                        info.setGwchId(cart.getId());
                        info.setShpTp(cart.getShpTp());
                        info.setSkuId(cart.getSkuId());
                        info.setSkuJg(Long.valueOf((long) cart.getSkuJg()));
                        info.setSkuKcdz(cart.getKcdz());
                        info.setSkuMch(cart.getSkuMch());
                        info.setSkuShl(cart.getTjshl());
                        list_info.add(info);
                    }

                }

                flow.setList_info(list_info);

                // 将送货清单放入送货清单 集合
                list_flow.add(flow);
            }
            // 送货清单放入主订单
            // 内存中的对象，游离状态对象
            orderVO.setListflow(list_flow);
            try {
                List<TMallAddress> addressByUser = addressServerInf.getAddressByUser(userAccount);
                map.put("list_address", addressByUser);
            }catch (Exception e) {
                e.printStackTrace();
                // 处理用户系统调用异常
                logger.info("处理用户系统调用异常");
                return "redirect:/orderErr.do";
            }
            map.put("order", orderVO);
        }


        return "checkOrder";
    }
    @RequestMapping("save_order")
    public String save_order(HttpSession session, @ModelAttribute("order") TMallOrderVO order,
                             TMallAddress address, ModelMap map) {
        TMallUserAccount userAccount= (TMallUserAccount) session.getAttribute("userAccount");

        // 远程获取获取地址信息
        List<TMallAddress> get_address =  addressServerInf.getAddressByUser(userAccount);

        // 调用保存订单的业务
        orderServiceInf.save_order(get_address.get(0), order);

        logger.info("-------支付之前的jsessionid---------"+session.getId()+"--------------------------");
        // 重新同步session
        session.setAttribute("list_cart_session", cartServiceInf.getListCartByUser(userAccount.getId()));

        // 重定向到支付服务，传入订单号和交易金额
        return "realPay";
    }

    @RequestMapping("pay_success")
    public String pay_success(HttpSession session) {
        TMallOrderVO order = (TMallOrderVO) session.getAttribute("order");
        // 支付成功
        logger.info("------支付之后回调的jsessionid----------"+session.getId()+"--------------------------");
        try {
            orderServiceInf.pay_success(order);

        } catch (OverSaleException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "redirect:/order_success.do";
    }
   /* @RequestMapping("real_pay_success")
    @ResponseBody
    public String real_pay_success(@ModelAttribute("order") TMallOrderVO order) {
        // 支付成功
        try {
            orderServiceInf.pay_success(order);
        } catch (OverSaleException e) {

            e.printStackTrace();
            return "success";
        }
        return "success";
    }*/

    @RequestMapping("order_success")
    public String order_success() {
        return "orderSuccess";
    }

    @RequestMapping("goto_pay")
    public String goto_pay() {
        // 伪支付服务
        return "pay";
    }
    private BigDecimal get_sum(List<TMallShoppingcar> list_cart) {
        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i < list_cart.size(); i++) {
            if (list_cart.get(i).getShfxz().equals("1")) {
                sum = sum.add(new BigDecimal(list_cart.get(i).getHj() + ""));
            }
        }
        return sum;
    }
}
