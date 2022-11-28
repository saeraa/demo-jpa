package com.example.demojpa.controller;

import com.example.demojpa.model.Product;
import com.example.demojpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("/product/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

}
