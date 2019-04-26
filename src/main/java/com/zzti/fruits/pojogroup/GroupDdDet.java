package com.zzti.fruits.pojogroup;

/*========================================================================= 
Copyright (C), 2015-2019, 中原工学院
description: 组合订单信息
author: wangbaoqin
Date:2019/4/24  16:45 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/24 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class GroupDdDet {
    private String id;
    private String ddno;
    private String imgurl;
    private String goodname;
    private String price;
    private String num;
    private String totalMoney;

    public String getDdno() {
        return ddno;
    }

    public void setDdno(String ddno) {
        this.ddno = ddno;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupDdDet(String id, String ddno, String imgurl, String goodname, String price, String num, String totalMoney) {
        this.id = id;
        this.ddno = ddno;
        this.imgurl = imgurl;
        this.goodname = goodname;
        this.price = price;
        this.num = num;
        this.totalMoney = totalMoney;
    }
}
