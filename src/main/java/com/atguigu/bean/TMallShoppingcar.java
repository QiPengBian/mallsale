package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TMallShoppingcar {
    private Integer id;
    //sku名称
    private String skuMch;
    //sku价格
    private double  skuJg;
    //添加数量
    private Integer tjshl;
    //合计
    private double  hj;
    //用户id
    private Integer yhId;
    //商品id
    private Integer shpId;
    //创建时间
    private Date chjshj;
    //skuid
    private Integer skuId;
    //商品图片
    private String shpTp;
    //是否选中
    private String shfxz;
    //库存地址
    private String kcdz;

}