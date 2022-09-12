package com.example.mysupport.service;

import com.example.mysupport.entities.HardwareIssues;
import com.example.mysupport.entities.SoftwareIssues;

import java.util.List;

public interface IssueService {

    public List<SoftwareIssues> softwareIssuesList ();
    public List<HardwareIssues> hardwareIssuesList ();
}
