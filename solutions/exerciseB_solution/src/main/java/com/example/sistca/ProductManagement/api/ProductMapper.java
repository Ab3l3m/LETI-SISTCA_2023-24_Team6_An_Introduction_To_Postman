package com.example.sistca.ProductManagement.api;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.example.sistca.ProductManagement.model.Product;

@Component
@Mapper(componentModel = "spring")
public abstract class ProductMapper {

    public abstract ProductDTO toProductDTO(Product product);
    public abstract Iterable<ProductDTO> toDTOList(Iterable<Product> products);
}
