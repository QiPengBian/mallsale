package com.atguigu.controller;

import com.atguigu.bean.TMallShoppingcar;
import com.atguigu.bean.TMallUserAccount;
import com.atguigu.service.CartServiceInf;
import com.atguigu.utils.FastJsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luwan on 2018/4/1.
 */
@Controller
public class CartController {
    private static final Logger logger = Logger.getLogger(CartController.class);
    @Autowired
    private CartServiceInf cartServiceInf;

    @RequestMapping("change_shfxz")
    public String change_shfxz(HttpServletResponse response, HttpSession session,
                               @CookieValue(value = "list_cart_cookie", required = false) String list_cart_cookie, TMallShoppingcar cart,
                               ModelMap map) {
        List<TMallShoppingcar> list_cart = new ArrayList<TMallShoppingcar>();
        TMallUserAccount user = (TMallUserAccount) session.getAttribute("userAccount");
        // 购物车修改业务
        if (user == null) {
            // 修改cookie
            list_cart = FastJsonUtils.toList(list_cart_cookie, TMallShoppingcar.class);
        } else {
            // 修改db
            list_cart = (List<TMallShoppingcar>) session.getAttribute("list_cart_session");// 数据库
        }

        for (int i = 0; i < list_cart.size(); i++) {
            if (list_cart.get(i).getSkuId().equals(cart.getSkuId())) {
                list_cart.get(i).setShfxz(cart.getShfxz());
                if (user == null) {
                    // 覆盖cookie
                    Cookie cookie = new Cookie("list_cart_cookie", FastJsonUtils.toJSONString(list_cart));
                    cookie.setMaxAge(60 * 60 * 24);
                    response.addCookie(cookie);
                } else {
                    cartServiceInf.update_cart(list_cart.get(i));
                }
            }
        }
        map.put("sum", get_sum(list_cart));
        map.put("list_cart", list_cart);
        return "cartListInner";
    }

    @RequestMapping("goto_cart_list")
    public String goto_cart_list(HttpSession session,
                                 @CookieValue(value = "list_cart_cookie", required = false) String list_cart_cookie, ModelMap map) {
        List<TMallShoppingcar> list_cart = new ArrayList<TMallShoppingcar>();
        TMallUserAccount user = (TMallUserAccount) session.getAttribute("userAccount");

        // 通过cookie或者session获取购物车数据
        if (user == null) {
            list_cart = FastJsonUtils.toList(list_cart_cookie, TMallShoppingcar.class);

        } else {
            list_cart = (List<TMallShoppingcar>) session.getAttribute("list_cart_session");// 数据库

        }

        map.put("list_cart", list_cart);
        map.put("sum", get_sum(list_cart));
        return "cartList";
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
    @RequestMapping("minicart")
    public String minicart(HttpSession session,
                           @CookieValue(value = "list_cart_cookie", required = false) String list_cart_cookie, ModelMap map) {
        List<TMallShoppingcar> list_cart = new ArrayList<TMallShoppingcar>();
        logger.info("come  in");
        TMallUserAccount user = (TMallUserAccount) session.getAttribute("userAccount");
        // 通过cookie或者session获取购物车数据
        if (user == null) {
            if(list_cart_cookie!=null){
                list_cart = FastJsonUtils.toList(list_cart_cookie, TMallShoppingcar.class);
            }else{
                return "miniCatList";
            }


        } else {
            list_cart = (List<TMallShoppingcar>) session.getAttribute("list_cart_session");// 数据库

        }
        Integer count=0;
        BigDecimal sum = new BigDecimal("0");
        if(list_cart!=null){
            for (TMallShoppingcar cart:list_cart){
                count+=cart.getTjshl();

                sum = new BigDecimal(cart.getTjshl()).multiply(new BigDecimal(cart.getSkuJg())).setScale(2,BigDecimal.ROUND_HALF_UP).add(sum);

            }
        }

        map.put("list_cart",list_cart);
        map.put("count",count);
        map.put("sum",sum);
        return "miniCatList";

    }


    @RequestMapping("add_cart")
    public String add_cart(HttpSession session, HttpServletResponse response,
                           @CookieValue(value = "list_cart_cookie", required = false) String list_cart_cookie, TMallShoppingcar cart,
                           ModelMap map) {
        List<TMallShoppingcar> list_cart = new ArrayList<TMallShoppingcar>();
        int yh_id ;
        if(cart.getYhId()==null){
            yh_id=0;
        }else{
            yh_id=cart.getYhId();
        }


        // 添加购物车操作
        if (yh_id == 0) {
            // 用户未登陆，操作cookie
            if (StringUtils.isBlank(list_cart_cookie)) {
                list_cart.add(cart);
            } else {
//                list_cart = MyJsonUtil.json_to_list(list_cart_cookie, TMallShoppingcar.class);
                list_cart=FastJsonUtils.toList(list_cart_cookie,TMallShoppingcar.class);
                // 判断是否重复
                boolean b = if_new_cart(list_cart, cart);
                if (b) {
                    // 新车，添加
                    list_cart.add(cart);
                } else {
                    // 老车，更新
                    for (int i = 0; i < list_cart.size(); i++) {
                        if (list_cart.get(i).getSkuId().equals(cart.getSkuId())) {
                            list_cart.get(i).setTjshl(list_cart.get(i).getTjshl() + cart.getTjshl());
                            list_cart.get(i).setHj(list_cart.get(i).getTjshl() * list_cart.get(i).getSkuJg());
                        }
                    }
                }
            }
            // 覆盖cookie
            Cookie cookie = new Cookie("list_cart_cookie", FastJsonUtils.toJSONString(list_cart));
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);
        } else {
            list_cart = (List<TMallShoppingcar>) session.getAttribute("list_cart_session");// 数据库
            // 用户已登陆，操作db

            boolean b = cartServiceInf.if_cart_exists(cart);

            if (!b) {
                cartServiceInf.add_cart(cart);
                if (list_cart == null || list_cart.isEmpty()) {
                    list_cart = new ArrayList<TMallShoppingcar>();
                    list_cart.add(cart);

                } else {
                    list_cart.add(cart);
                }
            } else {
                if(list_cart==null|| list_cart.isEmpty()){
                    list_cart=cartServiceInf.getListCartByUser(yh_id);
                }
                for (int i = 0; i < list_cart.size(); i++) {
                    if (list_cart.get(i).getSkuId().equals(cart.getSkuId())) {
                        list_cart.get(i).setTjshl(list_cart.get(i).getTjshl() + cart.getTjshl());
                        list_cart.get(i).setHj(list_cart.get(i).getTjshl() * list_cart.get(i).getSkuJg());
                        // 老车，更新
                        cartServiceInf.update_cart(list_cart.get(i));
                    }
                }
            }
        }
        session.setAttribute("list_cart_session", list_cart);
        //同步cookie信息
        Cookie cookie = new Cookie("list_cart_cookie", FastJsonUtils.toJSONString(list_cart));
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
        return "redirect:/cart_success.do";

    }

    private boolean if_new_cart(List<TMallShoppingcar> list_cart, TMallShoppingcar cart) {
        boolean b = true;
        for (int i = 0; i < list_cart.size(); i++) {
            if (list_cart.get(i).getSkuId().equals(cart.getSkuId())) {
                b = false;
            }
        }
        return b;
    }

    @RequestMapping("cart_success")
    public String cart_success(ModelMap map) {

        return "cartSuccess";
    }

}
