package com.atguigu.mapper;

import com.atguigu.bean.TMallProductColor;
import com.atguigu.bean.TMallProductColorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallProductColorMapper {
    long countByExample(TMallProductColorExample example);

    int deleteByExample(TMallProductColorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallProductColor record);

    int insertSelective(TMallProductColor record);

    List<TMallProductColor> selectByExample(TMallProductColorExample example);

    TMallProductColor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallProductColor record, @Param("example") TMallProductColorExample example);

    int updateByExample(@Param("record") TMallProductColor record, @Param("example") TMallProductColorExample example);

    int updateByPrimaryKeySelective(TMallProductColor record);

    int updateByPrimaryKey(TMallProductColor record);
}