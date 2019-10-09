package com.slnaslan.microservces.pricecalculatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.*;

@SpringBootApplication
@EnableFeignClients("com.slnaslan.microservces.pricecalculatorservice")
@EnableDiscoveryClient
public class PriceCalculatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceCalculatorServiceApplication.class, args);
	}

}
