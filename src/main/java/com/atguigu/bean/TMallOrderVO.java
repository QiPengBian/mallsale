package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by luwan on 2018/4/6.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TMallOrderVO extends TMallOrder{
    private List<TMallFlowVO> listflow;
}
