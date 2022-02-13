package com.academy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.academy.dao.UserDetailDao;
import com.academy.model.UserDetail;
import com.academy.service.UserDetailService;

/*
 * Service layer; facilitates communication between the controller and the persistence layer (DAO)
 */
public class UserDetailServiceImpl implements UserDetailService {
	@Autowired
	private UserDetailDao userDetailDao;
	
}
