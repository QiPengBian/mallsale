package com.atguigu.mapper;

import com.atguigu.bean.TMallTradeMark;
import com.atguigu.bean.TMallTradeMarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallTradeMarkMapper {
    long countByExample(TMallTradeMarkExample example);

    int deleteByExample(TMallTradeMarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallTradeMark record);

    int insertSelective(TMallTradeMark record);

    List<TMallTradeMark> selectByExample(TMallTradeMarkExample example);

    TMallTradeMark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallTradeMark record, @Param("example") TMallTradeMarkExample example);

    int updateByExample(@Param("record") TMallTradeMark record, @Param("example") TMallTradeMarkExample example);

    int updateByPrimaryKeySelective(TMallTradeMark record);

    int updateByPrimaryKey(TMallTradeMark record);
}