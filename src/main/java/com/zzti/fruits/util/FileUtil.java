package com.zzti.fruits.util;

import com.zzti.fruits.pojogroup.memberReduction;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Logger;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/27  22:52 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class FileUtil {
    public static List<memberReduction> getFieList(String path,List<memberReduction> list){
        File file=new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (!f.isDirectory()&&f.getName().endsWith(".sql")) {
                    String fileName = f.getName().substring(0,f.getName().length()-4);;
                    long lastModified = f.lastModified();
                    String formatDate = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(lastModified);
//                    long length = f.length();
                    String length = TransSize.getPrintSize(f.length());
                    System.out.println(fileName+" "+formatDate+" "+length);
                   list.add(new memberReduction(fileName,formatDate,length));
                }
            }
        }
        return  list;
    }
}
