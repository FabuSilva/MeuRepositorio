package com.example.desafiio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableFeignClients
@SpringBootApplication
public class DesafiioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiioApplication.class, args);
	}

}
