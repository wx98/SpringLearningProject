package com.wx.demo.service;

import com.wx.demo.dao.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.List;


/**
 * @author wx
 */
@Service
@ComponentScan
public class UserService {

	@Autowired
	IUser iUser;

	public void showAllUser(){
		List list =  iUser.allUser();
		for (Object s: list	) {
			LinkedCaseInsensitiveMap user = (LinkedCaseInsensitiveMap)s;
			System.out.println(
					"userId="+user.get("userId")+
					"\tuserName="+user.get("userName")+
					"\tuserPassword="+user.get("userPassword")+
					"\tuserType="+user.get("userType")
			);

		}
	}
}
