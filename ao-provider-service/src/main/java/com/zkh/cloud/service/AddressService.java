package com.zkh.cloud.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zkh.cloud.bean.Address;
import com.zkh.cloud.bean.AddressExample;
import com.zkh.cloud.bean.PageUtils;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.dao.AddressMapper;
import com.zkh.cloud.exeception.ExceptionUtil;
import com.zkh.cloud.utils.json.JsonUtils;
import com.zkh.cloud.utils.redis.JedisUtils;
import com.zkh.cloud.utils.string.IdGen;

/**
 * 
 * @Description:省/市/区/街道/服务接口
 * @author wangxueqiang
 * @date 2018年11月11日 下午10:56:11
 *
 */
@Service
@Transactional(readOnly = true)
public class AddressService {
	@Autowired
	private AddressMapper addressMapper;
	
	/**
	 * 
	 * @Description: 分页查询方法
	 * @param params
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月16日 上午9:19:28
	 *
	 */
	public RespondResult pageList(Map<String, Object> params) {
		System.err.println("参数："+params);
		//查询列表数据
		Query query = new Query(params);
		List<Address> baseArticleList = addressMapper.queryList(query);
		int total =  addressMapper.queryTotal(query);
		PageUtils pageUtil = new PageUtils(baseArticleList, total, query.getLimit(), query.getPage());
		return RespondResult.ok(pageUtil);
	}

	/**
	 * 
	 * @Description: 查询单个实体
	 * @param id
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月13日 下午5:39:22
	 *
	 */
	public RespondResult findOne(String id) {
		try{			
			Address address =addressMapper.selectByPrimaryKey(id);
			return RespondResult.ok(address);	
		}catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

	/**
	 * 
	 * @Description: 查询地址信息
	 * @param parentCode  0顶级
	 * @param level 1省2市3乡|区4街道
	 * @param delFlag
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月12日 下午5:13:26
	 *
	 */
	public RespondResult findAddress(String parentCode,String level,String delFlag){
		//从缓存中取内容
		try {
			String result = JedisUtils.get(parentCode+"_"+level);
			if (StringUtils.isNotEmpty(result)) {
				//把字符串转换成list
				List<Address> list = JsonUtils.jsonToList(result,Address.class);
				return RespondResult.ok(JsonUtils.List2Json(list));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		//缓存没有查询数据库
		AddressExample example = new AddressExample ();
		AddressExample.Criteria c1 = example.createCriteria();
		if(StringUtils.isNotEmpty(parentCode)){
			c1.andParentCodeEqualTo(parentCode);		
		}
		if(StringUtils.isNotEmpty(level)){	
			c1.andLevelEqualTo(level);
		}
		if(StringUtils.isNotEmpty(delFlag)){	
			c1.andDelFlagEqualTo(delFlag);
		}
		List<Address> list = addressMapper.selectByExample(example);	
		//向缓存中添加内容
		try {
			if(list!=null&&list.size()>0){				
				String cacheString = JsonUtils.objectToJson(list);
				JedisUtils.set(parentCode+"_"+level,cacheString,JedisUtils.EXRP_MONTH);
				return RespondResult.ok(JsonUtils.List2Json(list));	
			}else{
				return RespondResult.ok();
			}
		} catch (Exception e) {
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
					addressMapper.deleteByPrimaryKey(ids[0]);
				}else{
					addressMapper.deleteBatch(ids);
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
	 * @param Address
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:54:15
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult save(Address address) {
		try {
			if(StringUtils.isNotEmpty(address.getId())){
				addressMapper.updateByPrimaryKeySelective(address);
			}else{
				address.setId(IdGen.uuid());
				addressMapper.insert(address);			
			}
			return RespondResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
