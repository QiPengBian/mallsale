package com.atguigu.mapper;

import com.atguigu.bean.TMallTmClass;
import com.atguigu.bean.TMallTmClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallTmClassMapper {
    long countByExample(TMallTmClassExample example);

    int deleteByExample(TMallTmClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallTmClass record);

    int insertSelective(TMallTmClass record);

    List<TMallTmClass> selectByExample(TMallTmClassExample example);

    TMallTmClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallTmClass record, @Param("example") TMallTmClassExample example);

    int updateByExample(@Param("record") TMallTmClass record, @Param("example") TMallTmClassExample example);

    int updateByPrimaryKeySelective(TMallTmClass record);

    int updateByPrimaryKey(TMallTmClass record);
}