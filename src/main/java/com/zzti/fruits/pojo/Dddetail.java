package com.zzti.fruits.pojo;

public class Dddetail {
    private Integer id;

    private String ddno;

    private String goodsid;

    private String num;

    private String memberid;

    private String fkstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDdno() {
        return ddno;
    }

    public void setDdno(String ddno) {
        this.ddno = ddno == null ? null : ddno.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    public String getFkstatus() {
        return fkstatus;
    }

    public void setFkstatus(String fkstatus) {
        this.fkstatus = fkstatus == null ? null : fkstatus.trim();
    }
}