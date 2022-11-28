package com.example.demojpa.service;

import com.example.demojpa.model.Product;
import com.example.demojpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product addProduct (Product product) {
		return productRepository.save(product);
	}

	public Optional<Product> getProduct (Long id) {
		return productRepository.findById(id); //.getReferenceById(id)
	}
}
