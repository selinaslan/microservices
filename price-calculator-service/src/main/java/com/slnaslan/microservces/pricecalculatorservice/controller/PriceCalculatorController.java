package com.slnaslan.microservces.pricecalculatorservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.slnaslan.microservces.pricecalculatorservice.ItemPriceServiceProxy;
import com.slnaslan.microservces.pricecalculatorservice.bean.PriceCalculatorBean;

@RestController
public class PriceCalculatorController {
	
	@Autowired
	private ItemPriceServiceProxy proxy;
	
	@GetMapping("price-calculator/item/{item}/quantity/{quantity}")
	public PriceCalculatorBean calculateTotalAmount(@PathVariable String item,@PathVariable BigDecimal quantity) {
		
		Map<String,String> uriVariables= new HashMap<String,String>();
		uriVariables.put("item",item);
		
		ResponseEntity<PriceCalculatorBean> forEntity = new RestTemplate().getForEntity("http://localhost:8000/item-price/item/{item}", PriceCalculatorBean.class,uriVariables );
		
		PriceCalculatorBean response = forEntity.getBody();
		
		return new PriceCalculatorBean(response.getId(),item,response.getPrice(),quantity,quantity.multiply(response.getPrice()),0);
	}

	@GetMapping("price-calculator-feign/item/{item}/quantity/{quantity}")
	public PriceCalculatorBean calculateTotalAmountFeign (@PathVariable String item,@PathVariable BigDecimal quantity) {
		
		PriceCalculatorBean response = proxy.retrieveItemPrice(item);
		
		return new PriceCalculatorBean(response.getId(),item,response.getPrice(),quantity,quantity.multiply(response.getPrice()),response.getPort());
	}
	
}
