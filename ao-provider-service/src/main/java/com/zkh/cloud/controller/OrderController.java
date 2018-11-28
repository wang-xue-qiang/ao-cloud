package com.zkh.cloud.controller;

import java.util.List;
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
import com.zkh.cloud.bean.PageUtils;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Description:派单相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午8:24:14
 *
 */
@Api(value = "OrderController", description = "派单Api")
@CrossOrigin
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@ApiOperation(value = "获取列表派单", notes = "获取列表派单")
	@RequestMapping(value = "/order/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult list(@RequestParam Map<String, Object> params){
		System.err.println("参数："+params);
		//查询列表数据
        Query query = new Query(params);
		List<Order> baseArticleList = orderService.queryList(query);
		int total = orderService.queryTotal(query);
		PageUtils pageUtil = new PageUtils(baseArticleList, total, query.getLimit(), query.getPage());
		return RespondResult.ok(pageUtil);
	}
	
	@ApiOperation(value = "获取单个派单", notes = "获取单个派单")
	@RequestMapping(value = "/order/get/{id}", method = RequestMethod.GET)
	public RespondResult findOne(@PathVariable("id")String id) {
		RespondResult result = orderService.findOne(id);
		return result;
	}

	@ApiOperation(value = "保存/编辑派单", notes = "保存/编辑派单")
	@RequestMapping(value = "/order/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult save(@RequestBody Order order) {
		System.err.println("参数："+order);
		RespondResult result = orderService.save(order);
		return result;
	}


	@ApiOperation(value = "删除单个/多个派单", notes = "删除单个/多个派单")
	@RequestMapping(value = "/order/delete", method = RequestMethod.POST)
	public RespondResult deleteBatch(@RequestBody String[] ids) {
		RespondResult result = orderService.deleteBatch(ids);
		return result;
	}
	
}
