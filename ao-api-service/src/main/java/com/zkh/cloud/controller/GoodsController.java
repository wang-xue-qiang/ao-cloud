package com.zkh.cloud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zkh.cloud.bean.OrderLock;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.feign.GoodsFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Description:抢购品相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午8:24:14
 *
 */
@Api(value = "orderLockController", description = "抢购品Api")
@CrossOrigin
@RestController
public class GoodsController {

	@Autowired
	private GoodsFeignClient goodsFeignClient;
	
	@ApiOperation(value = "获取单个抢购品", notes = "获取单个抢购品")
	@RequestMapping(value = "/orderLock/get/{id}", method = RequestMethod.GET)
	public RespondResult findOne(@PathVariable("id")String id) {
		RespondResult result = goodsFeignClient.findOne(id);
		return result;
	}

	@ApiOperation(value = "获取最新一条抢购品", notes = "获取最新一条抢购品")
	@RequestMapping(value = "/orderLock/findLastedOne", method = RequestMethod.GET)
	public RespondResult findLastedOne() {
		RespondResult result = goodsFeignClient.findLastedOne();
		return result;
	}
	
	@ApiOperation(value = "保存/编辑抢购品", notes = "保存/编辑抢购品")
	@RequestMapping(value = "/orderLock/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult save(@RequestBody OrderLock orderLock) {
		System.err.println("参数："+orderLock);
		RespondResult result = goodsFeignClient.save(orderLock);
		return result;
	}


	@ApiOperation(value = "删除单个/多个抢购品", notes = "删除单个/多个抢购品")
	@RequestMapping(value = "/orderLock/delete", method = RequestMethod.POST)
	public RespondResult deleteBatch(@RequestBody String[] ids) {
		RespondResult result = goodsFeignClient.deleteBatch(ids);
		return result;
	}
	
	
	@ApiOperation(value = "分布式锁", notes = "分布式锁")
	@RequestMapping(value = "/orderLock/redisLock/{uid}", method = RequestMethod.GET)
	public RespondResult redisLock(@PathVariable("uid")String uid) {
		RespondResult result = goodsFeignClient.redisLock(uid);
		return result;
	}
	
	
	@ApiOperation(value = "乐观锁", notes = "乐观锁")
	@RequestMapping(value = "/orderLock/optimisticLock/{uid}", method = RequestMethod.GET)
	public RespondResult optimisticLock(@PathVariable("uid")String uid) {
		RespondResult result = goodsFeignClient.optimisticLock(uid);
		return result;
	}

	
	@ApiOperation(value = "高并发测试/1:分布式锁 2:乐观锁", notes = "高并发测试/1:分布式锁 2:乐观锁")
	@RequestMapping(value = "/orderLock/testLock", method = RequestMethod.GET)
	public RespondResult testLock(int type) {
		RespondResult result = goodsFeignClient.testLock(type);
		return result;
	}

	
}
