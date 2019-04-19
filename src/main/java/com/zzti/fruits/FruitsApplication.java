package com.zzti.fruits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@MapperScan("com.zzti.fruits.mapper")
@SpringBootApplication
public class FruitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitsApplication.class, args);
	}
	/**
	 * 设置匹配*.action后缀请求
	 * @param dispatcherServlet
	 * @return
	 */
//	@Bean
//	public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
//		ServletRegistrationBean<DispatcherServlet> servletServletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet);
//		servletServletRegistrationBean.addUrlMappings("*.do");
//		return servletServletRegistrationBean;
//	}


}
