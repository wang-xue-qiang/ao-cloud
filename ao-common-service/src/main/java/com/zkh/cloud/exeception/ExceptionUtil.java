package com.zkh.cloud.exeception;

import java.io.PrintWriter;
import java.io.StringWriter;
/**
 * 
 * @Description:异常信息
 * @author wangxueqiang
 * @date 2018年11月13日 下午4:07:51
 *
 */
public class ExceptionUtil {
	/**
	 * 获取异常的堆栈信息
	 * @param t
	 * @return
	 */
	public static String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		try {
			t.printStackTrace(pw);
			return sw.toString();
		} finally {
			pw.close();
		}
	}
}
