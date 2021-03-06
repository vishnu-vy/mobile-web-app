package com.vishnu.vy.mobilewebapp.ws.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vishnu.vy.mobilewebapp.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto userDto);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String id, UserDto userDto);
	void deleteUser(String id);
	List<UserDto> getUsers(int page, int limit);
}
