package com.school.smp1.controllers;

import java.util.List;

import com.school.smp1.models.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> fetch() {
        Product bando = new Product(1, "Bando", "Bagus dan indah", 2500);
        Product ikat = new Product(2, "Ikat Rambut", "Tebal dan lentur", 500);
        return List.of(bando, ikat);
    }
    
    @GetMapping("/products/{id}")
    public Product fetchById(@PathVariable long id) {
        if(id == 1) {
            return new Product(1, "Bando", "Bagus dan indah", 2500);
        }
        return new Product(2, "Ikat Rambut", "Tebal dan lentur", 500);
    }
}
