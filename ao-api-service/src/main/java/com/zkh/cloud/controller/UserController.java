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
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.bean.User;
import com.zkh.cloud.feign.UserFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 
 * @Description:用户相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午9:29:51
 *
 */
@Api(value = "UserController", description = "用户信息相关Api")
@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private UserFeignClient userFeignClient;

	
	@ApiOperation(value = "获取分页用户列表", notes = "获取分页用户列表")
	@RequestMapping(value = "/user/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult pageUserList(@RequestParam Map<String, Object> params){
		return userFeignClient.pageUserList(params);
	}

	
	@ApiOperation(value = "查询单个用户", notes = "查询单个用户")
	@RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
	public RespondResult findByIdUser(@PathVariable("id")String id) { 
		return userFeignClient.findByIdUser(id);
	}

	@ApiOperation(value = "保存/编辑用户", notes = "保存/编辑用户")
	@RequestMapping(value = "/user/save", method = RequestMethod.POST,produces="application/json")
	public RespondResult saveUser(@RequestBody User user) {
		return userFeignClient.saveUser(user);
	}


	@ApiOperation(value = "删除单个/多个用户", notes = "删除单个/多个用户")
	@RequestMapping(value = "/user/delete", method = RequestMethod.POST)
	public RespondResult deleteUser(@RequestBody String[] ids) {
		return userFeignClient.deleteUser(ids);
	}

	@ApiOperation(value = "注册用户", notes = "注册用户")
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public RespondResult registerUser(@RequestBody User user) {
		RespondResult result = userFeignClient.registerUser(user);
		return result;
	}

	@ApiOperation(value = "发送验证码", notes = "发送验证码")
	@RequestMapping(value = "/user/sendCode", method = RequestMethod.GET)
	public RespondResult sendCode(@RequestParam(value="emailOrPhone",defaultValue="592470261@qq.com") String emailOrPhone) {
		RespondResult result = userFeignClient.sendCode(emailOrPhone);
		return result;
	}

	
}
