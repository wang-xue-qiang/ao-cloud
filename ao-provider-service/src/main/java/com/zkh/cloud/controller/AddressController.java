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

import com.zkh.cloud.bean.Address;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.service.AddressService;

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
	private AddressService addressService;


	@ApiOperation(value = "条件查询地址", notes = "条件查询地址")
	@RequestMapping(value = "/address/findAddress", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult findAddress(@RequestParam("parentCode")String parentCode,
									 @RequestParam("level")String level,
									 @RequestParam("delFlag")String delFlag) {		
		RespondResult result = addressService.findAddress(parentCode, level, delFlag);
		return result;
	}

	
	
	@ApiOperation(value = "获取分页地址列表", notes = "获取分页地址列表")
	@RequestMapping(value = "/address/list",method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult pageList(@RequestParam Map<String, Object> params){
		RespondResult result = addressService.pageList(params);
		return result;
	}

	
	
	@ApiOperation(value = "查询单个地址", notes = "查询单个地址")
	@RequestMapping(value = "/addres/get/{id}", method = RequestMethod.GET)
	public RespondResult findById(@PathVariable("id")String id) {
		RespondResult result = addressService.findOne(id);
		return result;
	}

	@ApiOperation(value = "保存/编辑地址", notes = "保存/编辑地址")
	@RequestMapping(value = "/address/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult save(@RequestBody Address address) {
		System.err.println("参数："+address);
		RespondResult result = addressService.save(address);
		return result;
	}


	@ApiOperation(value = "删除单个/多个地址", notes = "删除单个/多个地址")
	@RequestMapping(value = "/address/delete", method = RequestMethod.POST)
	public RespondResult deleteBatch(@RequestBody String[] ids) {
		RespondResult result = addressService.deleteBatch(ids);
		return result;
	}

	
}
