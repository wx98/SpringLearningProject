package com.wx.demo.controller;

import com.wx.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author wx
 */
@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	UserService userService;

	public LoginController(){

	}

	@GetMapping(value="/login")
	public String Login(){
		return "Login";
	}

	@PostMapping(value="/login")
	public String Login(@RequestParam("myUserName") String username,@RequestParam("myPassWord")String password){
		System.out.println("login---username:"+username+",password:"+password);
		if(userService.login(username,password)>0){
			System.out.println("登录成功");
			return "LoginSuccess";
		}
		return "Login";
	}

	@RequestMapping("/register")
	public String registerUser(String userName,String userPassword){
		System.out.println("register---");
		userService.registerUser(userName,userPassword);
		return "Register";
	}

	@RequestMapping("/delete")
	public String deleteUser(String userId){
		System.out.println("delete---");
		userService.delete(userId);
		return "Delete";
	}

	@RequestMapping("/update")
	public String updateUser(String userId,String userName,String userPassword,int userType){
		System.out.println("update---");
		userService.update(userId,userName,userPassword,userType);
		return "Update";
	}
}
