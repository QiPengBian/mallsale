package com.atguigu.mapper;

import com.atguigu.bean.TMallProductImage;
import com.atguigu.bean.TMallProductImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TMallProductImageMapper {
    long countByExample(TMallProductImageExample example);

    int deleteByExample(TMallProductImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallProductImage record);

    int insertSelective(TMallProductImage record);

    List<TMallProductImage> selectByExample(TMallProductImageExample example);

    TMallProductImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallProductImage record, @Param("example") TMallProductImageExample example);

    int updateByExample(@Param("record") TMallProductImage record, @Param("example") TMallProductImageExample example);

    int updateByPrimaryKeySelective(TMallProductImage record);

    int updateByPrimaryKey(TMallProductImage record);

    void insertListImage(Map<Object, Object> mp);
}