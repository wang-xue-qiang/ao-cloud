package com.zkh.cloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.feign.AddressFeignClient;


/**
 * 
 * @Description:地址相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午9:29:51
 *
 */
@Api(value = "AddressController", description = "地址信息相关Api")
@CrossOrigin
@RestController
public class AddressController {
	@Autowired
	private AddressFeignClient addressFeignClient;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	
	@ApiOperation(value = "查询单个地址", notes = "查询单个地址")
	@RequestMapping(value = "/address/get/{id}", method = RequestMethod.GET)
	public RespondResult findByIdAddress(@PathVariable("id")String id) { 
		return addressFeignClient.findByIdAddress(id);
	}
	@ApiOperation(value = "省市区", notes = "省市区")
	@RequestMapping(value = "/address/findAddress/{parentCode}/{level}", method = RequestMethod.GET)
	@ResponseBody
	public RespondResult findAddress(@PathVariable("parentCode")String parentCode,@PathVariable("level")String level) {		
		return  addressFeignClient.findAddress(parentCode, level);
	}


	@ApiOperation(value = "测试负载均衡", notes = "测试负载均衡")
	@RequestMapping(value = "/address/test", method = RequestMethod.GET)
	public RespondResult testAddress() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("ao-provider-service");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("serviceInstance-serviceId", serviceInstance.getServiceId());
		map.put("serviceInstance-host", serviceInstance.getHost());
		map.put("serviceInstance-port", serviceInstance.getPort());
		return RespondResult.build(200, "测试负载均衡",map );
	}


}
