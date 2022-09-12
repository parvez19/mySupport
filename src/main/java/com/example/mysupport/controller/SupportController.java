package com.example.mysupport.controller;

import com.example.mysupport.entities.Product;
import com.example.mysupport.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupportController {

    @Autowired
    ProductsService service;
    @GetMapping("/apple/mysupport/product")
    List<Product> getProducts() {
        return service.productList();
    }

}
