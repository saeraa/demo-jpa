package com.example.demojpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long order_id;

	@OneToMany
	private List<Product> products;

	//@Column(name = "CUSTOMER")
	@OneToOne
	private Customer customer;



	public Order () {
	}

	public long getOrder_id () {
		return order_id;
	}

	public void setOrder_id (long order_id) {
		this.order_id = order_id;
	}

	public List<Product> getProducts () {
		return products;
	}

	public void setProducts (List<Product> products) {
		this.products = products;
	}


	public Customer getCustomer () {
		return customer;
	}

	public void setCustomer (Customer customer) {
		this.customer = customer;
	}


}
