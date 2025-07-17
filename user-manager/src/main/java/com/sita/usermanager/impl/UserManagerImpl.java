package com.sita.usermanager.impl;

import org.springframework.stereotype.Service;

import com.sita.domain.User;
import com.sita.usermanager.UserManager;

@Service
public class UserManagerImpl implements UserManager {

	@Override
	public User findUserById(Long id) {
		return new User("TempUser");
	}

	@Override
	public User createUser(User user) {
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		
	}

}
