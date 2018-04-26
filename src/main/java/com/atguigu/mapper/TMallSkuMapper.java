package com.atguigu.mapper;

import com.atguigu.bean.MallSkuDetailVO;
import com.atguigu.bean.TMallSku;
import com.atguigu.bean.TMallSkuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TMallSkuMapper {
    long countByExample(TMallSkuExample example);

    int deleteByExample(TMallSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallSku record);

    int insertSelective(TMallSku record);

    List<TMallSku> selectByExample(TMallSkuExample example);

    TMallSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallSku record, @Param("example") TMallSkuExample example);

    int updateByExample(@Param("record") TMallSku record, @Param("example") TMallSkuExample example);

    int updateByPrimaryKeySelective(TMallSku record);

    int updateByPrimaryKey(TMallSku record);

    void insertSku(TMallSku sku);

    MallSkuDetailVO selectDetailBySkuId(int sku_id);

    List<TMallSku> selectSkuBySku(Map mp);
}