package com.zkh.cloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zkh.cloud.bean.Equip;
import com.zkh.cloud.bean.EquipExample;
import com.zkh.cloud.bean.Query;
@Mapper
public interface EquipMapper {
    int countByExample(EquipExample example);

    int deleteByExample(EquipExample example);

    int deleteByPrimaryKey(String id);

    int insert(Equip record);

    int insertSelective(Equip record);

    List<Equip> selectByExample(EquipExample example);

    Equip selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Equip record, @Param("example") EquipExample example);

    int updateByExample(@Param("record") Equip record, @Param("example") EquipExample example);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);
    
	List<Equip> queryList(Query query);

	int queryTotal(Query query);

	void deleteBatch(String[] id);

}