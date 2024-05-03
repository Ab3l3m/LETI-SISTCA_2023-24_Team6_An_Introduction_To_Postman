package com.example.sistca.ProductManagement.services;


import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sistca.ProductManagement.api.CreateProductRequest;
import com.example.sistca.ProductManagement.model.Product;
import com.example.sistca.ProductManagement.repositories.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {


    private ProductRepository repository;
    private EditProductMapper productEditMapper;

    @Autowired
    public ProductServiceImp(ProductRepository repository, EditProductMapper productEditMapper) {
        this.repository = repository;
        this.productEditMapper = productEditMapper;
    }


    @Override
    @Transactional
    public Product createProduct(final CreateProductRequest resource) {
        if (repository.existsByProductName(resource.getProductName())) {
            throw new IllegalArgumentException("A product with the provided name already exists.");
        }
        final Product product = productEditMapper.create(resource);

        return repository.save(product);
    }

    public Iterable<Product> findAll() {
        return repository.findAll();
    }
}