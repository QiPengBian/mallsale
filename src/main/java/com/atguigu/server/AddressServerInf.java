package com.atguigu.server;

import com.atguigu.bean.TMallAddress;
import com.atguigu.bean.TMallUserAccount;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by luwan on 2018/4/7.
 */
@WebService
public interface AddressServerInf {

    List<TMallAddress> getAddressByUser(TMallUserAccount tMallUserAccount);

}
