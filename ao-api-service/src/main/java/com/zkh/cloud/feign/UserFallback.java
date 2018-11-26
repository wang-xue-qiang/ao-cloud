package com.zkh.cloud.feign;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.zkh.cloud.bean.PageUtils;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.bean.User;
/**
 * 
 * @Description:微服务调用失败处理
 * @author wangxueqiang
 * @date 2018年11月13日 下午8:10:48
 *
 */
@Component
public class UserFallback implements UserFeignClient {
	
	@Override
	public RespondResult findByIdUser(String id) {
		return RespondResult.build(500, "调用失败，进行回调",new User("-1","默认数据"));
	}

	@Override
	public RespondResult pageUserList(Map<String, Object> params) {
		List<User> list = new ArrayList<User>();
		PageUtils data = new PageUtils(list, 0, 10, 1);
		return RespondResult.build(500, "调用失败，进行回调",data);
	}

	@Override
	public RespondResult saveUser(User user) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult deleteUser(String[] ids) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult registerUser(User user) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult sendCode(String emailOrPhone) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

}