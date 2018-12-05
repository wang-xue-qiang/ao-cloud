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
import com.zkh.cloud.bean.Customer;
import com.zkh.cloud.bean.PageUtils;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Description:客户相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午8:24:14
 *
 */
@Api(value = "CustomerController", description = "客户相关")
@CrossOrigin
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@ApiOperation(value = "获取分页客户列表", notes = "获取分页客户列表")
	@RequestMapping(value = "/customer/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult list(@RequestParam Map<String, Object> params){
		System.err.println("参数："+params);
		//查询列表数据
        Query query = new Query(params);
		List<Customer> baseArticleList = customerService.queryList(query);
		int total = customerService.queryTotal(query);
		PageUtils pageUtil = new PageUtils(baseArticleList, total, query.getLimit(), query.getPage());
		return RespondResult.ok(pageUtil);
	}

	
	
	@ApiOperation(value = "查询单个客户", notes = "查询单个客户")
	@RequestMapping(value = "/customer/get/{id}", method = RequestMethod.GET)
	public RespondResult findById(@PathVariable("id")String id) {
		RespondResult result = customerService.findOne(id);
		return result;
	}


	@ApiOperation(value = "保存/编辑客户", notes = "保存/编辑客户")
	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public RespondResult save(@RequestBody Customer customer) {
		System.err.println("参数："+customer);
		RespondResult result = customerService.save(customer);
		return result;
	}


	@ApiOperation(value = "删除单个/多个客户", notes = "删除单个/多个客户")
	@RequestMapping(value = "/customer/delete", method = RequestMethod.POST)
	public RespondResult deleteBatch(@RequestBody String[] ids) {
		RespondResult result = customerService.deleteBatch(ids);
		return result;
	}

	
	@ApiOperation(value = "初始化客户地理分布图信息", notes = "初始化客户地理分布图信息")
	@RequestMapping(value = "/customer/initMapData", method = RequestMethod.GET)
	public RespondResult initMapData() {
		RespondResult result = customerService.initMapData();
		return result;
	}
}
