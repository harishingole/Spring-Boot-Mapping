package com.crud.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.java.entity.User;
import com.crud.java.service.UserService;
import com.crud.java.utils.BaseResponse;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public ResponseEntity<BaseResponse<List<User>>> getAllUsers(){
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<>(new BaseResponse<>(HttpStatus.OK.value(), "Success", users), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<BaseResponse<User>> createUser(@RequestBody User user){
		User users = userService.createUsers(user);
		return new ResponseEntity<>(new BaseResponse<>(HttpStatus.OK.value(), "Success", users), HttpStatus.OK);
	}

}
