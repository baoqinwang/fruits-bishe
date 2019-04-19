package com.zzti.fruits.controller;


import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;

import com.zzti.fruits.pojo.Member;
import com.zzti.fruits.service.MemberService;
import com.zzti.fruits.util.RandomCharacterAndNumber;
import com.zzti.fruits.util.SnowflakeComponent;
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
    /**
     * 增加
     * @param member
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Member member){
        try {
            member.setUserpassword(RandomCharacterAndNumber.getRandomCharacterAndNumber(6,2));
            memberService.add(member);
            return new Result(true, "增加成功,初始密码为："+member.getUserpassword());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }
    /**
     * 修改
     * @param member
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Member member){
        try {
            memberService.update(member);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public Member findOne(String id){
        return memberService.findOne(id);
    }
    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String [] ids){
        try {
            memberService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }
    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/resetPd")
    public Result resetPd(String id){
        try {
            String Password = memberService.resetPd(id);
            return new Result(true, "重置密码成功，密码为："+Password);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "重置密码失败");
        }
    }
}
