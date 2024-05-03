package com.example.sistca.ProductManagement.services;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.example.sistca.ProductManagement.api.CreateProductRequest;
import com.example.sistca.ProductManagement.model.Product;


@Component
@Mapper(componentModel = "spring")
public abstract class EditProductMapper {
    public abstract Product create(CreateProductRequest request);
}