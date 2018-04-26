package com.atguigu.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateUtil {

	public static String getMyTime(String format) {
		// 关于日期的格式化
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String str = sdf.format(new Date());
		return str;

	}

	public static Date getMyDate(int i) {
		// 关于日期计算
		Calendar c = Calendar.getInstance();

		c.add(Calendar.DATE, i);

		return c.getTime();
	}

}
