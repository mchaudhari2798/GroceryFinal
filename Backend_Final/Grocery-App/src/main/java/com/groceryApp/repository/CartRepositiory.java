package com.groceryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groceryApp.entities.Cart;

@Repository
public interface CartRepositiory extends JpaRepository<Cart,Long> {
	Cart deleteById(long cartId);

}
