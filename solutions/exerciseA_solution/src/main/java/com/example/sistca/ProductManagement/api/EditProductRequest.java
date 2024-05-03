package com.example.sistca.ProductManagement.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditProductRequest{
    private String productName;
    private String productDescription;
    private String productCategory;
    private int productQuantity;
    private String productBrand;
    private String productMaterial;
}
