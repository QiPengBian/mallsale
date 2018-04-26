package com.atguigu.service;

import com.atguigu.bean.MallAttrVO;

import java.util.List;

/**
 * Created by luwan on 2018/3/25.
 */
public interface AttrServiceInf {

    void saveAttr(int flbh2, List<MallAttrVO> list_attr);

    List<MallAttrVO>  asttrServiceInf(int flhb2);
}
