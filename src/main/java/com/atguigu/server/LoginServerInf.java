package com.atguigu.server;

import com.atguigu.bean.TMallUserAccount;

import javax.jws.WebService;

/**
 * Created by luwan on 2018/4/3.
 */
@WebService
public interface LoginServerInf {
    public String login(TMallUserAccount user);

    public String login2(TMallUserAccount user);
}
