package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.Sysuser;
import com.zzti.fruits.pojo.SysuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysuserMapper {
    int countByExample(SysuserExample example);

    int deleteByExample(SysuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    List<Sysuser> selectByExample(SysuserExample example);

    Sysuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByExample(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);
}