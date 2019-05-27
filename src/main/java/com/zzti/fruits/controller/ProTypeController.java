package com.zzti.fruits.controller;

import com.zzti.fruits.Exception.FruitsException;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.enums.ExceptionEnum;
import com.zzti.fruits.pojo.Protype;
import com.zzti.fruits.service.ProTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/19  19:27 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/19 
encoding: UTF-8
version: 1.0
=========================================================================*/
@RestController
@RequestMapping("/protype")
public class ProTypeController {
    @Autowired
    private ProTypeService proTypeService;
    /**
     * List<Protype>
     * @param parentId
     * @return
     */
    @RequestMapping("/findByParentId")
    public List<Protype> search(String parentId ){
        return proTypeService.findPage(parentId);
//        return null;
    }
    /**
     * 增加
     * @param protype
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Protype protype){
        try {

            proTypeService.add(protype);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }
    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public Protype findOne(String id){
        return  proTypeService.findOne(id);
    }
    /**
     * 修改
     * @param protype
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Protype protype){
        try {
            proTypeService.update(protype);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }
    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(String [] ids){
        try {
            proTypeService.delete(ids);
            return new Result(true, "删除成功");
        }catch (FruitsException e){
            return new Result(false, e.getExceptionEnum().getMsg());
        }
        catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询所有分类
     * @return
     */
    @RequestMapping("/findAll")
    public List<Protype> findAll(){
       return proTypeService.findAll();
    }
}
