package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.TMallShoppingcar;

public interface CartMapper {

	List<TMallShoppingcar> select_list_cart_by_user(int user_id);

	void insert_cart(TMallShoppingcar cart);

	void update_cart(TMallShoppingcar cart);

	int select_cart_exists(TMallShoppingcar cart);



}
