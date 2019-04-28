package com.zzti.fruits.util;

/*========================================================================= 
Copyright (C), 2015-2019, 中原工学院
description: 字节转换
author: wangbaoqin
Date:2019/4/27  22:28 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class TransSize {
    /**
     * 字节 转换为B MB GB
     * @param size 字节大小
     * @return
     */
    public static String getPrintSize(long size){
        long rest = 0;
        if(size < 1024){
            return String.valueOf(size) + "B";
        }else{
            size /= 1024;
        }

        if(size < 1024){
            return String.valueOf(size) + "KB";
        }else{
            rest = size % 1024;
            size /= 1024;
        }

        if(size < 1024){
            size = size * 100;
            return String.valueOf((size / 100)) + "." + String.valueOf((rest * 100 / 1024 % 100)) + "MB";
        }else{
            size = size * 100 / 1024;
            return String.valueOf((size / 100)) + "." + String.valueOf((size % 100)) + "GB";
        }
    }

    public static void main(String[] args){
        System.out.println(getPrintSize(1200051733));
        System.out.println(getPrintSize(15522272));
        System.out.println(getPrintSize(123456));
        System.out.println(getPrintSize(1201));
        System.out.println(getPrintSize(1021));
    }
}
