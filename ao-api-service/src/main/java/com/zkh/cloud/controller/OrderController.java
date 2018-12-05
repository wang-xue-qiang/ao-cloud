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

import com.zkh.cloud.bean.Order;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.feign.OrderFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 
 * @Description:派单相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午9:29:51
 *
 */
@Api(value = "OrderController", description = "派单信息相关Api")
@CrossOrigin
@RestController
public class OrderController {
	@Autowired
	private OrderFeignClient orderFeignClient;

	
	@ApiOperation(value = "获取分页派单列表", notes = "获取分页派单列表")
	@RequestMapping(value = "/order/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult pageOrderList(@RequestParam Map<String, Object> params){
		return orderFeignClient.pageOrderList(params);
	}

	
	@ApiOperation(value = "查询单个派单", notes = "查询单个派单")
	@RequestMapping(value = "/order/get/{id}", method = RequestMethod.GET)
	public RespondResult findByIdOrder(@PathVariable("id")String id) { 
		return orderFeignClient.findByIdOrder(id);
	}

	@ApiOperation(value = "保存/编辑派单", notes = "保存/编辑派单")
	@RequestMapping(value = "/order/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult saveOrder(@RequestBody Order order) {
		return orderFeignClient.saveOrder(order);
	}

	@ApiOperation(value = "删除单个/多个派单", notes = "删除单个/多个派单")
	@RequestMapping(value = "/order/delete", method = RequestMethod.POST)
	public RespondResult deleteOrder(@RequestBody String[] ids) {
		return orderFeignClient.deleteOrder(ids);
	}


}
