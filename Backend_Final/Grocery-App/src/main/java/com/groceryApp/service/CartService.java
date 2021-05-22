package com.groceryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceryApp.entities.Cart;
import com.groceryApp.repository.CartRepositiory;


@Service
public class CartService {
	
	@Autowired
	private CartRepositiory cartRepositiory;
	
	public Cart saveAll(Cart cart) {
		return cartRepositiory.save(cart);
	}
	
	public List<Cart> findAll(Cart cart){
		return cartRepositiory.findAll();
	}
	
	public Cart DeleteById(long cartId){
		return cartRepositiory.deleteById(cartId);
	}
	
	
}
