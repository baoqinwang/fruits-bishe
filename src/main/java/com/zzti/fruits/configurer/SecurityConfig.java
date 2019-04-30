package com.zzti.fruits.configurer;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: springsecurity配置
author: wangbaoqin
Date:2019/4/27  11:14 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)//开启security注解
public class SecurityConfig  {
//extends WebSecurityConfigurerAdapter
//
//    @Autowired
//    private UserDetailsService userDetailsService;
////    @Autowired
////    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{
////        auth.userDetailsService(userDetailsService);
////    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin").password("123").roles("USER");
//
//    }
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        //解决静态资源被拦截的问题
//        web.ignoring().antMatchers("/css/**");
//        web.ignoring().antMatchers("/fonts/**");
//        web.ignoring().antMatchers("/img/**");
//        web.ignoring().antMatchers("/js/**");
//        web.ignoring().antMatchers("/lib/**");
//        web.ignoring().antMatchers("/plugins/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // TODO Auto-generated method stub
//        //super.configure(http);
//        http
//                .formLogin().loginPage("/login.html").defaultSuccessUrl("/index.html").failureUrl("/login-error").permitAll()  //表单登录，permitAll()表示这个不需要验证 登录页面，登录失败页面
//                .and()
//                .authorizeRequests().anyRequest().authenticated()
//                .and()
//                .csrf().disable();
//    }


}
