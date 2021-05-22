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
import com.groceryApp.entities.Payment;
import com.groceryApp.service.PaymentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/")
	public Payment SavePayment(@RequestBody Payment payment) {
		return paymentService.saveAll(payment);
	}
	
	@GetMapping("/all")
	@ResponseBody 
	public  List<Payment> listAllRegistration(Cart cart) {
		return paymentService.findAll(cart);
	}
	
	@DeleteMapping("/{Card_id}")
	public Payment Deletecard(@PathVariable("Card_id") long Card_id) {
		return paymentService.Delete(Card_id);
			
	}
	
	
}


