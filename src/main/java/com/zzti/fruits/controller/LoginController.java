package com.zzti.fruits.controller;

import com.zzti.fruits.pojo.Chat;
import com.zzti.fruits.pojo.Sysuser;
import com.zzti.fruits.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/27  11:18 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private SysuserService sysuserService;
//    /**
//     * 返回全部列表
//     * @return
//     */
//    @RequestMapping("/form")
//    public String form(){
//        return "login";
//    }
    @RequestMapping("/check")
    public String check(String userName, String passWord, Map<String,Object> map, HttpSession session){
        Sysuser sysuser = sysuserService.check(userName, passWord);
         if(sysuser!=null) {
             session.setAttribute("loginUser",sysuser);
             map.put("loginNam",sysuser.getUname());
             return "redirect:/index.html";
         }
        else
         {
           map.put("msg","账号或密码错误");
           return "login.html";
         }

    }
}
