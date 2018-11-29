package com.zkh.cloud.feign;

import org.springframework.stereotype.Component;

import com.zkh.cloud.bean.OrderLock;
import com.zkh.cloud.bean.RespondResult;
@Component
public class GoodsFallback implements GoodsFeignClient{

	@Override
	public RespondResult findOne(String id) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult findLastedOne() {
		// TODO Auto-generated method stub
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult save(OrderLock orderLock) {
		// TODO Auto-generated method stub
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult deleteBatch(String[] ids) {
		// TODO Auto-generated method stub
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult redisLock(String uid) {
		// TODO Auto-generated method stub
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult optimisticLock(String uid) {
		// TODO Auto-generated method stub
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult testLock(int type) {
		// TODO Auto-generated method stub
		return RespondResult.build(500, "调用失败，进行回调");
	}

}
