package com.atguigu.mapper;

import com.atguigu.bean.TMallClass2;
import com.atguigu.bean.TMallClass2Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallClass2Mapper {
    long countByExample(TMallClass2Example example);

    int deleteByExample(TMallClass2Example example);

    int insert(TMallClass2 record);

    int insertSelective(TMallClass2 record);

    List<TMallClass2> selectByExample(TMallClass2Example example);

    int updateByExampleSelective(@Param("record") TMallClass2 record, @Param("example") TMallClass2Example example);

    int updateByExample(@Param("record") TMallClass2 record, @Param("example") TMallClass2Example example);
}