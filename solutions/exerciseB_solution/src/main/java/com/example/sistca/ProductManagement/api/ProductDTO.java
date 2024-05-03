package com.example.sistca.ProductManagement.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "A Product")
public class ProductDTO {

    // business identity
    @Schema(description = "The name of the product")
    private String productName;
    private String productDescription;
    private String productCategory;
    private int productQuantity;
    private String productBrand;
    private String productMaterial;
}


