package com.atguigu.mapper;

import com.atguigu.bean.TMallProductSkuInfo;
import com.atguigu.bean.TMallProductSkuInfoExample;
import com.atguigu.bean.TMallProductSkuInfoKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallProductSkuInfoMapper {
    long countByExample(TMallProductSkuInfoExample example);

    int deleteByExample(TMallProductSkuInfoExample example);

    int deleteByPrimaryKey(TMallProductSkuInfoKey key);

    int insert(TMallProductSkuInfo record);

    int insertSelective(TMallProductSkuInfo record);

    List<TMallProductSkuInfo> selectByExample(TMallProductSkuInfoExample example);

    TMallProductSkuInfo selectByPrimaryKey(TMallProductSkuInfoKey key);

    int updateByExampleSelective(@Param("record") TMallProductSkuInfo record, @Param("example") TMallProductSkuInfoExample example);

    int updateByExample(@Param("record") TMallProductSkuInfo record, @Param("example") TMallProductSkuInfoExample example);

    int updateByPrimaryKeySelective(TMallProductSkuInfo record);

    int updateByPrimaryKey(TMallProductSkuInfo record);
}