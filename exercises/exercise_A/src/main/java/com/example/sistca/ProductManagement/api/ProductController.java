package com.example.sistca.ProductManagement.api;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.sistca.ProductManagement.services.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")

public class ProductController {

    private final ProductService productService;

    private final ProductMapper productMapper;

    @Operation(summary = "Creates a new product")
    @GetMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> createProduct(
            final HttpServletRequest request,
            @Valid @RequestBody final CreateProductRequest resource) {
    
        final var product = productMapper.createProduct(resource);

        return ResponseEntity.ok().eTag(Long.toString(product.getVersion())).body(productService.toProductDTO(product));
    }
}