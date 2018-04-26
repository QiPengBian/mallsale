package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by luwan on 2018/3/25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelMallAttr {
    private List<MallAttrVO> list_attr;;

    List<TMallSkuAttrValue>  listattrvalue;
}
