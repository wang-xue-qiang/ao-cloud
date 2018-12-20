package com.zkh.cloud.utils;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @Description: 字符串相关工具
 * @author wangxueqiang
 * @date 2018年11月12日 上午9:24:14
 *
 */
public class StringUtils {
	//判断字符串是否为空
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0 || str.equals("")
				|| str.matches("\\s*");
	}
	//判断字符串是否不为空
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	//转换为字节数组
    public static String toString(byte[] bytes){
    	try {
			return new String(bytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
    }
    //转换为字节数组
    public static byte[] getBytes(String str){
    	if (str != null){
    		try {
				return str.getBytes("UTF-8");
			} catch (UnsupportedEncodingException e) {
				return null;
			}
    	}else{
    		return null;
    	}
    }
}
