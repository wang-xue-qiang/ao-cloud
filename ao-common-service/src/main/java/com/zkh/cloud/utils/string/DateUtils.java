package com.zkh.cloud.utils.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @Description:时间工具类
 * @author wangxueqiang
 * @date 2018年11月12日 上午9:32:06
 *
 */
public class DateUtils {
	//字符串转日期
	public static Date formatToDate(String dateStr,String formatStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(formatStr); 
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return date;
	}
}
