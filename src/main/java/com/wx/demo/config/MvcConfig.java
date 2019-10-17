package com.wx.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer ;

/**
 * @author wx
 */
public class MvcConfig implements WebMvcConfigurer {
	@Bean
	public WebMvcConfigurer webMvcConfigurerAdapter(){

		WebMvcConfigurer adapter = new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {

				registry.addViewController("/").setViewName("Login");
				registry.addViewController("Login.html").setViewName("Login");
			}
		};

		return adapter;
	}
}
