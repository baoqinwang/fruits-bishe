package com.zzti.fruits.service.iml;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.MemberMapper;
import com.zzti.fruits.pojo.Member;
import com.zzti.fruits.pojo.MemberExample;
import com.zzti.fruits.service.MemberService;
import com.zzti.fruits.util.DateUtils;
import com.zzti.fruits.util.RandomCharacterAndNumber;
import com.zzti.fruits.util.SnowflakeComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 用户服实现
author: wangbaoqin
Date:2019/4/1  19:51
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/1
encoding: UTF-8
version: 1.0
=========================================================================*/
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private SnowflakeComponent snowflakeComponent;
    @Override
    public List<Member> findAll() {
        MemberExample memberExample=new MemberExample();
        return memberMapper.selectByExample(memberExample);

    }

    @Override
    public PageResult findPage(Member member, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();

        if(member!=null){
            if(member.getUsername()!=null && member.getUsername().length()>0){
                criteria.andUsernameLike("%"+member.getUsername()+"%");
            }
            if(member.getRealname()!=null && member.getRealname().length()>0){
                criteria.andRealnameLike("%"+member.getRealname()+"%");
            }

        }

        Page<Member> page= (Page<Member>)memberMapper.selectByExample(memberExample);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(Member member) {
        System.out.println(snowflakeComponent.getInstance().nextId());
        member.setId(String.valueOf(snowflakeComponent.getInstance().nextId()));
         member.setSavetime(DateUtils.DT_DAY()+" "+DateUtils.times());
        member.setLoginerronum(0);
        member.setLockstatus("n");
        RandomCharacterAndNumber.getRandomCharacterAndNumber(6,2);
        memberMapper.insert(member);
    }

    @Override
    public void update(Member member) {
       memberMapper.updateByPrimaryKey(member);
    }

    @Override
    public Member findOne(String id) {
     return   memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String[] ids) {
        for(String id:ids){
            memberMapper.deleteByPrimaryKey(id);
        }
    }
}
