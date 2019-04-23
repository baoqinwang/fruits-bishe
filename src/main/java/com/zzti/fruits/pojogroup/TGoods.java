package com.zzti.fruits.pojogroup;

import java.io.Serializable;
import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 组合商品
author: wangbaoqin
Date:2019/4/21  18:37 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/21 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class TGoods implements Serializable {
    /**
     * 内部类
     */
    class ImgUrl{
       private  String desc;
       private String url;
        public ImgUrl(){}
        public ImgUrl(String desc, String url) {
            this.desc = desc;
            this.url = url;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
    private Integer id;

    private String goodno;

    private String goodname;

    private String fid;

    private String sid;

    private String goodpp;

    private String price;

    private String tprice;

    private String istj;

    private String delstatus;

    private String savetime;

    private String filename1;

    private String filename2;

    private String filename3;

    private String filename4;

    private String isshelf;

    private String shelfbegin;

    private String shelfend;

    private List<ImgUrl> imgurl;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodno() {
        return goodno;
    }

    public void setGoodno(String goodno) {
        this.goodno = goodno;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getGoodpp() {
        return goodpp;
    }

    public void setGoodpp(String goodpp) {
        this.goodpp = goodpp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTprice() {
        return tprice;
    }

    public void setTprice(String tprice) {
        this.tprice = tprice;
    }

    public String getIstj() {
        return istj;
    }

    public void setIstj(String istj) {
        this.istj = istj;
    }

    public String getDelstatus() {
        return delstatus;
    }

    public void setDelstatus(String delstatus) {
        this.delstatus = delstatus;
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime;
    }

    public String getFilename1() {
        return filename1;
    }

    public void setFilename1(String filename1) {
        this.filename1 = filename1;
    }

    public String getFilename2() {
        return filename2;
    }

    public void setFilename2(String filename2) {
        this.filename2 = filename2;
    }

    public String getFilename3() {
        return filename3;
    }

    public void setFilename3(String filename3) {
        this.filename3 = filename3;
    }

    public String getFilename4() {
        return filename4;
    }

    public void setFilename4(String filename4) {
        this.filename4 = filename4;
    }

    public String getIsshelf() {
        return isshelf;
    }

    public void setIsshelf(String isshelf) {
        this.isshelf = isshelf;
    }

    public String getShelfbegin() {
        return shelfbegin;
    }

    public void setShelfbegin(String shelfbegin) {
        this.shelfbegin = shelfbegin;
    }

    public String getShelfend() {
        return shelfend;
    }

    public void setShelfend(String shelfend) {
        this.shelfend = shelfend;
    }

    public List<ImgUrl> getImgurl() {
        return imgurl;
    }

    public void setImgurl(List<ImgUrl> imgurl) {
        this.imgurl = imgurl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TGoods() {
    }

    public TGoods(Integer id, String goodno, String goodname, String fid, String sid, String goodpp, String price, String tprice, String istj, String delstatus, String savetime, String filename1, String filename2, String filename3, String filename4, String isshelf, String shelfbegin, String shelfend, List<ImgUrl> imgurl, String content) {
        this.id = id;
        this.goodno = goodno;
        this.goodname = goodname;
        this.fid = fid;
        this.sid = sid;
        this.goodpp = goodpp;
        this.price = price;
        this.tprice = tprice;
        this.istj = istj;
        this.delstatus = delstatus;
        this.savetime = savetime;
        this.filename1 = filename1;
        this.filename2 = filename2;
        this.filename3 = filename3;
        this.filename4 = filename4;
        this.isshelf = isshelf;
        this.shelfbegin = shelfbegin;
        this.shelfend = shelfend;
        this.imgurl = imgurl;
        this.content = content;
    }
}
