package com.atguigu.mapper;

import com.atguigu.bean.ColorVersionVO;
import com.atguigu.bean.TMallProduct;
import com.atguigu.bean.TMallProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TMallProductMapper {
    long countByExample(TMallProductExample example);

    int deleteByExample(TMallProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallProduct record);

    int insertSelective(TMallProduct record);

    List<TMallProduct> selectByExample(TMallProductExample example);

    TMallProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallProduct record, @Param("example") TMallProductExample example);

    int updateByExample(@Param("record") TMallProduct record, @Param("example") TMallProductExample example);

    int updateByPrimaryKeySelective(TMallProduct record);

    int updateByPrimaryKey(TMallProduct record);

    void insertProduct(TMallProduct record);

    List<TMallProduct> select_spu_list(Map<Object, Object> map);

    ColorVersionVO selectColorAndVersionBySpu(Map mp);
}