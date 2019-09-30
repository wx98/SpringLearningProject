package com.wx.dao;

import java.util.List;

public interface IUser {
	/**
	 * 增
	 */
	void createUser();

	/**
	 * 删
	 */
	void deleteUser();

	/**
	 * 改
	 */
	void updateUser();

	/**
	 * 查
	 * @return
	 */
	List allUser();

	/**
	 * 根据用户名查找密码
	 * @param userName
	 */
	void usernameToFindPassword(String userName);

	/**
	 *  根据用户Id查找密码
	 * @param userID
	 */
	void useridToFindPassword(String userID);
}
