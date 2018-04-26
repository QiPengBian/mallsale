package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

/**
 * Created by luwan on 2018/4/12.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TMallpojo extends TMallSku {
    @Field("shp_tp")
    private String shptp;


   @Field("id")
    private Integer id;
    @Field("shp_id")
    private Integer shpId;
    @Field("kc")
    private Integer kc;
    @Field("jg")
    private Double jg;
    @Field("chjshj")
    private Date chjshj;
    @Field("sku_mch")
    private String skuMch;
    @Field("sku_xl")
    private Integer skuXl;
    @Field("kcdz")
    private String kcdz;
}
