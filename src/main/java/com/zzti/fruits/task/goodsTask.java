package com.zzti.fruits.task;

import com.zzti.fruits.mapper.GoodsMapper;
import com.zzti.fruits.pojo.Goods;
import com.zzti.fruits.util.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 商品定时检查商家/下架
author: wangbaoqin
Date:2019/4/27  15:27 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
@Component
public class goodsTask {
    private static final Logger logger = LoggerFactory.getLogger(goodsTask.class);
    @Autowired
    private GoodsMapper goodsMapper;

    @Scheduled(cron = "0 0 0 * * ?")
    public  void goodsUpdate()
    {
        logger.info("执行了定时任务，开始商品上架/下架");
        List<Goods> goods = goodsMapper.selectByExample(null);
         for (Goods good:goods){
        if(StringUtils.isNotBlank(good.getIsshelf())){
            //判断当前时间与上架时间的比较  返回1大于，返回-1小于，开始时间为空也不上架
            int beginResult=StringUtils.isNotBlank(good.getShelfbegin())?DateUtils.result(DateUtils.getCurrentDateTime(),good.getShelfbegin()):-1;
            //判断当前时间与下架时间的比较，返回1大于，返回-1小于，下架时间为空也不下架
            int endResult =StringUtils.isNotBlank(good.getShelfend())?DateUtils.result(DateUtils.getCurrentDateTime(), good.getShelfend()):-1;
            if("00".equals(good.getIsshelf())){
                if(endResult>0)
                {
                    good.setShelfend(DateUtils.getCurrentDateTime());
                    good.setIsshelf("01");
                    goodsMapper.updateByPrimaryKeySelective(good);
                }
            }else if("02".equals(good.getIsshelf())){
                if(beginResult>0&&endResult<0) {
                    good.setShelfbegin(DateUtils.getCurrentDateTime());
                    good.setIsshelf("00");
                    goodsMapper.updateByPrimaryKeySelective(good);
                }

            }
        }
         }
         logger.info("上/下架批量完成");
    }
}
