package com.zkh.cloud.service;

import java.util.List;
import java.util.Map;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zkh.cloud.bean.PageUtils;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.bean.User;
import com.zkh.cloud.constant.Constants;
import com.zkh.cloud.dao.UserMapper;
import com.zkh.cloud.exeception.ExceptionUtil;
import com.zkh.cloud.utils.string.IdGen;
import com.zkh.cloud.utils.string.MD5;
import com.zkh.cloud.utils.string.StringUtils;

/**
 * 
 * @Description:用户服务接口
 * @author wangxueqiang
 * @date 2018年11月11日 下午10:56:11
 *
 */
@Service
@Transactional(readOnly = true)
public class UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private AmqpTemplate template;//通过模板接受发送消息
	
	/**
	 * 
	 * @Description: 分页查询
	 * @param params
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月16日 上午9:31:41
	 *
	 */
	public RespondResult pageList(Map<String, Object> params){
		System.err.println("ao-user-service参数为："+params);
		Query query = new Query(params);
		List<User> baseArticleList = userMapper.queryList(query);
		int total = userMapper.queryTotal(query);
		PageUtils pageUtil = new PageUtils(baseArticleList, total, query.getLimit(), query.getPage());
		return RespondResult.ok(pageUtil);
	}
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
			User user = userMapper.selectByPrimaryKey(id);
			return RespondResult.ok(user);
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
					userMapper.deleteByPrimaryKey(ids[0]);
				}else{
					userMapper.deleteBatch(ids);
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
	 * @param user
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月15日 下午3:54:15
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult save(User user) {
		try {
			if(StringUtils.isNotEmpty(user.getId())){
				userMapper.updateByPrimaryKeySelective(user);
			}else{
				user.setId(IdGen.uuid());
				userMapper.insert(user);			
			}
			return RespondResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	
	
	/**
	 * 
	 * @Description: 注册用户，消息异步发送
	 * @param user
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月23日 上午9:42:45
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult registerUser(User user) {
		try {
			template.convertAndSend(Constants.REGISTERUSER_QUEUE, user.getMobile());
			user.setId(IdGen.uuid());
			user.setPassword(MD5.crypt(user.getPassword()));
			userMapper.insert(user);
			return RespondResult.build(200, null);
		} catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	
	
}
