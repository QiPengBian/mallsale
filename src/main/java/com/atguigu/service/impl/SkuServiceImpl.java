package com.atguigu.service.impl;

import com.atguigu.bean.*;
import com.atguigu.mapper.TMallSkuAttrValueMapper;
import com.atguigu.mapper.TMallSkuMapper;
import com.atguigu.service.SkuService;
import com.sun.activation.registries.MailcapParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luwan on 2018/3/27.
 */
@Service
public class SkuServiceImpl implements SkuService{
    @Autowired
    private TMallSkuMapper tMallSkuMapper;
    @Autowired
    private TMallSkuAttrValueMapper tMallSkuAttrValueMapper;

    @Override
    public void saveSku(TMallSku sku, TMallProduct product, List<TMallSkuAttrValue> listattrvalue) {
        //保存sku表，返回主键
        sku.setShpId(product.getId());
        tMallSkuMapper.insertSku(sku);
        //根据sku主键批量保存属性关联表
        HashMap<Object,Object> map=new HashMap<>();

        map.put("skuId",sku.getId());
        map.put("shpId",product.getId());
        map.put("listav",listattrvalue);
        tMallSkuAttrValueMapper.insertSkuAv(map);
    }

    @Override
    public MallSkuDetailVO getSkudetailByid(int sku_id) {

        MallSkuDetailVO mallSkuVO=  tMallSkuMapper.selectDetailBySkuId(sku_id);
        return mallSkuVO;
    }

    @Override
    public List<TMallSku> getSkuListBySpu(int spu_id) {
        Map mp=new HashMap<>();
        mp.put("spuid",spu_id);
        List<TMallSku> listsku=tMallSkuMapper.selectSkuBySku(mp);

        return listsku;
    }
}
