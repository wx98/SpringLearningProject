package com.wx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class UserDao implements IUser{

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public UserDao(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		this.jdbcTemplate=new JdbcTemplate(dataSource);
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
