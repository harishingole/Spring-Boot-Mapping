package com.crud.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.java.entity.User;
import com.crud.java.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo uRepo;

	public List<User> getAllUsers() {
		return uRepo.findAll();
	}

	public User createUsers(User user) {
		return uRepo.save(user);
	}
}
