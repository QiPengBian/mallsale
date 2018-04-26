package com.atguigu.mapper;

import com.atguigu.bean.TMallFlowVO;
import com.atguigu.bean.TMallOrderInfo;
import com.atguigu.bean.TMallOrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface OrderMapper {

	void insert_order(Map<Object, Object> map);

	void insert_flow(Map<Object, Object> map1);

	void insert_infos(Map<Object, Object> map);

	void update_order(TMallOrderVO order);

	void update_flow(TMallFlowVO object_T_MALL_FLOW);

	void delete_carts(Map<Object, Object> map_cart);

	long select_count_kc(@Param("id") int sku_id);

	long select_kc(Map<Object, Object> map);

	void update_kc(TMallOrderInfo info);

}
