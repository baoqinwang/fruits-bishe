package com.zzti.fruits.controller;

import com.zzti.fruits.pojo.Chat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@RestController
@RequestMapping("/login")
public class LoginController {
    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/form")
    public String form(){
        return "login";
    }

}
