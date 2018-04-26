package com.atguigu.bean;

import java.util.Date;

public class TMallOrderInfo {
    private Integer id;
    //订单id
    private Integer ddId;
    //物流id
    private Integer skuId;
    //创建时间
    private Date chjshj;
    //sku名称
    private String skuMch;
    //商品图片
    private String shpTp;
    //sku价格
    private Long skuJg;
    //sku数量
    private Integer skuShl;
    //sku库存地址
    private String skuKcdz;

    private Integer flowId;
    //购物车id
    private Integer gwchId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDdId() {
        return ddId;
    }

    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public String getSkuMch() {
        return skuMch;
    }

    public void setSkuMch(String skuMch) {
        this.skuMch = skuMch == null ? null : skuMch.trim();
    }

    public String getShpTp() {
        return shpTp;
    }

    public void setShpTp(String shpTp) {
        this.shpTp = shpTp == null ? null : shpTp.trim();
    }

    public Long getSkuJg() {
        return skuJg;
    }

    public void setSkuJg(Long skuJg) {
        this.skuJg = skuJg;
    }

    public Integer getSkuShl() {
        return skuShl;
    }

    public void setSkuShl(Integer skuShl) {
        this.skuShl = skuShl;
    }

    public String getSkuKcdz() {
        return skuKcdz;
    }

    public void setSkuKcdz(String skuKcdz) {
        this.skuKcdz = skuKcdz == null ? null : skuKcdz.trim();
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getGwchId() {
        return gwchId;
    }

    public void setGwchId(Integer gwchId) {
        this.gwchId = gwchId;
    }
}