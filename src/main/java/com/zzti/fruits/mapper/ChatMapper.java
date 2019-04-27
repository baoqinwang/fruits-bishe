package com.zzti.fruits.mapper;

import com.zzti.fruits.pojo.Chat;
import com.zzti.fruits.pojo.ChatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatMapper {
    int countByExample(ChatExample example);

    int deleteByExample(ChatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chat record);

    int insertSelective(Chat record);

    List<Chat> selectByExample(ChatExample example);

    Chat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chat record, @Param("example") ChatExample example);

    int updateByExample(@Param("record") Chat record, @Param("example") ChatExample example);

    int updateByPrimaryKeySelective(Chat record);

    int updateByPrimaryKey(Chat record);

    List<Chat> Search(@Param("memberid")String memberid,@Param("hfstate") String hfstate);
}