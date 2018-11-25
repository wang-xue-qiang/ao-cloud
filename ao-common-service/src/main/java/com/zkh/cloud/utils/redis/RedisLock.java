package com.zkh.cloud.utils.redis;
import javax.annotation.Resource;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;
/**
 * 
 * @Description:分布式锁
 * @author wangxueqiang
 * @date 2018年11月12日 上午10:41:19
 *
 */
public class RedisLock implements IDistributedLocker {
	private final static String LOCKER_PREFIX = "lock:";
	//redisson客户端
	@Resource
	private RedissonClient redisson;
	@Override
	public <T> T lock(DistributedLockerName lockName, IAquiredLockWorker<T> worker) throws InterruptedException, Exception {
		return lock(lockName, worker, 100);
	}
	//获取锁
	@Override
	public <T> T lock(DistributedLockerName lockName, IAquiredLockWorker<T> worker, int lockTime) throws Exception {
		RLock lock = redisson.getLock(LOCKER_PREFIX + lockName.getKey());
		// 为避免死锁，在获取锁100秒以后自动释放锁
		boolean success = lock.tryLock(100, lockTime, TimeUnit.SECONDS);
		if (success) {
			try {
				return worker.invokeAfterLockAquire();
			} finally {
				lock.unlock();
			}
		}
		throw new RuntimeException("无法获取到redisson分布锁");
	}

}
