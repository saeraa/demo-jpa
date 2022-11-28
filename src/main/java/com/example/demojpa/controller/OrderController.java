package com.example.demojpa.controller;

import com.example.demojpa.model.Order;
import com.example.demojpa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders")
	public List<Order> getOrders() {
		return orderService.getOrders();
	}

	@PostMapping("/addOrder/{customer_id}/{product_id}")
	public void addOrder(@PathVariable long customer_id, @PathVariable long product_id) {
		Order tempOrder = new Order();
		tempOrder.setCustomer(orderService.getCustomer(customer_id));
		tempOrder.setProducts(orderService.getProduct(product_id));
		orderService.addOrder(tempOrder);
	}

//	@PostMapping("/createOrder")
//	public void createOrder(@RequestBody Order order) {
//		orderService.addOrder(order);
//	}
}
