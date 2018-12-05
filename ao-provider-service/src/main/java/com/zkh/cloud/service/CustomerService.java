package com.zkh.cloud.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zkh.cloud.bean.Customer;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.bean.dto.CustomerMap;
import com.zkh.cloud.dao.CustomerMapper;
import com.zkh.cloud.exeception.ExceptionUtil;
import com.zkh.cloud.utils.string.IdGen;
import com.zkh.cloud.utils.string.StringUtils;

/**
 * 
 * @Description:设备服务接口
 * @author wangxueqiang
 * @date 2018年11月11日 下午10:56:11
 *
 */
@Service
@Transactional(readOnly = true)
public class CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	/**
	 * 
	 * @Description: 查询
	 * @param id
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:55:19
	 *
	 */
	public RespondResult findOne(String id) {
		try {
			Customer customer = customerMapper.selectByPrimaryKey(id);
			return RespondResult.ok(customer);
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}
	
	/**
	 * 
	 * @Description: 分页查询list
	 * @param query
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:49:41
	 *
	 */
	public List<Customer> queryList(Query query) {
		return customerMapper.queryList(query);
	}
	/**
	 * 
	 * @Description: 分页查询总数
	 * @param query
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:50:00
	 *
	 */
	public int queryTotal(Query query) {
		return customerMapper.queryTotal(query);
	}

	/**
	 * 
	 * @Description: 删除方法
	 * @param ids  ids长度唯一单独删除    ids长度大于1批量删除
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:14:44
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult deleteBatch(String[] ids) {
		try {
			if(null!= ids && ids.length>0){
				if(ids.length == 1){
					customerMapper.deleteByPrimaryKey(ids[0]);
				}else{
					customerMapper.deleteBatch(ids);
				}						
			}else{
				return RespondResult.build(500, "ids参数不存在！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return RespondResult.ok();
	}
	
	/**
	 * 
	 * @Description: 保存/更新方法
	 * @param customer
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:54:15
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult save(Customer customer) {
		try {
			if(StringUtils.isNotEmpty(customer.getId())){
				customerMapper.updateByPrimaryKeySelective(customer);
			}else{
				customer.setId(IdGen.uuid());
				customerMapper.insert(customer);			
			}
			return RespondResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	/**
	 * 
	 * @Description: 初始化客户地理分布图信息
	 * @param id
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:55:19
	 *
	 */
	public RespondResult initMapData() {
		try {
			List<CustomerMap> list = customerMapper.initMapData();
			return RespondResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}
}
