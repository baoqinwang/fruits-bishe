package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.Ddinfo;
import com.zzti.fruits.pojo.DdinfoExample;
import com.zzti.fruits.pojogroup.OrderPoiParam;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface DdinfoMapper {
    int countByExample(DdinfoExample example);

    int deleteByExample(DdinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ddinfo record);

    int insertSelective(Ddinfo record);

    List<Ddinfo> selectByExampleWithBLOBs(DdinfoExample example);

    List<Ddinfo> selectByExample(DdinfoExample example);

    Ddinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ddinfo record, @Param("example") DdinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Ddinfo record, @Param("example") DdinfoExample example);

    int updateByExample(@Param("record") Ddinfo record, @Param("example") DdinfoExample example);

    int updateByPrimaryKeySelective(Ddinfo record);

    int updateByPrimaryKeyWithBLOBs(Ddinfo record);

    int updateByPrimaryKey(Ddinfo record);
    //按照条件查询
    List<Ddinfo> Search(@Param("ddno")String ddno, @Param("memberid")String memberid, @Param("fhstatus")String fhstatus, @Param("ddstate")String ddstate);
    List<Ddinfo> searchReport(OrderPoiParam orderPoiParam);
    List<HashMap<String,Object>> shortageoOrderReport();
}