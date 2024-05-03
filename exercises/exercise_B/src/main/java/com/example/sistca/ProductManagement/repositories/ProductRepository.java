package com.example.sistca.ProductManagement.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.sistca.ProductManagement.model.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
        boolean existsByProductName(String productName);
        Product findByProductName(String productName);
}