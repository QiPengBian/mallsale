package com.atguigu.service.impl;

import com.atguigu.bean.TMallShoppingcar;
import com.atguigu.mapper.CartMapper;
import com.atguigu.service.CartServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author luwan
 * @date 2018/4/1
 */
@Service
public class CartServiceInfImpl implements CartServiceInf{

    @Autowired
    CartMapper cartMapper;

    @Override
    public void add_cart(TMallShoppingcar cart) {
        cartMapper.insert_cart(cart);

    }

    @Override
    public void update_cart(TMallShoppingcar cart) {
        cartMapper.update_cart(cart);
    }


    @Override
    public boolean if_cart_exists(TMallShoppingcar cart) {
        boolean b = false;
        int i = cartMapper.select_cart_exists(cart);
        if (i > 0) {
            b = true;
        }
        return b;
    }

    @Override
    public List<TMallShoppingcar> getListCartByUser(Integer userid) {


        return  cartMapper.select_list_cart_by_user(userid);
    }


}
