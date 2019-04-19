package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.Protype;
import com.zzti.fruits.pojo.ProtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProtypeMapper {
    int countByExample(ProtypeExample example);

    int deleteByExample(ProtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Protype record);

    int insertSelective(Protype record);

    List<Protype> selectByExample(ProtypeExample example);

    Protype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Protype record, @Param("example") ProtypeExample example);

    int updateByExample(@Param("record") Protype record, @Param("example") ProtypeExample example);

    int updateByPrimaryKeySelective(Protype record);

    int updateByPrimaryKey(Protype record);
}