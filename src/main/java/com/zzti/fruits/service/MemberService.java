package com.zzti.fruits.service;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Member;


import javax.servlet.http.HttpServletResponse;
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

    /**
     * 新增用户
     * @param member
     */
    public void add(Member member);
    /**
     * 修改
     */
    public void update(Member member);
    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public Member findOne(String id);
    /**
     * 批量删除
     * @param ids
     */
    public void delete(String [] ids);

    /**
     * 重置密码
     * @param id
     * @return 密码信息
     */
    public String resetPd(String id);

    /**
     * 报表分页查询
     * @param member
     * @param page
     * @param rows
     * @return
     */
    PageResult findPoiPage(Member member, int page, int rows);

    /**
     * 按照查询条件进行报表下载
     * @param member
     * @return
     */
    void excelPoiSearch(String sheng,String shi, String isgjhy,HttpServletResponse response);

    /**
     * 地区用户报表查找
     */
    public void regionReport(HttpServletResponse response);
}
