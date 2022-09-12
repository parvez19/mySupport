package com.example.mysupport.service;

import com.example.mysupport.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsService {

  public List<Product> productList();

}
