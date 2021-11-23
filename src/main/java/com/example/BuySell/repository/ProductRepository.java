package com.example.BuySell.repository;

import com.example.BuySell.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductByTitle(String title);
}
