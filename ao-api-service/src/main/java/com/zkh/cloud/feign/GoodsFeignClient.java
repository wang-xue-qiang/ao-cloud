package com.zkh.cloud.feign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zkh.cloud.bean.OrderLock;
import com.zkh.cloud.bean.RespondResult;

import io.swagger.annotations.ApiOperation;

/**
 * @Description:使用feign调用用户微服务
 * @author wangxueqiang
 * @date 2018年11月13日 下午7:34:10
 */
@FeignClient(name="ao-provider-service",fallback=com.zkh.cloud.feign.GoodsFallback.class)
public interface GoodsFeignClient {
	
	@RequestMapping(value = "/orderLock/get/{id}", method = RequestMethod.GET)
	public RespondResult findOne(@PathVariable("id")String id);


	@RequestMapping(value = "/orderLock/findLastedOne", method = RequestMethod.GET)
	public RespondResult findLastedOne() ;
	

	@RequestMapping(value = "/orderLock/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult save(@RequestBody OrderLock orderLock) ;


	@ApiOperation(value = "删除单个/多个抢购品", notes = "删除单个/多个抢购品")
	@RequestMapping(value = "/orderLock/delete", method = RequestMethod.POST)
	public RespondResult deleteBatch(@RequestBody String[] ids) ;
	

	@RequestMapping(value = "/orderLock/redisLock/{uid}", method = RequestMethod.GET)
	public RespondResult redisLock(@PathVariable("uid")String uid) ;
	
	
	
	@RequestMapping(value = "/orderLock/optimisticLock/{uid}", method = RequestMethod.GET)
	public RespondResult optimisticLock(@PathVariable("uid")String uid) ;


	@RequestMapping(value = "/orderLock/testLock", method = RequestMethod.GET)
	public RespondResult testLock(int type);
}
