package com.zzti.fruits.service.iml;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzti.fruits.controller.MenberController;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.MemberMapper;
import com.zzti.fruits.pojo.Member;
import com.zzti.fruits.pojo.MemberExample;
import com.zzti.fruits.service.MemberService;
import com.zzti.fruits.util.DateUtils;
import com.zzti.fruits.util.ExcelUtils;
import com.zzti.fruits.util.RandomCharacterAndNumber;
import com.zzti.fruits.util.SnowflakeComponent;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

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
        criteria.andDelstatusEqualTo("0");
        memberExample.setOrderByClause("savetime DESC");
        Page<Member> page= (Page<Member>)memberMapper.selectByExample(memberExample);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(Member member) {
//        System.out.println(snowflakeComponent.getInstance().nextId());
        member.setId(String.valueOf(snowflakeComponent.getInstance().nextId()));
         member.setSavetime(DateUtils.DT_DAY()+" "+DateUtils.times());
        member.setLoginerronum(0);
        member.setLockstatus("n");
        member.setUserpassword("123456");
        member.setDelstatus("0");
        memberMapper.insert(member);
    }

    @Override
    public void update(Member member) {
       memberMapper.updateByPrimaryKeySelective(member);
    }

    @Override
    public Member findOne(String id) {
     return   memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String[] ids) {
        for(String id:ids){
            Member member = new Member();
            member.setId(id);
            member.setDelstatus("1");
            memberMapper.updateByPrimaryKeySelective(member);
        }
    }

    @Override
    public String resetPd(String id) {
        Member member = new Member();
        member.setId(id);
        member.setUserpassword("123456");
        memberMapper.updateByPrimaryKeySelective(member);
        return  member.getUserpassword();
    }

    @Override
    public PageResult findPoiPage(Member member, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();

        if(member!=null){
            if(member.getSheng()!=null && member.getSheng().length()>0){
                criteria.andShengEqualTo(member.getSheng());
            }
            if(StringUtils.isNotBlank(member.getShi())){
                criteria.andShiEqualTo(member.getShi());
            }
            if (StringUtils.isNotBlank(member.getIsgjhy())) {
                criteria.andIsgjhyEqualTo(member.getIsgjhy());
            }

        }
        criteria.andDelstatusEqualTo("0");
        memberExample.setOrderByClause("savetime DESC");
        Page<Member> page= (Page<Member>)memberMapper.selectByExample(memberExample);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void excelPoiSearch(String sheng,String shi, String isgjhy,HttpServletResponse response) {
        //查询出符合条件的结果集
        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
            if(StringUtils.isNotBlank(sheng)){
                criteria.andShengEqualTo(sheng);
            }
            if (StringUtils.isNotBlank(isgjhy)){
                criteria.andIsgjhyEqualTo(isgjhy);
            }
        if(StringUtils.isNotBlank(shi)){
            criteria.andShiEqualTo(shi);
        }
        List<Member> members = memberMapper.selectByExample(memberExample);
        List<String> head = new ArrayList<>();
        head.add("序号");
        head.add("用户名");
        head.add("姓名");
        head.add("性别");
        head.add("电话号码");
        head.add("出生日期");
        head.add("地址");
        head.add("所在省");
        head.add("所在市");
        head.add("是否会员");
        head.add("注册时间");
        List<List<String>> body = new ArrayList<>();
        int i=0;
        for (Member mem : members) {
            //新增人数
            i++;
            List<String> bodyValue = new ArrayList<>();
            bodyValue.add(String.valueOf(i+""));
            bodyValue.add(mem.getUsername());
            bodyValue.add(mem.getRealname());
            bodyValue.add(mem.getSex());
            bodyValue.add(mem.getTel());
            bodyValue.add(mem.getBrithtime());
            bodyValue.add(mem.getAddr());
            bodyValue.add(mem.getSheng());
            bodyValue.add(mem.getShi());
            if(StringUtils.isNotBlank(mem.getIsgjhy()))
            {
                if(mem.getIsgjhy().equals("y"))
                    bodyValue.add("是");
                else
                    bodyValue.add("否");
            }
            bodyValue.add(mem.getSavetime());
            //将数据添加到报表体中
            body.add(bodyValue);
        }
        ArrayList<String> last = new ArrayList<>();
        last.add("合计："+i+"人");
        body.add(last);
        String fileName = "用户信息统计.xls";
        HSSFWorkbook excel = ExcelUtils.expExcel(head,body);
        ExcelUtils.outFile(excel,"./"+fileName,response);

    }
    @Override
    public void regionReport(HttpServletResponse response){

        //设置表头
        List<String> head = new ArrayList<>();
        head.add("序号");
        head.add("省份");
        head.add("城市");
        head.add("数量");
        int i=0;
        List<List<String>> body = new ArrayList<>();
        List<HashMap<String, Object>> hashMaps = memberMapper.regionReport();
        for (HashMap<String,Object> map:
             hashMaps) {

           if(map.size()<3||!StringUtils.isNotBlank(String.valueOf(map.get("sheng")))||!StringUtils.isNotBlank(String.valueOf(map.get("shi"))))
               continue;
           i++;
            List<String> bodyValue = new ArrayList<>();
            bodyValue.add(String.valueOf(i+""));
            bodyValue.add((String)map.get("sheng"));
            bodyValue.add((String)map.get("shi"));
            Object num = map.get("num");
            String s = String.valueOf(num);

            bodyValue.add(s);
            body.add(bodyValue);
        }

        String fileName = "区域用户统计.xls";
        HSSFWorkbook excel = ExcelUtils.expExcel(head,body);
        ExcelUtils.outFile(excel,"./"+fileName,response);
    }
}
