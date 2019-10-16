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

	@Override
	public List allUser() {
		String sql="select * from user;";
		List userList = jdbcTemplate.queryForList(sql);
		return userList;
	}

	@Override
	public void usernameToFindPassword(String userName) {

	}

	@Override
	public void useridToFindPassword(String userID) {

	}

	@Override
	public void createUser() {

	}

	@Override
	public void deleteUser() {

	}

	@Override
	public void updateUser() {

	}
}
