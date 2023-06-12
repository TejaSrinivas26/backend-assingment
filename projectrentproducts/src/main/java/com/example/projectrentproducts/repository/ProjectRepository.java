package com.example.projectrentproucts.repository;

import com.example.product.model.Product;

import java.time.LocalDate;
import java.util.List;

public interface ProjectRepository {

    List<Product> getAllProducts();

    Product getProductById(Long productId);

    List<Product> getAvailableProducts(LocalDate startDate, LocalDate endDate);

    Product createProduct(Product product);

    Product updateProduct(Long productId, Product product);

    void deleteProduct(Long productId);
}
