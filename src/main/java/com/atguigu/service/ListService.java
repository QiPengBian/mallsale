package com.atguigu.service;

import com.atguigu.bean.MallSkuVO;
import com.atguigu.bean.TMallSkuAttrValue;

import java.util.List;

/**
 * Created by luwan on 2018/3/28.
 */
public interface ListService {

    List<MallSkuVO> getListbyflbh2(Integer flbh2);


    List<MallSkuVO> getSkuByAttrValue(List<TMallSkuAttrValue> listattrvalue, Integer flbh2);
}
