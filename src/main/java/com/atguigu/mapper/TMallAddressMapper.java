package com.atguigu.mapper;

import com.atguigu.bean.TMallAddress;
import com.atguigu.bean.TMallAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallAddressMapper {
    long countByExample(TMallAddressExample example);

    int deleteByExample(TMallAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallAddress record);

    int insertSelective(TMallAddress record);

    List<TMallAddress> selectByExample(TMallAddressExample example);

    TMallAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallAddress record, @Param("example") TMallAddressExample example);

    int updateByExample(@Param("record") TMallAddress record, @Param("example") TMallAddressExample example);

    int updateByPrimaryKeySelective(TMallAddress record);

    int updateByPrimaryKey(TMallAddress record);
}