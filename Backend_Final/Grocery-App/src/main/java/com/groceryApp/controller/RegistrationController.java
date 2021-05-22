package com.groceryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.groceryApp.entities.Registration;
import com.groceryApp.service.RegistrationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/")
	public Registration saveRegistration(@RequestBody Registration registration ) {
		return registrationService.saveAll(registration);
	}
	
	@GetMapping("/{id}")
	public Registration findRegistrationById(@PathVariable("id") long id){
		return registrationService.findOneById(id);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public  List<Registration> listAllRegistration(Registration registration) {
		return registrationService.findAll(registration);
	}
	

}
