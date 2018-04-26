package com.atguigu.mapper;

import com.atguigu.bean.TMallOrderInfo;
import com.atguigu.bean.TMallOrderInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallOrderInfoMapper {
    long countByExample(TMallOrderInfoExample example);

    int deleteByExample(TMallOrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallOrderInfo record);

    int insertSelective(TMallOrderInfo record);

    List<TMallOrderInfo> selectByExample(TMallOrderInfoExample example);

    TMallOrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallOrderInfo record, @Param("example") TMallOrderInfoExample example);

    int updateByExample(@Param("record") TMallOrderInfo record, @Param("example") TMallOrderInfoExample example);

    int updateByPrimaryKeySelective(TMallOrderInfo record);

    int updateByPrimaryKey(TMallOrderInfo record);
}