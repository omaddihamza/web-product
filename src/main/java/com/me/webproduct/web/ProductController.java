package com.me.webproduct.web;


import com.me.webproduct.entities.Product;
import com.me.webproduct.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    @GetMapping("/products")
    public List<Product> listProduct() {
        return productServiceImpl.listProduct();
    }

    public Product saveProduct(Product product) {
        return productServiceImpl.saveProduct(product);
    }

    @GetMapping("product/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productServiceImpl.getProduct(id);
    }

    public void deleteProduct(Long id) {
        productServiceImpl.deleteProduct(id);
    }
}
