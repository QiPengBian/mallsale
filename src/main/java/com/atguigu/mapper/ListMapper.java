package com.atguigu.mapper;

import com.atguigu.bean.MallSkuVO;

import java.util.HashMap;
import java.util.List;

/**
 * Created by luwan on 2018/3/28.
 */
public interface ListMapper {

    List<MallSkuVO> getListbyflbh2(Integer flbh2);

    List<MallSkuVO> select_list_by_flbh2(Integer flbh2);

    List<MallSkuVO> selectSkuByAttrValue(HashMap map);
}
