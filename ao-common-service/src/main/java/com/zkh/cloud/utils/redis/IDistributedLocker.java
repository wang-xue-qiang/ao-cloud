package com.zkh.cloud.utils.redis;

/**
 * 
 * @Description:分布式锁接口
 * @author wangxueqiang
 * @date 2018年11月12日 上午10:35:44
 *
 */
public interface IDistributedLocker {
	
	/**
	 * 获取锁
	 * @param lockName
	 * @param worker
	 * @return
	 * @throws Exception
	 */
	public <T> T lock(DistributedLockerName lockName, IAquiredLockWorker<T> worker) throws Exception;

	/**
	 * 获取锁
	 * @param lockName
	 * @param worker
	 * @param lockTime
	 * @return
	 * @throws Exception
	 */
	public <T> T lock(DistributedLockerName lockName, IAquiredLockWorker<T> worker, int lockTime) throws Exception;
}
