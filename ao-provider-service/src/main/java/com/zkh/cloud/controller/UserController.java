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
import com.zkh.cloud.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Description:用户相关路由配置
 * @author wangxueqiang
 * @date 2018年11月11日 下午9:29:51
 *
 */
@Api(value = "UserController", description = "用户Api")
@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService userService;


	@ApiOperation(value = "获取分页用户列表", notes = "获取分页用户列表")
	@RequestMapping(value = "/user/list", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public RespondResult list(@RequestParam Map<String, Object> params){
		System.err.println("ao-user-service参数为："+params);
		RespondResult result = userService.pageList(params);
		return result;
	}

	
	@ApiOperation(value = "查询单个用户", notes = "查询单个用户")
	@RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
	public RespondResult findById(@PathVariable("id")String id) {
		RespondResult result = userService.findOne(id);
		return result;
	}


	@ApiOperation(value = "保存/编辑用户", notes = "保存/编辑用户")
	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public RespondResult save(@RequestBody User user) {
		System.err.println("参数："+user);
		RespondResult result = userService.save(user);
		return result;
	}


	@ApiOperation(value = "删除单个/多个用户", notes = "删除单个/多个用户")
	@RequestMapping(value = "/user/delete", method = RequestMethod.POST)
	public RespondResult deleteBatch(@RequestBody String[] ids) {
		RespondResult result = userService.deleteBatch(ids);
		return result;
	}

	@ApiOperation(value = "注册用户", notes = "注册用户")
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public RespondResult registerUser(@RequestBody User user) {
		RespondResult result = userService.registerUser(user);
		return result;
	}

	@ApiOperation(value = "发送验证码", notes = "发送验证码")
	@RequestMapping(value = "/user/sendCode", method = RequestMethod.GET)
	public RespondResult sendCode(@RequestParam("emailOrPhone") String emailOrPhone) {
		RespondResult result = userService.sendCode(emailOrPhone);
		return result;
	}

}
