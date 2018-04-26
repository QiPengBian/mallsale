package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TMallProductVersion {
    private Integer id;

    private Integer shpId;

    private String shpBb;

    private Integer shfqy;

    private Date chjshj;


}