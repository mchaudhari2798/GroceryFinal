package com.groceryApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartId;
	private String productName;
	private String ProductUrl;
	private long quantity;
	private long price;
	
	public Cart() {
		
	}

	public Cart(long cartId, String productName, String productUrl, long quantity, long price) {
		super();
		this.cartId = cartId;
		this.productName = productName;
		ProductUrl = productUrl;
		this.quantity = quantity;
		this.price = price;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductUrl() {
		return ProductUrl;
	}

	public void setProductUrl(String productUrl) {
		ProductUrl = productUrl;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	
		
}
