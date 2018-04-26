package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by luwan on 2018/3/30.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MallSkuDetailVO extends TMallSku{
    private TMallProduct spu;
    private List<AttrValue> listav;
    private List<TMallProductImage> listimg;
}
