package com.zzti.fruits.util;

import java.util.Random;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 随机产生字符串
author: wangbaoqin
Date:2019/4/19  11:13 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/19 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class RandomCharacterAndNumber {
    /**
     * 产生随机密码
     * @param length 总长度
     * @param charCount 字符长度
     * @return
     */
    public static String getRandomCharacterAndNumber(int length,int charCount) {
        String val = "";
        Random random = new Random();
        int charc=0;
        //参数length，表示生成几位随机数
        for (int i = 0; val.length() < 6; i++) {
            //随机数由0-9，a-z,A-Z组成，数字占10个，字母占52个，数字、字母占比1:5（标准的应该是10:52）
            //random.nextInt(6) 0-5中6个数取一个
            String charOrNum = (random.nextInt(6)+6) % 6 >=1 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)&&charc<charCount) {
                //输出是大写字母还是小写字母，输出比例为1:1
                int temp = random.nextInt(2) % 2 == 0 ? 97 : 65;
                //char（65）-char(90) 为大写字母A-Z；char(97)-char(122)为小写字母a-z
                val += (char) (random.nextInt(26) + temp);
                charc++;
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            String str = getRandomCharacterAndNumber(6,2);
            System.out.println(str);

        }
    }
}
