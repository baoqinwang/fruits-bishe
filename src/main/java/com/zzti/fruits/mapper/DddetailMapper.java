package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.Dddetail;
import com.zzti.fruits.pojo.DddetailExample;
import com.zzti.fruits.pojogroup.GroupDdDet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DddetailMapper {
    int countByExample(DddetailExample example);

    int deleteByExample(DddetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dddetail record);

    int insertSelective(Dddetail record);

    List<Dddetail> selectByExample(DddetailExample example);

    Dddetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dddetail record, @Param("example") DddetailExample example);

    int updateByExample(@Param("record") Dddetail record, @Param("example") DddetailExample example);

    int updateByPrimaryKeySelective(Dddetail record);

    int updateByPrimaryKey(Dddetail record);
    List<GroupDdDet> Search(@Param("ddno")String ddno);
}