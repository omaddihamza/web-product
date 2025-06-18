package com.me.webproduct.service;

import com.me.webproduct.entities.Product;
import com.me.webproduct.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;


    @Override
    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
