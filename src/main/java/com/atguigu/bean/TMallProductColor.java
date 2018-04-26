package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TMallProductColor {
    private Integer id;

    private Integer shpId;

    private String shpYs;

    private Integer shfqy;

    private Date chjshj;
}