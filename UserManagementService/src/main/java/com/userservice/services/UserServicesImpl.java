package com.userservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.dto.UserDto;
import com.userservice.model.User;
import com.userservice.repository.UserRepository;



@Service
//@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto getUser(int id) {
		UserDto userDto=null;
		Optional<User> user=userRepository.findById(id);
		userDto=new UserDto(user.get().getUserId(),user.get().getFirstName(),user.get().getMiddleName(), user.get().getLastName(),user.get().getAddress(),user.get().getEmail(),user.get().getPassword());
		return userDto;
	}

	@Override
	public UserDto saveUser(User user) {
		UserDto userDto=null;
		User user1=userRepository.save(user);
		userDto =new UserDto(user1.getUserId(),user1.getFirstName(), user1.getMiddleName(), user1.getLastName(), user1.getAddress(),user1.getEmail(),user1.getPassword());
		return userDto;
	}

	@Override
	public UserDto updateUser(User user) {
		UserDto userDto=null;
		User user1=userRepository.saveAndFlush(user);
		userDto =new UserDto(user1.getUserId(),user1.getFirstName(), user1.getMiddleName(), user1.getLastName(), user1.getAddress(),user1.getEmail(),user1.getPassword());
		return userDto;
	}

	@Override
	public boolean deleteUser(int id) {
			try {
				userRepository.deleteById(id);
				return true;
			}catch (Exception e) {
				return false;
			}
	}
}
