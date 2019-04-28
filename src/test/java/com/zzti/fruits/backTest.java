package com.zzti.fruits;

import com.zzti.fruits.util.TransSize;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 查找路径下的sql文件
author: wangbaoqin
Date:2019/4/27  21:47 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class backTest {
    @Test
    public  void backTest(){
       File file=new File("D:\\fruitsshop_db\\");
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (!f.isDirectory()&&f.getName().endsWith(".sql")) {
                    String fileName = f.getName().substring(0,f.getName().length()-4);;
                    long lastModified = f.lastModified();
                    String format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(lastModified);
//                    long length = f.length();
                String length = TransSize.getPrintSize(f.length());
                    System.out.println(fileName+" "+format+" "+length);
                }
            }
        }
    }
}
