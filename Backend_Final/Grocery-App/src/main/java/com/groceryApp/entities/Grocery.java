package com.groceryApp.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="tbl_gro")
public class Grocery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	
	@Column(name="unit_price")
	private BigDecimal unitprice;
	
	@Column(name="image_url")
	private String imgeurl;
	
	private boolean active;
	
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	@Column(name="date_created")
	private Date createdOn;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private GroceryCategory category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	public String getImgeurl() {
		return imgeurl;
	}

	public void setImgeurl(String imgeurl) {
		this.imgeurl = imgeurl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Grocery [id=" + id + ", name=" + name + ", description=" + description + ", unitprice=" + unitprice
				+ ", imgeurl=" + imgeurl + ", active=" + active + ", unitsInStock=" + unitsInStock + ", createdOn="
				+ createdOn + "]";
	}
	
	

	

}
