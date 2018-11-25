package com.zkh.cloud.feign;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zkh.cloud.bean.Equip;
import com.zkh.cloud.bean.RespondResult;

/**
 * @Description:使用feign调用用户微服务
 * @author wangxueqiang
 * @date 2018年11月13日 下午7:34:10
 */
@FeignClient(name="ao-provider-service",fallback=com.zkh.cloud.feign.EquipFallback.class)
public interface EquipFeignClient {
	
   @RequestMapping(value = "/equip/get/{id}", method = RequestMethod.GET)
   public RespondResult findByIdEquip(@PathVariable("id")String id);
   
   @RequestMapping(value = "/equip/list", method = RequestMethod.POST)
   public RespondResult pageEquipList(@RequestParam Map<String, Object> params);
   
   @RequestMapping(value = "/equip/save", method = RequestMethod.POST)
   public RespondResult saveEquip(@RequestBody Equip equip);
   
   @RequestMapping(value = "/equip/delete", method = RequestMethod.POST)
   public RespondResult deleteEquip(@RequestBody String[] ids);
}
