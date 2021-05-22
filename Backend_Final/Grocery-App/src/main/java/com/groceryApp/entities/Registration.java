package com.groceryApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_Id ;
	private String userName;
	private long phoneNo;
	private String email;
	private String password;
	private String address;
	
	public Registration() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(long user_Id, String userName, long phoneNo, String email, String password, String address) {
		super();
		this.user_Id = user_Id;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	

}
