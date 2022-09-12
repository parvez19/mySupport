package com.example.mysupport.controller;

import com.example.mysupport.entities.HardwareIssues;
import com.example.mysupport.entities.Product;
import com.example.mysupport.entities.SoftwareIssues;
import com.example.mysupport.service.IssueService;
import com.example.mysupport.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupportController {

    @Autowired
    ProductsService service;
    @Autowired
    IssueService service1;

    @GetMapping("/apple/mysupport/product")
    List<Product> getProducts() {

        return service.productList();
    }
        @GetMapping("/issues/mysupport/software")

        List<SoftwareIssues> getSoftwares () {
            return service1.softwareIssuesList();
        }
        @GetMapping ("/issues/mysupport/hardware")

        List<HardwareIssues> getHardwares () {
            return service1.hardwareIssuesList();
        }


    }

