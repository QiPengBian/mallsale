package com.atguigu.mapper;

import com.atguigu.bean.TMallProductVersion;
import com.atguigu.bean.TMallProductVersionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallProductVersionMapper {
    long countByExample(TMallProductVersionExample example);

    int deleteByExample(TMallProductVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallProductVersion record);

    int insertSelective(TMallProductVersion record);

    List<TMallProductVersion> selectByExample(TMallProductVersionExample example);

    TMallProductVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallProductVersion record, @Param("example") TMallProductVersionExample example);

    int updateByExample(@Param("record") TMallProductVersion record, @Param("example") TMallProductVersionExample example);

    int updateByPrimaryKeySelective(TMallProductVersion record);

    int updateByPrimaryKey(TMallProductVersion record);
}