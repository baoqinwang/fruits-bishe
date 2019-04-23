package com.zzti.fruits;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/21  21:15 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/21 
encoding: UTF-8
version: 1.0
=========================================================================*/
public class jsonTest {
    @Test
    public void contextLoads() {
        String a="[{\"desc\":\"啊\",\"url\":\"http://192.168.25.133/group1/M00/00/00/wKgZhVy8bgCAcwylAADNjSJRaHc326.jpg\"},{\"desc\":\"vf\",\"url\":\"http://192.168.25.133/group1/M00/00/00/wKgZhVy8bgqAKZZxAADV9JLkp-s594.jpg\"}]";
        JSONArray json = (JSONArray) JSONArray.parse(a);
       String url=((JSONObject)json.get(0)).getString("url");
       System.out.print(url);
//        for (Object obj : json) {
//            JSONObject jo = (JSONObject)obj;
//            String desc = jo.getString("desc");
//            String url= jo.getString("url");
//            System.out.println("desc---" + desc + "---url---" + url);
//        }

    }
}
