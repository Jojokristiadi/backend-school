package com.school.smp1.controllers;

import com.school.smp1.models.Product;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public Product product() {
        Product bando = new Product(1, "Bando", "Bagus dan indah", 2500);
        return bando;
    }
}
