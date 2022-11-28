package com.example.demojpa.repository;

import com.example.demojpa.model.Order;
import com.example.demojpa.model.Product;
import com.example.demojpa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
