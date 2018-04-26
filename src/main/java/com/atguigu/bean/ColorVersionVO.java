package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by luwan on 2018/3/31.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ColorVersionVO {
    private List<TMallProductColor> tpc;
    private List<TMallProductVersion> tpv;
}
