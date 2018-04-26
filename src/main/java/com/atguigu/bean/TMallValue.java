package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMallValue {
    private Integer id;

    private String shxzh;

    private String shfqy;

    private Integer shxmId;

    private String shxzhMch;

    private Date chjshj;



}