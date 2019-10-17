package com.wx.demo.dao;

import java.util.List;

/**
 * @author wx
 */
public interface IUser {
	/**
	 * 增
	 * @param username 用户名
	 * @param password 密码
	 * @param type  用户类型
	 * @return
	 */
	int createUser(String username,String password ,int type);

	/**
	 * 根据用户的userid删除一条角色信息
	 * @param userId
	 * @return
	 */
	int deleteUser(String userId);

	/**
	 * 根据用户的userid删除一条角色信息
	 * @param userId
	 * @param username
	 * @param password
	 * @param type
	 * @return
	 */
	int updateUser(String userId,String username,String password ,int type);

	/**
	 * 查
	 * @return
	 */
	List allUser();

	/**
	 * 检查登录
	 * @param useName
	 * @param userPassword
	 * @return
	 */
	int checkLogin(String useName,String userPassword);
}
