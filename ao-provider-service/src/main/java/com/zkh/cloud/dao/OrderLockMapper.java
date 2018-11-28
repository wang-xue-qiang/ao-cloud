package com.zkh.cloud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.zkh.cloud.bean.OrderLock;
import com.zkh.cloud.bean.OrderLockExample;
import com.zkh.cloud.bean.Query;
@Mapper
public interface OrderLockMapper {
    int countByExample(OrderLockExample example);

    int deleteByExample(OrderLockExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderLock record);

    int insertSelective(OrderLock record);

    List<OrderLock> selectByExample(OrderLockExample example);

    OrderLock selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderLock record, @Param("example") OrderLockExample example);

    int updateByExample(@Param("record") OrderLock record, @Param("example") OrderLockExample example);

    int updateByPrimaryKeySelective(OrderLock record);

    int updateByPrimaryKey(OrderLock record);

	void update(OrderLock record);

	List<OrderLock> queryList(Query query);

	int queryTotal(Query query);

	void deleteBatch(String[] id);
	
	OrderLock selectOne();
}