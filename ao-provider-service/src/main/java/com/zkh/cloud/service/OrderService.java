package com.zkh.cloud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zkh.cloud.bean.Order;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.dao.OrderMapper;
import com.zkh.cloud.exeception.ExceptionUtil;
import com.zkh.cloud.utils.string.IdGen;
import com.zkh.cloud.utils.string.StringUtils;

/**
 * 
 * @Description:派单服务接口
 * @author wangxueqiang
 * @date 2018年11月11日 下午10:56:11
 *
 */
@Service
@Transactional(readOnly = true)
public class OrderService {
	@Autowired
	private OrderMapper orderMapper;

	/**
	 * 
	 * @Description: 根据Id查询
	 * @param id
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:57:07
	 *
	 */
	public RespondResult findOne(String id) {
		try {
			Order order = orderMapper.selectByPrimaryKey(id);
			return RespondResult.ok(order);
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
	 * @date 2018年11月15日 下午3:57:27
	 *
	 */
	public List<Order> queryList(Query query) {
		return orderMapper.queryList(query);
	}
	
	/**
	 * 
	 * @Description: 分页查询总数
	 * @param query
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:57:38
	 *
	 */
	public int queryTotal(Query query) {
		return orderMapper.queryTotal(query);
	}
	
	
	
	/**
	 * 
	 * @Description: ids长度唯一单独删除    ids长度大于1批量删除
	 * @param order
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:57:56
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult save(Order order) {
		try {
			if(StringUtils.isNotEmpty(order.getId())){
				orderMapper.updateByPrimaryKeySelective(order);
			}else{
				order.setId(IdGen.uuid());
				orderMapper.insert(order);			
			}
			return RespondResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}

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
					orderMapper.deleteByPrimaryKey(ids[0]);
				}else{
					orderMapper.deleteBatch(ids);
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

}
