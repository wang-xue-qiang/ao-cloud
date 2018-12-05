package com.zkh.cloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zkh.cloud.bean.Customer;
import com.zkh.cloud.bean.CustomerExample;
import com.zkh.cloud.bean.Query;
import com.zkh.cloud.bean.dto.CustomerMap;
@Mapper
public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
	List<Customer> queryList(Query query);

	int queryTotal(Query query);

	void deleteBatch(String[] id);
	
	List<CustomerMap> initMapData();
}