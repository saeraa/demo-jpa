package com.example.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customer_id;

	@Column(name = "NAME")
	private String name;

	public long getCustomer_id () {
		return customer_id;
	}

	public void setCustomer_id (long customer_id) {
		this.customer_id = customer_id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}
}
