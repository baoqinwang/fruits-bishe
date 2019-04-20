package com.zzti.fruits.service;


import com.zzti.fruits.pojo.Protype;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 商品分类服务接口
author: wangbaoqin
Date:2019/4/7  19:18
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/19 
encoding: UTF-8
version: 1.0
=========================================================================*/
public interface ProTypeService {
    /**
     * 分页
     * @param parentId 上级id
     * @return
     */
    public List<Protype> findPage(String parentId);

    /**
     * 添加商品类型
     * @param protype
     */
    public  void add(Protype protype);

    /**
     * 查询单个商品分类
     * @param id
     * @return
     */
    Protype findOne(String id);

    /**
     * 修改商品分类
     * @param protype
     */
    void update(Protype protype);

    /**
     * 批量删除
     * @param ids
     */
    void delete(String[] ids);
}
