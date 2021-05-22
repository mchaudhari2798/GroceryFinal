package com.groceryApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryApp.entities.User;
import com.groceryApp.repository.UserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/")
	public User SaveAll(@RequestBody User user) {
		return userRepository.save(user);
	}

}
