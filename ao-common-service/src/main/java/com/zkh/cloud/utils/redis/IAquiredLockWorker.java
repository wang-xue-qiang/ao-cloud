package com.zkh.cloud.utils.redis;
/**
 * 
 * @Description:需要锁的任务
 * @param <T>
 * @author wangxueqiang
 * @date 2018年11月12日 上午10:35:16
 *
 */
public interface IAquiredLockWorker<T> {
	//获取锁后进行的任务
	public T invokeAfterLockAquire() throws Exception;
}
