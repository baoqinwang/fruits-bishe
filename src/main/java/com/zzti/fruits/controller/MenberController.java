package com.zzti.fruits.controller;


import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Member;

import com.zzti.fruits.service.MemberService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/1  20:00
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/1
encoding: UTF-8
version: 1.0
=========================================================================*/
@RestController
@RequestMapping("/member")
public class MenberController {
   @Autowired
    private MemberService memberService;
    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Member> findAll(){
        return memberService.findAll();
    }
    /**
     * 查询+分页
     * @param member
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Member member, int page, int rows  ){
       return memberService.findPage(member, page, rows);
//        return null;
    }
}
