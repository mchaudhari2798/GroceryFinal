package com.groceryApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.groceryApp.entities.GroceryCategory;



@RepositoryRestResource(collectionResourceRel="groceryCategory",path="grocery-category")
public interface GroceryCategoryRepository extends JpaRepository<GroceryCategory,Long>{

}
