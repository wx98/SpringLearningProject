package com.wx.controller;

import com.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@Autowired
	UserService userService;

	public LoginController(){
	}

	@RequestMapping("/login")
	public String Login(){
		System.out.println("login---");


		userService.showAllUser();

		return "Login";
	}
}
