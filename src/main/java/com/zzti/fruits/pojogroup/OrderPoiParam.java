package com.zzti.fruits.pojogroup;

/*========================================================================= 
Copyright (C), 2015-2019, 中原工学院
description: 订单查询下载请求参数类
author: wangbaoqin
Date:2019/5/11  21:00 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/5/11 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class OrderPoiParam {
    private String beginTime;
    private String endTime;
    private String ddstate;

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDdstate() {
        return ddstate;
    }

    public void setDdstate(String ddstate) {
        this.ddstate = ddstate;
    }

    public OrderPoiParam(String beginTime, String endTime, String ddstate) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.ddstate = ddstate;
    }

    public OrderPoiParam() {
    }
}
