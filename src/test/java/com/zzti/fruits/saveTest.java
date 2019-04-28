package com.zzti.fruits;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 备份与恢复测试类
author: wangbaoqin
Date:2019/4/27  17:45 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class saveTest {
    @Test
    public void savetest() {
        String filePath = "D:\\";
        String dbName = "fruitsshop_db";
        try {
            Process process = Runtime.getRuntime().exec(
                    "cmd  /c mysqldump -h127.0.0.1 -P3306 -u root -proot " + dbName + " member > "
                            + filePath + "/" + "member" + new java.util.Date().getTime()
                            + ".sql");
            //备份的数据库名字为teacher，数据库连接和密码均为root
            System.out.println("success!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   @Test
    public void   resert(){
//       StringBuilder sb = new StringBuilder();
//       sb.append("mysql");
//       sb.append(" -h127.0.0.1");
//       sb.append(" -u"+"root");
//       sb.append(" -p"+"root");
//       sb.append(" "+"fruitsshop_db"+" <");
//       sb.append("D:\\member1556359920213.sql");
//       System.out.println("cmd命令为："+sb.toString());
       String command="mysql -h127.0.0.1 -uroot -proot fruitsshop_db <D:\\fruitsshop_db\\user20190428092515.sql";
       Runtime runtime = Runtime.getRuntime();
       System.out.println("开始还原数据");
       try {
           Process process = runtime.exec("cmd /c"+command);
           InputStream is = process.getInputStream();
           BufferedReader bf = new BufferedReader(new InputStreamReader(is,"utf8"));
           String line = null;
           while ((line=bf.readLine())!=null){
               System.out.println(line);
           }
           is.close();
           bf.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       System.out.println("还原成功！");
   }



}

