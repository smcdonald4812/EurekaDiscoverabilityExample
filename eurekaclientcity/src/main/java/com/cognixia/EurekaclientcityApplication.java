package com.cognixia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaclientcityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientcityApplication.class, args);
	}

}
