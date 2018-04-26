package com.atguigu.mapper;

import com.atguigu.bean.MallAttrVO;
import com.atguigu.bean.TMallAttr;
import com.atguigu.bean.TMallAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallAttrMapper {
    long countByExample(TMallAttrExample example);

    int deleteByExample(TMallAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMallAttr record);

    int insertSelective(TMallAttr record);

    List<TMallAttr> selectByExample(TMallAttrExample example);

    TMallAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMallAttr record, @Param("example") TMallAttrExample example);

    int updateByExample(@Param("record") TMallAttr record, @Param("example") TMallAttrExample example);

    int updateByPrimaryKeySelective(TMallAttr record);

    int updateByPrimaryKey(TMallAttr record);

    void insertAttr(@Param("flbh2") int flbh2, @Param("attr") MallAttrVO attr);


    List<MallAttrVO> asttrServiceInf(int flhb2);
}