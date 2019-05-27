package com.zzti.fruits.controller;


import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.entity.Result;

import com.zzti.fruits.pojo.Member;
import com.zzti.fruits.pojogroup.memberReduction;
import com.zzti.fruits.service.MemberService;
import com.zzti.fruits.util.DateUtils;
import com.zzti.fruits.util.FileUtil;
import com.zzti.fruits.util.RandomCharacterAndNumber;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 用户控制层
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
    private static final Logger logger = LoggerFactory.getLogger(MenberController .class);
   @Autowired
    private MemberService memberService;
    @Value("${back.path}")
    private String backPath;
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
    /**
     * 用户信息备份
     * @return
     */
    @RequestMapping("/back")
    public Result back()
    {
       logger.info("开始数据备份");
        String dbName = "fruitdb";
        try {
            Process process = Runtime.getRuntime().exec(
                    "cmd  /c mysqldump -h47.101.63.178 -P3306 -u root -proot " + dbName + " member > "
                            + backPath + "/" + "user" + DateUtils.getCurTimestampStryyyyMMddHHmmss()
                            + ".sql");
            //备份的数据库名字为teacher，数据库连接和密码均为root
            logger.info("数据备份结束");
            return  new Result(true, "备份成功");
        }catch (IOException e) {
            e.printStackTrace();
            return new Result(false, "备份失败");
        }
    }
    /**
     * 用户信息备份查找
     * @return
     */
    @RequestMapping("/backList")
    public List<memberReduction> backList()
    {
        ArrayList<memberReduction> list =new ArrayList<memberReduction>();
        FileUtil.getFieList(backPath,list);
        return  list;

    }
    /**
     * 用户信息还原
     * @return
     */
    @RequestMapping("/reduction")
    public Result reduction(String fileName)
    {
        logger.info("开始用户信息还原");
        String command="mysql -h47.101.63.178 -uroot -proot fruitdb <"+backPath+fileName+".sql";
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("cmd /c"+command);
            InputStream is = process.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(is,"utf8"));
            String line = null;
            while ((line=bf.readLine())!=null){
                System.out.println(line);
            }
            is.close();
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
            logger.info("还原失败！");
            return  new Result(false, "还原失败！");
        }
        logger.info("还原成功！");
        return  new Result(true, "还原成功！");
    }
    /**
     * 查询报表+分页
     * @param member
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findPoiPage")
    public PageResult findPoiPage(@RequestBody Member member, int page, int rows  ){
        return memberService.findPoiPage(member, page, rows);
//        return null;
    }

    /**
     * 查询报表下载
     * @param sheng
     * @param shi
     * @param isgjhy
     * @param response
     */
    @RequestMapping("/excelPoiSearch")
    public void excelPoiSearch(String sheng,String shi, String isgjhy, HttpServletResponse response){
       memberService.excelPoiSearch(sheng,shi,isgjhy,response);
    }

    /**
     * 区域报表统计
     * @param response
     */
    @RequestMapping("/regionReport")
    public void regionReport(HttpServletResponse response){
        memberService.regionReport(response);
    }
}
