package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public List<Product> getAvailableProducts(LocalDate startDate, LocalDate endDate) {
        return productRepository.getAvailableProducts(startDate, endDate);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.createProduct(product);
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return productRepository.updateProduct(productId, product);
    }

    @Override
    public boolean deleteProduct(Long productId) {
        try {
            productRepository.deleteProduct(productId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
