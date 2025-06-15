package com.me.webproduct.service;


import com.me.webproduct.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    Product saveProduct(Product product);
    Product getProduct(Long id);
    void deleteProduct(Long id);
}
