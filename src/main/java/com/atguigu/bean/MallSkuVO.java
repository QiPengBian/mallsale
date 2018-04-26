package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by luwan on 2018/3/28.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MallSkuVO extends TMallSku {
    private TMallProduct spu;

    private TMallTradeMark mark;


}
