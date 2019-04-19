package com.zzti.fruits.configurer;

/*========================================================================= 
Copyright (C), 2015-2019, 中原工学院
description: 
author: wangbaoqin
Date:2019/4/18  22:41 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/18 
encoding: UTF-8
version: 1.0
=========================================================================*/

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //开启路径后缀匹配
        configurer.setUseRegisteredSuffixPatternMatch(true);
    }
}

