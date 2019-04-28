package com.zzti.fruits.pojogroup;

/*========================================================================= 
Copyright (C), 2015-2019, 中原工学院
description: 用户备份文本类
author: wangbaoqin
Date:2019/4/27  21:42 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class memberReduction {
    private  String fileName;
    private  String saveDate;
    private String size;


    public memberReduction(String fileName, String saveDate, String size) {
        this.fileName = fileName;
        this.saveDate = saveDate;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(String saveDate) {
        this.saveDate = saveDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
