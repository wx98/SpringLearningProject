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

	/**
	 *
	 * @return
	 */
	public List showAllUser(){
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
		return list;
	}

	public int registerUser(String username,String password){
		int result =  iUser.createUser(username,password,0);
		return result;
	}

	public int update(String userId,String userName,String userPassword,int userType){
		return iUser.updateUser(userId,userName,userPassword,userType);
	}

	public int delete(String userId){
		return iUser.deleteUser(userId);
	}
}
