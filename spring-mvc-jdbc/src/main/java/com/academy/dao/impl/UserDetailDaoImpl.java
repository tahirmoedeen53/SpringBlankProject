package com.academy.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.transaction.annotation.Transactional;

import com.academy.dao.UserDetailDao;
import com.academy.model.UserDetail;
import com.academy.rowmapper.UserDetailRowMapper;

/*
 * This class is the implementation of the DAO. This class will communicate with the db to perform the CRUD operations. 
 */
public class UserDetailDaoImpl implements UserDetailDao {
	
	
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * This method will retrieve the user detail based on the id being provided. 
	 */
	@Transactional
	public UserDetail getUserDetail(int id) {
		
	}
	
	/*
	 * This method retrieves the details of all user from the database
	 */
	@Transactional
	public List<UserDetail> getAllUserDetail() {
		
	}
	
	/*
	 * This method adds a new user to the table user_detail
	 */
	@Transactional
	public int addUserDetail(UserDetail userDetail) {
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		simpleJdbcInsert.withTableName().usingGeneratedKeyColumns("id");
		Map<String, Object> parameters = new HashMap<String, Object>(4);
		
		Number insertedId = simpleJdbcInsert.executeAndReturnKey();
		return ;
		
	}
	
	/* 
	 * This method is used to update the details of a user. The user id will be used to get the user whose details will be updated
	 */
	@Transactional
	public int updateUserDetail(UserDetail userDetail) {
		
	}
	
	/*
	 * This method is used to delete a user. The user id will be used to delete the particular user
	 */
	@Transactional
	public int deleteUserDetail(int id) {
		
	}
}
