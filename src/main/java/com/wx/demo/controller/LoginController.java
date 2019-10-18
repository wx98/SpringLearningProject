package com.wx.demo.controller;

import com.wx.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
		try {
			if(userService.login(username,password) >= 0){
				System.out.println("登录成功");
				return "LoginSuccess";
			}else {
				return "Login";
			}
		}catch (EmptyResultDataAccessException e){
			return "Login";
		}

	}

	@GetMapping("/register")
	public String registerUser(){
		return "Register";
	}

	@PostMapping("/register")
	public String registerUser(@RequestParam("UserName")String userName,@RequestParam("PassWord1")String userPassword){
		System.out.println("register---");
		userService.registerUser(userName,userPassword);
		return "Login";
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
