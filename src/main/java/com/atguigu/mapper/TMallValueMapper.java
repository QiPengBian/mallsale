package com.atguigu.mapper;

import com.atguigu.bean.TMallValue;
import com.atguigu.bean.TMallValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallValueMapper {
    long countByExample(TMallValueExample example);

    int deleteByExample(TMallValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallValue record);

    int insertSelective(TMallValue record);

    List<TMallValue> selectByExample(TMallValueExample example);

    TMallValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallValue record, @Param("example") TMallValueExample example);

    int updateByExample(@Param("record") TMallValue record, @Param("example") TMallValueExample example);

    int updateByPrimaryKeySelective(TMallValue record);

    int updateByPrimaryKey(TMallValue record);

    void insertVlues(@Param("attr_id") int attr_id, @Param("listvalue") List<TMallValue> listvalue);
}