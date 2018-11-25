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

import com.zkh.cloud.bean.Equip;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.feign.EquipFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 
 * @Description:设备相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午9:29:51
 *
 */
@Api(value = "EquipController", description = "设备Api")
@CrossOrigin
@RestController
public class EquipController {
	@Autowired
	private EquipFeignClient equipFeignClient;

	@ApiOperation(value = "获取分页设备列表", notes = "获取分页设备列表")
	@RequestMapping(value = "/equip/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult pageEquipList(@RequestParam Map<String, Object> params){
		return equipFeignClient.pageEquipList(params);
	}

	
	@ApiOperation(value = "查询单个设备", notes = "查询单个设备")
	@RequestMapping(value = "/equip/get/{id}", method = RequestMethod.GET)
	public RespondResult findByIdEquip(@PathVariable("id")String id) { 
		return equipFeignClient.findByIdEquip(id);
	}

	@ApiOperation(value = "保存/编辑设备", notes = "保存/编辑设备")
	@RequestMapping(value = "/equip/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult saveEquip(@RequestBody Equip equip) {
		return equipFeignClient.saveEquip(equip);
	}


	@ApiOperation(value = "删除单个/多个设备", notes = "删除单个/多个设备")
	@RequestMapping(value = "/equip/delete", method = RequestMethod.POST)
	public RespondResult deleteEquip(@RequestBody String[] ids) {
		return equipFeignClient.deleteEquip(ids);
	}


	
}
