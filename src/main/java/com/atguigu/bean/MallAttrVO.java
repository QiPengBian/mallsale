package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author by luwan on 2018/3/25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MallAttrVO extends TMallAttr {
    List<TMallValue> listvalue;

}
