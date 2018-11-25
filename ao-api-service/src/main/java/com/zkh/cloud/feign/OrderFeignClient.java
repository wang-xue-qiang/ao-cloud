package com.zkh.cloud.feign;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zkh.cloud.bean.Order;
import com.zkh.cloud.bean.RespondResult;

/**
 * @Description:使用feign调用用户微服务
 * @author wangxueqiang
 * @date 2018年11月13日 下午7:34:10
 */
@FeignClient(name="ao-provider-service",fallback=com.zkh.cloud.feign.OrderFallback.class)
public interface OrderFeignClient {
	
   @RequestMapping(value = "/order/get/{id}", method = RequestMethod.GET)
   public RespondResult findByIdOrder(@PathVariable("id")String id);
   
   @RequestMapping(value = "/order/list", method = RequestMethod.POST)
   public RespondResult pageOrderList(@RequestParam Map<String, Object> params);
   
   @RequestMapping(value = "/order/save", method = RequestMethod.POST)
   public RespondResult saveOrder(@RequestBody Order order);
   
   @RequestMapping(value = "/order/delete", method = RequestMethod.POST)
   public RespondResult deleteOrder(@RequestBody String[] ids);
}
