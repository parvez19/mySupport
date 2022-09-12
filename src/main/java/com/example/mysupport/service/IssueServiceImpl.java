package com.example.mysupport.service;

import com.example.mysupport.entities.HardwareIssues;
import com.example.mysupport.entities.Product;
import com.example.mysupport.entities.SoftwareIssues;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class IssueServiceImpl  implements IssueService{
    @Override
    public List<SoftwareIssues> softwareIssuesList() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8082/issues/software";
        List<SoftwareIssues> response = restTemplate.getForObject(url,List.class);
        return response;
    }

    @Override
    public List<HardwareIssues> hardwareIssuesList() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8082/issues/hardware";
        List<HardwareIssues> response = restTemplate.getForObject(url,List.class);
        return response;
    }
}
