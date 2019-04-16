package com.zzti.fruits.service;



import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.pojo.Sysuser;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/14  16:22 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/14 
encoding: UTF-8
version: 1.0
=========================================================================*/
public interface UserService {
  /**
   * 分页查询用户的方法
   */
  public PageResult findByPage(Sysuser sysuser,int pageNum,int pageSize);
}
