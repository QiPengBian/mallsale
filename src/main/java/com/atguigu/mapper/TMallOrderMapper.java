package com.atguigu.mapper;

import com.atguigu.bean.TMallOrder;
import com.atguigu.bean.TMallOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallOrderMapper {
    long countByExample(TMallOrderExample example);

    int deleteByExample(TMallOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallOrder record);

    int insertSelective(TMallOrder record);

    List<TMallOrder> selectByExample(TMallOrderExample example);

    TMallOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallOrder record, @Param("example") TMallOrderExample example);

    int updateByExample(@Param("record") TMallOrder record, @Param("example") TMallOrderExample example);

    int updateByPrimaryKeySelective(TMallOrder record);

    int updateByPrimaryKey(TMallOrder record);
}