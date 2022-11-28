package com.example.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long product_id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PRICE")
	private double price;

	public Product () {
	}

	public long getProduct_id () {
		return product_id;
	}

	public void setProduct_id (long product_id) {
		this.product_id = product_id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public double getPrice () {
		return price;
	}

	public void setPrice (double price) {
		this.price = price;
	}
}
