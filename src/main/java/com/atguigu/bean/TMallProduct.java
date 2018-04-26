package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMallProduct {
    private Integer id;

    private String shpMch;

    private String shpTp;

    private Integer flbh1;

    private Integer flbh2;

    private Integer ppId;

    private Date chjshj;

    private String shpMsh;


}