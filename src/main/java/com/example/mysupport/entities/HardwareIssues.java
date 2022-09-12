package com.example.mysupport.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class HardwareIssues {

    public String network;
    public String keypad;
    public String microphone;
    public String speaker;
}
