package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TMallSkuAttrValue {
    private Integer id;

    private Integer shxmId;

    private Integer shxzhId;

    private Integer shpId;

    private String isSku;

    private Date chjshj;

    private Integer skuId;


}