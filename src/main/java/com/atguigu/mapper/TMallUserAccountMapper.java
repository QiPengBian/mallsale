package com.atguigu.mapper;

import com.atguigu.bean.TMallUserAccount;
import com.atguigu.bean.TMallUserAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TMallUserAccountMapper {
    long countByExample(TMallUserAccountExample example);

    int deleteByExample(TMallUserAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallUserAccount record);

    int insertSelective(TMallUserAccount record);

    List<TMallUserAccount> selectByExample(TMallUserAccountExample example);

    TMallUserAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallUserAccount record, @Param("example") TMallUserAccountExample example);

    int updateByExample(@Param("record") TMallUserAccount record, @Param("example") TMallUserAccountExample example);

    int updateByPrimaryKeySelective(TMallUserAccount record);

    int updateByPrimaryKey(TMallUserAccount record);

    TMallUserAccount selectByUserAcount(Map mp);
}