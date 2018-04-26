package com.atguigu.utils;

import com.atguigu.server.LoginServerInf;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.beans.factory.FactoryBean;

import java.util.HashMap;

/**
 * Created by luwan on 2018/4/3.
 */
public class MyWsFactoryBean<T> implements FactoryBean<T> {

    private String url;

    private Class<T> t;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Class<T> getT() {
        return t;
    }

    public void setT(Class<T> t) {
        this.t = t;
    }

    public static <T> T getMyWs(String url, Class<T> t) {

        JaxWsProxyFactoryBean jwfb = new JaxWsProxyFactoryBean();
        //设置远程访问地址
        jwfb.setAddress(url);
        //设置接口名的.class
        jwfb.setServiceClass(t);
        //加入安全协议
        // 加入安全协议
        if (t.getSimpleName().equals("TestServerInf")) {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            hashMap.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
            hashMap.put(WSHandlerConstants.PASSWORD_TYPE, "PasswordText");
            hashMap.put("user", "username");
            hashMap.put(WSHandlerConstants.PW_CALLBACK_CLASS, MyCallback.class.getName());
            WSS4JOutInterceptor wss4jOutInterceptor = new WSS4JOutInterceptor(hashMap);
            jwfb.getOutInterceptors().add(wss4jOutInterceptor);
        }

        T create = (T) jwfb.create();

        return create;
    }


    @Override
    public T getObject() throws Exception {
        return getMyWs(url,this.t);
    }

    @Override
    public Class<?> getObjectType() {
        return this.t;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
