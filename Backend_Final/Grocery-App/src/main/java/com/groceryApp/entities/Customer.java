//package com.groceryApp.entities;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Customer {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private String customerId;
//	private String firstName;
//	private String lastName;
//	private String customerPhone;
//	
//	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId")
//	private User users;
//	
//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Customer(String customerId, String firstName, String lastName, String customerPhone) {
//		super();
//		this.customerId = customerId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.customerPhone = customerPhone;
//	}
//	
//	public String getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(String customerId) {
//		this.customerId = customerId;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getCustomerPhone() {
//		return customerPhone;
//	}
//	public void setCustomerPhone(String customerPhone) {
//		this.customerPhone = customerPhone;
//	}
//	
//	
//
//}
