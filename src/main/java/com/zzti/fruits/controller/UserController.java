package com.zzti.fruits.controller;


import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Sysuser;
import com.zzti.fruits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 用户信息
author: wangbaoqin
Date:2019/4/14  15:36 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/14 
encoding: UTF-8
version: 1.0
=========================================================================*/
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/findByPage")
    public ResponseEntity<PageResult<Sysuser>> findByPage( @RequestParam(value = "page", defaultValue = "1") Integer page,
                                                          @RequestParam(value = "rows", defaultValue = "5") Integer rows){
        Sysuser sysUser=new Sysuser();
        PageResult pageResult = userService.findByPage(sysUser, page, rows);
        if (pageResult == null || pageResult.getItems().size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(pageResult);
    }
}
