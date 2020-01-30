package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjejectBatch9AmEurekaHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjejectBatch9AmEurekaHelloServiceApplication.class, args);
	}

}
