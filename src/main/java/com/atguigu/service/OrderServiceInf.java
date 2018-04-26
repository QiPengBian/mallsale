package com.atguigu.service;

import com.atguigu.bean.TMallAddress;
import com.atguigu.bean.TMallOrderVO;
import com.atguigu.exception.OverSaleException;

/**
 * Created by luwan on 2018/4/7.
 */
public interface OrderServiceInf {
    void save_order(TMallAddress get_address, TMallOrderVO order);

    void pay_success(TMallOrderVO order) throws OverSaleException;

}
