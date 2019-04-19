package com.zzti.fruits.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/19  10:23 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/19 
encoding: UTF-8
version: 1.0
=========================================================================*/
@Slf4j
@Component
public class SnowflakeComponent {
    @Value("${server.datacenterId}")
    private long datacenterId;

    @Value("${server.workId}")
    private long workId;
    private static volatile IdWorker instance;

    public IdWorker getInstance() {
        if (instance == null) {
            synchronized (IdWorker.class) {
                if (instance == null) {
                    log.info("when instance, workId = {}, datacenterId = {}", workId, datacenterId);
                    instance = new IdWorker(workId, datacenterId);
                }
            }
        }
        return instance;
    }

}
