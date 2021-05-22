package com.groceryApp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.groceryApp.entities.Grocery;

@CrossOrigin("http://localhost:4200")
public interface GroceryRepository extends JpaRepository<Grocery,Long>{
  
	@RestResource(path="categoryid")
	Page<Grocery>findByCategoryId(@Param("id") Long id,Pageable pageble);
	
	@RestResource(path="searchbykeyword")
	Page<Grocery>findByNameContaining(@Param("name") String keyword,Pageable pageble);
	
}
