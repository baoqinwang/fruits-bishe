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
    @Test
    public void contextLoads2() {
        String a="{\"status\":\"0\",\"msg\":\"ok\",\"result\":{\"number\":\"3834246118530\",\"type\":\"YUNDA\",\"list\":[{\"time\":\"2019-04-25 15:15:53\",\"status\":\"【泉州市】已离开 福建晋江市公司；发往 福建晋江市公司新塘便利店分部\"},{\"time\":\"2019-04-25 11:53:19\",\"status\":\"【泉州市】已离开 福建晋江分拨中心；发往 福建晋江市公司\"},{\"time\":\"2019-04-25 08:44:02\",\"status\":\"【泉州市】已到达 福建晋江分拨中心\"},{\"time\":\"2019-04-24 00:33:49\",\"status\":\"【郑州市】已离开 河南郑州分拨中心；发往 福建晋江分拨中心\"},{\"time\":\"2019-04-24 00:32:36\",\"status\":\"【郑州市】已到达 河南郑州分拨中心\"},{\"time\":\"2019-04-23 18:23:17\",\"status\":\"【洛阳市】已离开 河南洛阳公司；发往 福建晋江分拨中心\"},{\"time\":\"2019-04-23 16:38:34\",\"status\":\"【洛阳市】河南洛阳公司 已揽收\"}],\"deliverystatus\":\"1\",\"issign\":\"0\",\"expName\":\"韵达快递\",\"expSite\":\"www.yundaex.com\",\"expPhone\":\"95546\",\"logo\":\"http:\\/\\/img3.fegine.com\\/express\\/yd.jpg\",\"courier\":\"\",\"courierPhone\":\"\"}}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(a);
        String msg = jsonObject.getString("msg");
        System.out.println(msg);
        JSONArray jsonArray = jsonObject.getJSONObject("result").getJSONArray("list");
        String s = jsonArray.toJSONString();
        System.out.println(s);

    }
}
