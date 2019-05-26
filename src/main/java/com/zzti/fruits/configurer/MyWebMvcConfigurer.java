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
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //开启路径后缀匹配
        configurer.setUseRegisteredSuffixPatternMatch(true);
    }
}


//package com.zzti.fruits.configurer;
//
///*=========================================================================
//Copyright (C), 2015-2019, 中原工学院
//description:
//author: wangbaoqin
//Date:2019/4/18  22:41
//updateAuthor:  wangbaoqin
//updateDescription:
//updateDate: 2019/4/18
//encoding: UTF-8
//version: 1.0
//=========================================================================*/
//
//        import com.zzti.fruits.component.LoginHandlerInterceptor;
//        import org.springframework.context.annotation.Bean;
//        import org.springframework.context.annotation.Configuration;
//        import org.springframework.web.method.support.HandlerMethodArgumentResolver;
//        import org.springframework.web.servlet.LocaleResolver;
//        import org.springframework.web.servlet.config.annotation.*;
//        import sun.util.locale.provider.LocaleResources;
//
//        import java.util.List;
//
//@Configuration
//public class MyWebMvcConfigurer extends WebMvcConfigurerAdapter {
//    //implements WebMvcConfigurer
////    @Override
////    public void configurePathMatch(PathMatchConfigurer configurer) {
////        //开启路径后缀匹配
////        configurer.setUseRegisteredSuffixPatternMatch(true);
////    }
////    @Bean
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
//        WebMvcConfigurerAdapter adapter=new WebMvcConfigurerAdapter() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("index");
//                registry.addViewController("/index").setViewName("index");
//            }
//
////            @Override
////            public void addInterceptors(InterceptorRegistry registry) {
//////                super.addInterceptors(registry);
////                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
////                        .excludePathPatterns("/login.html","/login/check");
////            }
//        };
//
//        return adapter;
//    }
////    @Bean
////    public LocaleResolver localeResolver(){
////    return new mylo
////    }
////
//}



