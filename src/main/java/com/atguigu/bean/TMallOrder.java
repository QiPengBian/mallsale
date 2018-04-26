package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TMallOrder {
    private Integer id;
    //收货人
    private String shhr;
    //总价格
    private BigDecimal zje;
    //进度号
    private Integer jdh;
    //用户id
    private Integer yhId;
    //创建时间
    private Date chjshj;
    //预计送达时间
    private Date yjsdshj;
    //地址id
    private Integer dzhId;
    //地址名称
    private String dzhMch;


}