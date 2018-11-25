package com.zkh.cloud.feign;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.bean.User;

/**
 * @Description:使用feign调用用户微服务
 * @author wangxueqiang
 * @date 2018年11月13日 下午7:34:10
 */
@FeignClient(name="ao-provider-service",fallback=com.zkh.cloud.feign.UserFallback.class)
public interface UserFeignClient {
	
   @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
   public RespondResult findByIdUser(@PathVariable("id")String id);
   
   @RequestMapping(value = "/user/list", method = RequestMethod.POST)
   public RespondResult pageUserList(@RequestParam Map<String, Object> params);
   
   @RequestMapping(value = "/user/save", method = RequestMethod.POST)
   public RespondResult saveUser(@RequestBody User user);
   
   @RequestMapping(value = "/user/delete", method = RequestMethod.POST)
   public RespondResult deleteUser(@RequestBody String[] ids);
   
   @RequestMapping(value = "/user/register", method = RequestMethod.POST)
   public RespondResult registerUser(User user);
}
