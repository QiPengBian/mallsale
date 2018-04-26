package com.atguigu.service;

import com.atguigu.bean.TMallShoppingcar;

import java.util.List;

/**
 * Created by luwan on 2018/4/1.
 */
public interface CartServiceInf {
    void add_cart(TMallShoppingcar cart);

    void update_cart(TMallShoppingcar cart);

    boolean if_cart_exists(TMallShoppingcar cart);

    List<TMallShoppingcar> getListCartByUser(Integer userid);
}

