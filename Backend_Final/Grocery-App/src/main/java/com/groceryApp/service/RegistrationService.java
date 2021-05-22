package com.groceryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceryApp.entities.Registration;
import com.groceryApp.repository.RegistrationrRepository;



@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationrRepository registrationrRepository;
	
	public Registration saveAll(Registration registration) {
		return registrationrRepository.save(registration);
	}
	
	public Registration findOneById(long id) {
		return registrationrRepository.findById(id);
	}
	
	public List<Registration> findAll(Registration registration){
		return registrationrRepository.findAll();
	}
	
}
