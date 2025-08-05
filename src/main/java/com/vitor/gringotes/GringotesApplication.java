package com.vitor.gringotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GringotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GringotesApplication.class, args);
	}

}
