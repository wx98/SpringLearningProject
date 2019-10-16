package com.wx.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wx
 */
@Repository
public class UserDao implements com.wx.demo.dao.IUser {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	private void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}


	/**
	 * 查询user表中所有内容
	 * @return
	 */
	@Override
	public List allUser() {
		String sql="select * from user;";
		List userList = jdbcTemplate.queryForList(sql);
		return userList;
	}

	/**
	 * 创建一个用户
	 * @return
	 */
	@Override
	public int createUser(String username,String password ,int type) {
		String sql = "insert into user (userName,userPassword,userType) values(?,?,?)";
		return jdbcTemplate.update(sql, username,password,type);
	}

	/**
	 * 根据userId删除一个用户
	 */
	@Override
	public int deleteUser(String userId) {
		String sql = "delete from user where userId = ?";
		return jdbcTemplate.update(sql,userId);
	}

	/**
	 * 修改User信息
	 */
	@Override
	public int updateUser(String userId,String username,String password ,int type) {
		String sql = "update user set userName = ?, userPassword = ?,userType = ? where userId = ?";
		return jdbcTemplate.update(sql,username,password,type,userId);
	}
}
