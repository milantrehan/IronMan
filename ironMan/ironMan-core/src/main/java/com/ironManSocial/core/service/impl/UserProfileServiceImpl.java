package com.ironManSocial.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ironManSocial.core.service.UserProfileService;
import com.ironManSocial.dao.UserDao;
import com.ironManSocial.dao.model.User;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserDao userDao;
	
	@Transactional
	public String save(User user) {
		
		System.out.println(" SERVICE IS WORKING:: SAVING USER");
		return userDao.create(user);
		
	}

	@Transactional
	public void updateUser(User user) {
		userDao.update(user);
	}

	
	public User getUser(String username) {
		return userDao.readUser(username);
	}

	@Transactional
	public void removeUser(User user) {
		userDao.delete(user);
	}

	public User findUser(String username) {
		return userDao.findUser(username);
	}

 
}
