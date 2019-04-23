package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.Kcrecord;
import com.zzti.fruits.pojo.KcrecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KcrecordMapper {
    int countByExample(KcrecordExample example);

    int deleteByExample(KcrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kcrecord record);

    int insertSelective(Kcrecord record);

    List<Kcrecord> selectByExample(KcrecordExample example);

    Kcrecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kcrecord record, @Param("example") KcrecordExample example);

    int updateByExample(@Param("record") Kcrecord record, @Param("example") KcrecordExample example);

    int updateByPrimaryKeySelective(Kcrecord record);

    int updateByPrimaryKey(Kcrecord record);
}