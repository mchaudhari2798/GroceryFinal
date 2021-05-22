package com.groceryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groceryApp.entities.Registration;



@Repository
public interface RegistrationrRepository extends JpaRepository<Registration, Long > {
	Registration findById(long id);
	
}
