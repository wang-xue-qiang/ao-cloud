package com.zkh.cloud.feign;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.zkh.cloud.bean.Customer;
import com.zkh.cloud.bean.PageUtils;
import com.zkh.cloud.bean.RespondResult;
/**
 * 
 * @Description:微服务调用失败处理
 * @author wangxueqiang
 * @date 2018年11月13日 下午8:10:48
 *
 */
@Component
public class CustomerFallback implements CustomerFeignClient {

	@Override
	public RespondResult findByIdCustomer(String id) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult pageCustomerList(Map<String, Object> params) {
		List<Customer> list = new ArrayList<Customer>();
		PageUtils data = new PageUtils(list, 0, 10, 1);
		return RespondResult.build(500, "调用失败，进行回调",data);
	}

	@Override
	public RespondResult saveCustomer(Customer customer) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult deleteCustomer(String[] ids) {
		return RespondResult.build(500, "调用失败，进行回调");
	}

	@Override
	public RespondResult initMapData() {
		return RespondResult.build(500, "调用失败，进行回调");
	}


}