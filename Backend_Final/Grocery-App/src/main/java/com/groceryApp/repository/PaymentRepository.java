package com.groceryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groceryApp.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
	Payment deleteById(long Card_id);
	

}
