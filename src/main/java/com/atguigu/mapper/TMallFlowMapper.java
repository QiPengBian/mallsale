package com.atguigu.mapper;

import com.atguigu.bean.TMallFlow;
import com.atguigu.bean.TMallFlowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallFlowMapper {
    long countByExample(TMallFlowExample example);

    int deleteByExample(TMallFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallFlow record);

    int insertSelective(TMallFlow record);

    List<TMallFlow> selectByExample(TMallFlowExample example);

    TMallFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallFlow record, @Param("example") TMallFlowExample example);

    int updateByExample(@Param("record") TMallFlow record, @Param("example") TMallFlowExample example);

    int updateByPrimaryKeySelective(TMallFlow record);

    int updateByPrimaryKey(TMallFlow record);
}