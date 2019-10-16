package com.wx.demo.controller;

import com.wx.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wx
 */
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
