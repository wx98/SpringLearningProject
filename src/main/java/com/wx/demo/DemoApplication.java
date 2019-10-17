package com.wx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author wx
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.wx.demo.controller","com.wx.demo.dao","com.wx.demo.model","com.wx.demo.service"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("启动---");
	}

}
