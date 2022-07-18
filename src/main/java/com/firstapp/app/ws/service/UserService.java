package com.firstapp.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.firstapp.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{

	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	UserDto getByUserId(String userId);
	UserDto updateUser(String userId,UserDto user);
}
