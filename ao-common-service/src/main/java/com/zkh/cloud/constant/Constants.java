package com.zkh.cloud.constant;

public interface Constants {
	/**
	 * rabbitmq
	 */
	public  static final String REGISTERUSER_QUEUE ="registeruser_queue";//注册用户队列
	/**
	 * 阿里云
	 */
	public static final String  ALIYID ="LTAIqAqQFJnhsRka";
	public static final String  ALIYKEY = "dzlbJBHvuTeKfGB1dcdyyydApabq8M";
	public static final String  ALENDPOINT ="oss-cn-beijing.aliyuncs.com";
	public static final String  ALIWEBSIT="http://images-files-web.oss-cn-beijing.aliyuncs.com";
	public static final String  ALIBULK="images-files-web";
	
	/**
	 * 上传文件类型
	 */
	public static final int UPLOAD_IMAGES=1;
	public static final int UPLOAD_PDF=2;
	
	/**
	 * 分布式锁
	 */
	public static final int WAITTIME = 100;//最多等待时间
	public static final int LEASETIME = 100;//上锁后自动释放锁时间
	public static final String LOCKER_PREFIX = "lock:";
	public static final String SECKILL_ORDER = "seckill_order";
}
