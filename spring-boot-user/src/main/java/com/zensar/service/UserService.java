package com.zensar.service;

import com.zensar.dto.UserDto;
import com.zensar.entity.User;

public interface UserService {

	public UserDto getUser(int Id);

	public UserDto createUser(User user);

}
