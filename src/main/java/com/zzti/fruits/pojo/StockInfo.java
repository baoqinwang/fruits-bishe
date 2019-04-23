package com.zzti.fruits.pojo;

public class StockInfo {
    private String goodsId;

    private Integer stockCount;

    private Integer holdCount;

    private Integer minStockCount;

    private String storageLocation;

    private String crtTlr;

    private String crtTm;

    private String upTlr;

    private String upTm;

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

    public String getCrtTm() {
        return crtTm;
    }

    public void setCrtTm(String crtTm) {
        this.crtTm = crtTm == null ? null : crtTm.trim();
    }

    public String getUpTlr() {
        return upTlr;
    }

    public void setUpTlr(String upTlr) {
        this.upTlr = upTlr == null ? null : upTlr.trim();
    }

    public String getUpTm() {
        return upTm;
    }

    public void setUpTm(String upTm) {
        this.upTm = upTm == null ? null : upTm.trim();
    }
}