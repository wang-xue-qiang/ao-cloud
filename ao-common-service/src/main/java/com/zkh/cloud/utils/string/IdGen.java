package com.zkh.cloud.utils.string;
import java.util.UUID;

/**
 * 
 * @Description:封装各种生成唯一性ID算法的工具类
 * @author wangxueqiang
 * @date 2018年11月15日 下午3:02:11
 *
 */
public class IdGen  {
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	public static void main(String[] args) {
		System.out.println(IdGen.uuid());
	}
}
