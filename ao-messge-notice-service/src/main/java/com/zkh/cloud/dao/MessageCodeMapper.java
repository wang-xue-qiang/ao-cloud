package com.zkh.cloud.dao;

import com.zkh.cloud.bean.MessageCode;
import com.zkh.cloud.bean.MessageCodeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MessageCodeMapper {
    int countByExample(MessageCodeExample example);

    int deleteByExample(MessageCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageCode record);

    int insertSelective(MessageCode record);

    List<MessageCode> selectByExample(MessageCodeExample example);

    MessageCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageCode record, @Param("example") MessageCodeExample example);

    int updateByExample(@Param("record") MessageCode record, @Param("example") MessageCodeExample example);

    int updateByPrimaryKeySelective(MessageCode record);

    int updateByPrimaryKey(MessageCode record);
}