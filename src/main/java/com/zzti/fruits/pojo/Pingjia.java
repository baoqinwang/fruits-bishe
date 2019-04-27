package com.zzti.fruits.pojo;

public class Pingjia {
    private Integer id;

    private String memberid;

    private String goodsid;

    private String content;

    private String savetime;

    private String sellerresponse;

    private String responsetm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime == null ? null : savetime.trim();
    }

    public String getSellerresponse() {
        return sellerresponse;
    }

    public void setSellerresponse(String sellerresponse) {
        this.sellerresponse = sellerresponse == null ? null : sellerresponse.trim();
    }

    public String getResponsetm() {
        return responsetm;
    }

    public void setResponsetm(String responsetm) {
        this.responsetm = responsetm == null ? null : responsetm.trim();
    }
}