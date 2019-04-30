package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.StockInfo;
import com.zzti.fruits.pojo.StockInfoExample;
import com.zzti.fruits.pojogroup.GroupStockInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockInfoMapper {
    int countByExample(StockInfoExample example);

    int deleteByExample(StockInfoExample example);

    int deleteByPrimaryKey(String goodsId);

    int insert(StockInfo record);

    int insertSelective(StockInfo record);

    List<StockInfo> selectByExample(StockInfoExample example);

    StockInfo selectByPrimaryKey(String goodsId);

    int updateByExampleSelective(@Param("record") StockInfo record, @Param("example") StockInfoExample example);

    int updateByExample(@Param("record") StockInfo record, @Param("example") StockInfoExample example);

    int updateByPrimaryKeySelective(StockInfo record);

    int updateByPrimaryKey(StockInfo record);
    List<GroupStockInfo> Search(@Param("goodname")String goodname, @Param("fid")String fid, @Param("sid")String sid);

    List<GroupStockInfo>  searchPoi(@Param("stockCount")String stockCount, @Param("fid")String fid, @Param("sid")String sid);
}