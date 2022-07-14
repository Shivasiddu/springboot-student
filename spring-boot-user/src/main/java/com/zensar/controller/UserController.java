package com.zensar.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.User;

@RestController
@RequestMapping("/users-api")
public class UserController {

	private List<User> user = new ArrayList<User>();

	// http://localhost:1623/user-api/students -->GET
	public UserController() {
		user.add(new User(46186, "Ashish", "Jai Nagar", "Ram colony", "pune"));
	}

	@GetMapping(value = "/myusers/{userId}")
	public ResponseEntity<List<User>> getuser() {
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);

	}

}
