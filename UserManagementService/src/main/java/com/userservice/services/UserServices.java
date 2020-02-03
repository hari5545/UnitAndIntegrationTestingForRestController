package com.userservice.services;

import com.userservice.dto.UserDto;
import com.userservice.model.User;


public interface UserServices {
	
    UserDto getUser(int id);
    UserDto saveUser(User user);
    UserDto updateUser(User user);
    boolean deleteUser(int id);
}
