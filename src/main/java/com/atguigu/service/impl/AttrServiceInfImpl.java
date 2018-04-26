package com.atguigu.service.impl;

import com.atguigu.bean.MallAttrVO;
import com.atguigu.mapper.TMallAttrMapper;
import com.atguigu.mapper.TMallValueMapper;
import com.atguigu.service.AttrServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luwan on 2018/3/25.
 */
@Service
public class AttrServiceInfImpl implements AttrServiceInf {
    @Autowired
    private TMallAttrMapper tMallAttrMapper;

    @Autowired
    private TMallValueMapper tMallValueMapper;


    @Override
    public void saveAttr(int flbh2, List<MallAttrVO> list_attr) {
        for(MallAttrVO mallAttrVO:list_attr){
            //插入属性返回主键
            tMallAttrMapper.insertAttr(flbh2,mallAttrVO);

            //获得返回主键批量插入属性值
            tMallValueMapper.insertVlues(mallAttrVO.getId(),mallAttrVO.getListvalue());
        }
    }

    @Override
    public  List<MallAttrVO>  asttrServiceInf(int flhb2) {

        return tMallAttrMapper.asttrServiceInf(flhb2);
    }
}
