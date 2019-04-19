package com.zzti.fruits.service;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Member;


import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 用户服务接口
author: wangbaoqin
Date:2019/4/1  19:43
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/1
encoding: UTF-8
version: 1.0
=========================================================================*/

public interface MemberService {
    /**
     * 返回全部列表
     * @return
     */
    public List<Member> findAll();

    /**
     * 分页
     * @param pageNum 当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(Member member, int pageNum, int pageSize);
}
