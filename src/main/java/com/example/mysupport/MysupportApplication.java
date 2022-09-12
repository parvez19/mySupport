package com.example.mysupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("Issue")
public class MysupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysupportApplication.class, args);
	}

}
