package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.UserDto;
import com.zensar.entity.User;
import com.zensar.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto getUser(int Id) {
		return userRepository.findById(Id).get();

	}

	@Override
	public UserDto createUser(User user) {

		return userRepository.findByuser(user).get();
	}
}