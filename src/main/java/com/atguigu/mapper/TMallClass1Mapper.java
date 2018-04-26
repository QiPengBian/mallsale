package com.atguigu.mapper;

import com.atguigu.bean.TMallClass1;
import com.atguigu.bean.TMallClass1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallClass1Mapper {
    long countByExample(TMallClass1Example example);

    int deleteByExample(TMallClass1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallClass1 record);

    int insertSelective(TMallClass1 record);

    List<TMallClass1> selectByExample(TMallClass1Example example);

    TMallClass1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallClass1 record, @Param("example") TMallClass1Example example);

    int updateByExample(@Param("record") TMallClass1 record, @Param("example") TMallClass1Example example);

    int updateByPrimaryKeySelective(TMallClass1 record);

    int updateByPrimaryKey(TMallClass1 record);
}