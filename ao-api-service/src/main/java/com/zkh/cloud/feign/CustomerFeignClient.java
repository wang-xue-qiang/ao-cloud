package com.zkh.cloud.feign;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zkh.cloud.bean.Customer;
import com.zkh.cloud.bean.RespondResult;

/**
 * @Description:使用feign调用用户微服务
 * @author wangxueqiang
 * @date 2018年11月13日 下午7:34:10
 */
@FeignClient(name="ao-provider-service",fallback=com.zkh.cloud.feign.CustomerFallback.class)
public interface CustomerFeignClient {
	
   @RequestMapping(value = "/customer/get/{id}", method = RequestMethod.GET)
   public RespondResult findByIdCustomer(@PathVariable("id")String id);
   
   @RequestMapping(value = "/customer/list", method = RequestMethod.POST)
   public RespondResult pageCustomerList(@RequestParam Map<String, Object> params);
   
   @RequestMapping(value = "/customer/save", method = RequestMethod.POST)
   public RespondResult saveCustomer(@RequestBody Customer customer);
   
   @RequestMapping(value = "/customer/delete", method = RequestMethod.POST)
   public RespondResult deleteCustomer(@RequestBody String[] ids);

   @RequestMapping(value = "/customer/initMapData", method = RequestMethod.GET)
   public RespondResult initMapData();
   
}
