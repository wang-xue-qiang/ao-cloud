package com.zkh.cloud.dao;

import com.zkh.cloud.bean.UploadFile;
import com.zkh.cloud.bean.UploadFileExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UploadFileMapper {
    int countByExample(UploadFileExample example);

    int deleteByExample(UploadFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(UploadFile record);

    int insertSelective(UploadFile record);

    List<UploadFile> selectByExample(UploadFileExample example);

    UploadFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByExample(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByPrimaryKeySelective(UploadFile record);

    int updateByPrimaryKey(UploadFile record);
}