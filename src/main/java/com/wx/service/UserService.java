package com.wx.service;

import com.wx.dao.IUser;
import com.wx.dao.UserDao;
import com.wx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.List;

@Service
public class UserService {

	public void showAllUser(){


		IUser iUser = new UserDao();

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
