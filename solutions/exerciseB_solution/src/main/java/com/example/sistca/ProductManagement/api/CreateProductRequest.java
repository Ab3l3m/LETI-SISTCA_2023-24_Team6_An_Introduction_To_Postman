package com.example.sistca.ProductManagement.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreateProductRequest extends EditProductRequest{
 private String productId;
 private String productName;
 private String version;
}

