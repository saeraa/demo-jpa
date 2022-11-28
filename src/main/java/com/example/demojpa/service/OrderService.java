package com.example.demojpa.service;

import com.example.demojpa.model.Customer;
import com.example.demojpa.model.Order;
import com.example.demojpa.model.Product;
import com.example.demojpa.repository.CustomerRepository;
import com.example.demojpa.repository.OrderRepository;
import com.example.demojpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	public void addOrder (Order order) {
		orderRepository.save(order);
	}

	public Customer getCustomer(long customer_id) {
		return customerRepository.findById(customer_id).get();
	}

	public List<Product> getProduct(long product_id) {
		List<Product> tempList = new ArrayList<Product>();
		tempList.add(productRepository.findById(product_id).get());
		return tempList;
	}
}
