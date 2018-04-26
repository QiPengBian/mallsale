package com.atguigu.server;

import javax.jws.WebService;

/**
 * Created by luwan on 2018/4/3.
 */
@WebService
public interface TestServerInf {
    public String ping(String hello);
}
