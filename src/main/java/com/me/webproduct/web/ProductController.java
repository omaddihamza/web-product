package com.me.webproduct.web;


import com.me.webproduct.entities.Product;
import com.me.webproduct.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    //tcest
    private final ProductServiceImpl productServiceImpl;

    public List<Product> listProduct() {
        return productServiceImpl.listProduct();
    }

    public Product saveProduct(Product product) {
        return productServiceImpl.saveProduct(product);
    }

    public Product getProduct(Long id) {
        return productServiceImpl.getProduct(id);
    }

    public void deleteProduct(Long id) {
        productServiceImpl.deleteProduct(id);
    }
}
