package com.zzti.fruits.pojo;

import java.util.Date;

public class StockInfo {
    private String goodsId;

    private Integer stockCount;

    private Integer holdCount;

    private Integer minStockCount;

    private String storageLocation;

    private String crtTlr;

    private Date crtTm;

    private String upTlr;

    private Date upTm;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getHoldCount() {
        return holdCount;
    }

    public void setHoldCount(Integer holdCount) {
        this.holdCount = holdCount;
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

    public String getCrtTlr() {
        return crtTlr;
    }

    public void setCrtTlr(String crtTlr) {
        this.crtTlr = crtTlr == null ? null : crtTlr.trim();
    }

    public Date getCrtTm() {
        return crtTm;
    }

    public void setCrtTm(Date crtTm) {
        this.crtTm = crtTm;
    }

    public String getUpTlr() {
        return upTlr;
    }

    public void setUpTlr(String upTlr) {
        this.upTlr = upTlr == null ? null : upTlr.trim();
    }

    public Date getUpTm() {
        return upTm;
    }

    public void setUpTm(Date upTm) {
        this.upTm = upTm;
    }
}