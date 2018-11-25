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
import com.zkh.cloud.bean.Equip;
import com.zkh.cloud.bean.PageUtils;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.service.EquipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Description:设备相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午8:24:14
 *
 */
@Api(value = "EquipController", description = "设备Api")
@CrossOrigin
@RestController
public class EquipController {

	@Autowired
	private EquipService equipService;

	@ApiOperation(value = "获取分页设备列表", notes = "获取分页设备列表")
	@RequestMapping(value = "/equip/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult list(@RequestParam Map<String, Object> params){
		System.err.println("参数："+params);
		//查询列表数据
        Query query = new Query(params);
		List<Equip> baseArticleList = equipService.queryList(query);
		int total = equipService.queryTotal(query);
		PageUtils pageUtil = new PageUtils(baseArticleList, total, query.getLimit(), query.getPage());
		return RespondResult.ok(pageUtil);
	}

	
	
	@ApiOperation(value = "查询单个设备", notes = "查询单个设备")
	@RequestMapping(value = "/equip/get/{id}", method = RequestMethod.GET)
	public RespondResult findById(@PathVariable("id")String id) {
		RespondResult result = equipService.findOne(id);
		return result;
	}


	@ApiOperation(value = "保存/编辑设备", notes = "保存/编辑设备")
	@RequestMapping(value = "/equip/save", method = RequestMethod.POST)
	public RespondResult save(@RequestBody Equip equip) {
		System.err.println("参数："+equip);
		RespondResult result = equipService.save(equip);
		return result;
	}


	@ApiOperation(value = "删除单个/多个设备", notes = "删除单个/多个设备")
	@RequestMapping(value = "/equip/delete", method = RequestMethod.POST)
	public RespondResult deleteBatch(@RequestBody String[] ids) {
		RespondResult result = equipService.deleteBatch(ids);
		return result;
	}

}
