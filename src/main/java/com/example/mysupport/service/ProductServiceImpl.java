package com.example.mysupport.service;

import com.example.mysupport.entities.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductsService {


    @Override
    public List<Product> productList() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/apple/products";
        List<Product> response = restTemplate.getForObject(url,List.class);
        return response;
    }
}
