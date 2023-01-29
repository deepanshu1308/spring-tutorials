package com.dp.learning.restapidemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.dp.learning.restapidemo.domain.User;
import com.dp.learning.restapidemo.repository.UserRepository;

@Service
public class UserService {
 
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User addUsers(User user) {
		return userRepository.insert(user);
	}
}
