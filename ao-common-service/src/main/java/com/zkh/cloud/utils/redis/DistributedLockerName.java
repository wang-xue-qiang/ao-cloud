package com.zkh.cloud.utils.redis;

/**
 * 
 * @Description:分布式锁名
 * @author wangxueqiang
 * @date 2018年11月12日 上午10:31:30
 *
 */
public enum DistributedLockerName {

	/**
	 * 产品生成SKU时的同步锁
	 */
	PRODUCT_GENERATE_SKU("PRODUCT_GENERATE_SKU"),
	
	/**
	 * 询报价单生成询报价单编号时的同步锁
	 */
	QUOTE_GENERATE_QUOTENO("QUOTE_GENERATE_QUOTENO"),
	;
	
	/**
	 * 操作类型代码
	 */
	private String key;
	
	/**
	 * 构造方法
	 * @param key
	 */
	private DistributedLockerName(String  key){
		this.key = key;
	}
	
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}	
	
}
