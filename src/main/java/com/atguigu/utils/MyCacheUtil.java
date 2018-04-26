package com.atguigu.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class MyCacheUtil {

	public static <T> List<T> getList(String key, Class<T> t) {
		List<T> list = new ArrayList<T>();

		// 第三方数据调用
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtils.getJedis();
		} catch (Exception e) {
			return null;
		}

		Set<String> zrange = jedis.zrange(key, 0, -1);
		Iterator<String> iterator = zrange.iterator();
		while (iterator.hasNext()) {
			String skuStr = iterator.next();

			T sku = MyJsonUtil.json_to_object(skuStr,t);

			list.add(sku);
		}

		return list;
	}

}
