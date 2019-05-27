package com.zzti.fruits.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 异常枚举
author: wangbaoqin
Date:2019/4/27  20:41 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    CHILD_PROTYE_NOT_NULL(300,"存在下级分类，不可直接删除"),
    PROTYE_GOODS_NOT_NULL(301,"分类下存在商品，不可直接删除"),

    PRICE_CANNOT_BE_NULL(400, "价格不能为空"),
    CATEGORY_NOT_FOUND(404, "商品分类没有找到"),
    SPEC_GROUP_NOT_FOUND(404, "商品规格组没有查到"),
    BRAND_SAVE_ERROR(500, "新增品牌失败"),
    GOODS_SAVE_ERROR(500, "新增商品失败"),
    BRAND_NOT_FOUND(404, "品牌没有找到"),
    UPLOAD_FILE_ERROR(500, "文件上传失败"),
    INVALID_FILE_TYPE(400, "无效文件类型"),
    SPEC_PARAM_NOT_FOUND(404, "商品规格参数不存在"),
    GOODS_NOT_FOUND(404, "商品不存在"),
    SPU_DETAIL_NOT_FOUND(404, "商品详情不存在"),
    GOODS_SKU_NOT_FOUND(404, "sku没有找到");

    private int code;
    private String msg;
}
