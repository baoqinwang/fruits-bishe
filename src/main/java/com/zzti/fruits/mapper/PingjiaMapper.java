package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.Chat;
import com.zzti.fruits.pojo.Pingjia;
import com.zzti.fruits.pojo.PingjiaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PingjiaMapper {
    int countByExample(PingjiaExample example);

    int deleteByExample(PingjiaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pingjia record);

    int insertSelective(Pingjia record);

    List<Pingjia> selectByExample(PingjiaExample example);

    Pingjia selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pingjia record, @Param("example") PingjiaExample example);

    int updateByExample(@Param("record") Pingjia record, @Param("example") PingjiaExample example);

    int updateByPrimaryKeySelective(Pingjia record);

    int updateByPrimaryKey(Pingjia record);
    List<Pingjia> Search(@Param("memberid")String memberid, @Param("goodsid") String goodsid);
}