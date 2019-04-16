package com.zzti.fruits.service.iml;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.SysuserMapper;

import com.zzti.fruits.pojo.Sysuser;
import com.zzti.fruits.pojo.SysuserExample;

import com.zzti.fruits.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/14  16:47 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/14 
encoding: UTF-8
version: 1.0
=========================================================================*/
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private SysuserMapper sysuserMapper;

    @Override
    public PageResult findByPage(Sysuser sysuser,int pageNum,int pageSize){
        // 开始分页
        PageHelper.startPage(pageNum, pageSize);
        SysuserExample sysuserExample=new SysuserExample();
        SysuserExample.Criteria criteria = sysuserExample.createCriteria();
        if(sysuser.getTname()!=null && sysuser.getTname().length()>0){
            criteria.andTnameLike("%"+sysuser.getTname()+"%");
        }
        if(sysuser.getUname()!=null && sysuser.getUname().length()>0){
            criteria.andUnameLike("%"+sysuser.getUname()+"%");
        }
        Page<Sysuser> page = (Page<Sysuser>) sysuserMapper.selectByExample(sysuserExample);

        return new PageResult(page.getTotal(),page.getResult());

    }
}
