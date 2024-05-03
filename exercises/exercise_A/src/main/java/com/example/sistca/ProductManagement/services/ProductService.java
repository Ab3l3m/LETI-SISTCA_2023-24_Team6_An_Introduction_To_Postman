package com.example.sistca.ProductManagement.services;

import com.example.sistca.ProductManagement.api.CreateProductRequest;
import com.example.sistca.ProductManagement.model.Product;

public interface ProductService {
    Product createProduct(CreateProductRequest resource);
}
