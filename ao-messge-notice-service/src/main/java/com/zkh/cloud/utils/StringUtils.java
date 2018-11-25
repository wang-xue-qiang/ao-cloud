package com.zkh.cloud.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	//校验email
	public static boolean checkEmail(String email) {
	    boolean flag = false;
	    try {
	        String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	        Pattern regex = Pattern.compile(check);
	        Matcher matcher = regex.matcher(email);
	        flag = matcher.matches();
	    } catch (Exception e) {
	        flag = false;
	    }
	    return flag;
	}

	// 验证手机号码，11位数字，1开通，第二位数必须是3456789这些数字之一 *
	public static boolean checkMobileNumber(String mobileNumber) {
	    boolean flag = false;
	    try {
	        Pattern regex = Pattern.compile("^1[345789]\\d{9}$");
	        Matcher matcher = regex.matcher(mobileNumber);
	        flag = matcher.matches();
	    } catch (Exception e) {
	        e.printStackTrace();
	        flag = false;
	    }
	    return flag;
	}

	//生成6位验证码
	public static String  randomCode() {
	    StringBuilder str = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < 4; i++) {
	        str.append(random.nextInt(10));
	    }
	    return str.toString();
	}
}
