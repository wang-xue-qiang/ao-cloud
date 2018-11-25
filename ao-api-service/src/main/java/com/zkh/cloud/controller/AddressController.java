package com.zkh.cloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.zkh.cloud.bean.Address;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.feign.AddressFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 
 * @Description:地址相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午9:29:51
 *
 */
@Api(value = "AddressController", description = "地址Api")
@CrossOrigin
@RestController
public class AddressController {
	@Autowired
	private AddressFeignClient addressFeignClient;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	
	@ApiOperation(value = "获取分页地址列表", notes = "获取分页地址列表")
	@RequestMapping(value = "/address/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult pageAddressList(@RequestParam Map<String, Object> params){
		return addressFeignClient.pageAddressList(params);
	}

	
	@ApiOperation(value = "查询单个地址", notes = "查询单个地址")
	@RequestMapping(value = "/address/get/{id}", method = RequestMethod.GET)
	public RespondResult findByIdAddress(@PathVariable("id")String id) { 
		return addressFeignClient.findByIdAddress(id);
	}

	@ApiOperation(value = "保存/编辑地址", notes = "保存/编辑地址")
	@RequestMapping(value = "/address/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult saveAddress(@RequestBody Address address) {
		return addressFeignClient.saveAddress(address);
	}


	@ApiOperation(value = "删除单个/多个地址", notes = "删除单个/多个地址")
	@RequestMapping(value = "/address/delete", method = RequestMethod.POST)
	public RespondResult deleteAddress(@RequestBody String[] ids) {
		return addressFeignClient.deleteAddress(ids);
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
