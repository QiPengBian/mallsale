package com.atguigu.service.impl;

import com.atguigu.bean.TMallUserAccount;
import com.atguigu.mapper.TMallUserAccountMapper;
import com.atguigu.service.UerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luwan on 2018/4/1.
 */
@Service
public class UerServiceImpl implements UerService {

    @Autowired
    private TMallUserAccountMapper tMallUserAccountMapper;


    @Override
    public TMallUserAccount login(TMallUserAccount tMallUserAccount) {

        Map mp=new HashMap();
        mp.put("yhMch",tMallUserAccount.getYhMch());
        mp.put("yhMm",tMallUserAccount.getYhMm());

        TMallUserAccount userAccount = tMallUserAccountMapper.selectByUserAcount(mp);
        return userAccount;
    }
}
