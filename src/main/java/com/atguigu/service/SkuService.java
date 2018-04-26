package com.atguigu.service;

import com.atguigu.bean.*;

import java.util.List;

/**
 * Created by luwan on 2018/3/27.
 */
public interface SkuService {
    void saveSku(TMallSku sku, TMallProduct product, List<TMallSkuAttrValue> listattrvalue);

    MallSkuDetailVO getSkudetailByid(int sku_id);

    List<TMallSku> getSkuListBySpu(int spu_id);
}
