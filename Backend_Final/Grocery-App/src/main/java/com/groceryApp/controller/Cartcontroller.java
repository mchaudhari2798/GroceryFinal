package com.groceryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.groceryApp.entities.Cart;
import com.groceryApp.service.CartService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Cart")
public class Cartcontroller {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/")
	public Cart saveRegistration(@RequestBody Cart cart ) {
		return cartService.saveAll(cart);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public  List<Cart> listAllRegistration(Cart cart) {
		return cartService.findAll(cart);
	}
	
	
	@DeleteMapping("/{cartId}")
	public Cart DeleteEmployee(@PathVariable("cartId") long cartId) {
		return cartService.DeleteById(cartId);
	}
	
	
	
}

