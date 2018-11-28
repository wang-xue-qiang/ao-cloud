package com.zkh.cloud.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zkh.cloud.bean.OrderLock;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.constant.Constants;
import com.zkh.cloud.dao.OrderLockMapper;
import com.zkh.cloud.exeception.ExceptionUtil;
import com.zkh.cloud.redis.RedissLockUtil;
import com.zkh.cloud.utils.string.IdGen;
import com.zkh.cloud.utils.string.StringUtils;

/**
 * 
 * @Description:设备服务接口
 * @author wangxueqiang
 * @date 2018年11月11日 下午10:56:11
 *
 */
@Service
@Transactional(readOnly = true)
public class GoodsService {
	@Autowired
	private OrderLockMapper orderLockMapper;
	
	/**
	 * 
	 * @Description: 查询
	 * @param id
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:55:19
	 *
	 */
	public RespondResult findOne(String id) {
		try {
			OrderLock orderLock = orderLockMapper.selectByPrimaryKey(id);
			return RespondResult.ok(orderLock);
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}
	
	
	/**
	 * 
	 * @Description: 查询最新一条记录
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:55:19
	 *
	 */
	public RespondResult findLastedOne() {
		try {
			OrderLock orderLock = orderLockMapper.selectOne();
			return RespondResult.ok(orderLock);
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

	/**
	 * 
	 * @Description: 分页查询list
	 * @param query
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:49:41
	 *
	 */
	public List<OrderLock> queryList(Query query) {
		return orderLockMapper.queryList(query);
	}
	/**
	 * 
	 * @Description: 分页查询总数
	 * @param query
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:50:00
	 *
	 */
	public int queryTotal(Query query) {
		return orderLockMapper.queryTotal(query);
	}

	/**
	 * 
	 * @Description: 删除方法
	 * @param ids  ids长度唯一单独删除    ids长度大于1批量删除
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:14:44
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult deleteBatch(String[] ids) {
		try {
			if(null!= ids && ids.length>0){
				if(ids.length == 1){
					orderLockMapper.deleteByPrimaryKey(ids[0]);
				}else{
					orderLockMapper.deleteBatch(ids);
				}						
			}else{
				return RespondResult.build(500, "ids参数不存在！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return RespondResult.ok();
	}
	
	/**
	 * 
	 * @Description: 保存/更新方法
	 * @param orderLock
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:54:15
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult save(OrderLock orderLock) {
		try {
			if(StringUtils.isNotEmpty(orderLock.getId())){
				orderLockMapper.updateByPrimaryKeySelective(orderLock);
			}else{
				orderLock.setId(IdGen.uuid());
				orderLockMapper.insert(orderLock);			
			}
			return RespondResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/**
	 * redisLock
	 * @return
	 */
	@Transactional(readOnly = false)
	public RespondResult redisLock(String userId) {
		//开启分布式锁，保证线程安全
		try {
			boolean success = RedissLockUtil.tryLock(Constants.LOCKER_PREFIX + Constants.SECKILL_ORDER, Constants.WAITTIME,Constants.LEASETIME);
			if (success) {
				try {
					System.err.println("获得锁的用户是："+userId);
					OrderLock orderLock = orderLockMapper.selectOne();
					if(orderLock.getNumber() == 0){
						return RespondResult.ok("很遗憾,差一点就抢到了！");
					}
					orderLock.setUserId(userId);
					orderLockMapper.update(orderLock);
					return RespondResult.ok("恭喜抢到"+orderLock.getGoods());
				} finally {
					RedissLockUtil.unlock(Constants.LOCKER_PREFIX + Constants.SECKILL_ORDER);
				}
			}else{
				//失败逻辑处理
				return RespondResult.ok("很遗憾,差一点就抢到了！");
			}		
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		} 
	}

	
	/**
	 * 乐观锁
	 * @param userId 
	 * @return
	 */
	@Transactional(readOnly = false)
	public RespondResult optimisticLock(String userId) {
		try {
			OrderLock orderLock = orderLockMapper.selectOne();
			if(orderLock.getNumber() == 0){
				return RespondResult.ok("很遗憾,差一点就抢到了！");
			}else{
				orderLock.setUserId(userId);
				orderLockMapper.update(orderLock);
			}			
			return RespondResult.ok("恭喜抢到"+orderLock.getGoods());
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		} 
	}

	public RespondResult testLock(int type) {
		try {
			ExecutorService exec = Executors.newFixedThreadPool(10);
			for (int index = 0; index < 100; index++) {
				final int no = index;
				Runnable run = new Runnable() {
					public void run() {
						try {
							long time1 = System.currentTimeMillis();
							URL url = null;
							if(type == 1){
								 url = new URL("http://localhost:7900/orderLock/redisLock/" + no);
							}else{
								 url = new URL("http://localhost:7900/orderLock/optimisticLock/" + no);
							}
							InputStreamReader isr = new InputStreamReader(
									url.openStream());
							long time2 = System.currentTimeMillis();
							System.err.print("Thread " + no + " time:"+ (time2 - time1) + "ms");
							BufferedReader br = new BufferedReader(isr);
							String str;
							while ((str = br.readLine()) != null) {
								System.out.println(str);
							}
							br.close();
							isr.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				exec.execute(run);
			}
			// 退出线程池
			exec.shutdown();
			return RespondResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		} 
	}

}
