package com.zzti.fruits.pojogroup;

import java.io.Serializable;
import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 组合库存信息
author: wangbaoqin
Date:2019/4/21  18:37 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/21 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class GroupStockInfo implements Serializable
{
    private String id;
    private String goodName;
    private String fname;
    private String sname;
    private Integer stockCount;



    private Integer minStockCount;

    private String storageLocation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getMinStockCount() {
        return minStockCount;
    }

    public void setMinStockCount(Integer minStockCount) {
        this.minStockCount = minStockCount;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }


}
