package com.zkh.cloud.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.zkh.cloud.bean.Customer;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.feign.CustomerFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * 
 * @Description:客户相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午9:29:51
 *
 */
@Api(value = "customerController", description = "客户信息相关Api")
@CrossOrigin
@RestController
public class CustomerController {
	@Autowired
	private CustomerFeignClient customerFeignClient;

	@ApiOperation(value = "获取分页客户列表", notes = "获取分页客户列表")
	@RequestMapping(value = "/customer/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult pagecustomerList(@RequestParam Map<String, Object> params){
		return customerFeignClient.pageCustomerList(params);
	}

	
	@ApiOperation(value = "查询单个客户", notes = "查询单个客户")
	@RequestMapping(value = "/customer/get/{id}", method = RequestMethod.GET)
	public RespondResult findByIdcustomer(@PathVariable("id")String id) { 
		return customerFeignClient.findByIdCustomer(id);
	}

	@ApiOperation(value = "保存/编辑客户", notes = "保存/编辑客户")
	@RequestMapping(value = "/customer/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult savecustomer(@RequestBody Customer customer) {
		return customerFeignClient.saveCustomer(customer);
	}


	@ApiOperation(value = "删除单个/多个客户", notes = "删除单个/多个客户")
	@RequestMapping(value = "/customer/delete", method = RequestMethod.POST)
	public RespondResult deletecustomer(@RequestBody String[] ids) {
		return customerFeignClient.deleteCustomer(ids);
	}


	@ApiOperation(value = "初始化客户地理分布图信息", notes = "初始化客户地理分布图信息")
	@RequestMapping(value = "/customer/initMapData", method = RequestMethod.GET)
	public RespondResult initMapData() {
		return customerFeignClient.initMapData();
	}
}
