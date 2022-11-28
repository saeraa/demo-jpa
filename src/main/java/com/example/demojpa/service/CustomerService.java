package com.example.demojpa.service;

import com.example.demojpa.model.Customer;
import com.example.demojpa.repository.CustomerRepository;
import com.example.demojpa.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private OrderRepository orderRepository;

	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	public Customer addCustomer (Customer customer) {
		return customerRepository.save(customer);
	}
}
