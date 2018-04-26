package com.atguigu.mapper;

import com.atguigu.bean.TMallSkuAttrValue;
import com.atguigu.bean.TMallSkuAttrValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TMallSkuAttrValueMapper {
    long countByExample(TMallSkuAttrValueExample example);

    int deleteByExample(TMallSkuAttrValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallSkuAttrValue record);

    int insertSelective(TMallSkuAttrValue record);

    List<TMallSkuAttrValue> selectByExample(TMallSkuAttrValueExample example);

    TMallSkuAttrValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallSkuAttrValue record, @Param("example") TMallSkuAttrValueExample example);

    int updateByExample(@Param("record") TMallSkuAttrValue record, @Param("example") TMallSkuAttrValueExample example);

    int updateByPrimaryKeySelective(TMallSkuAttrValue record);

    int updateByPrimaryKey(TMallSkuAttrValue record);

    void insertSkuAv(Map map);
}