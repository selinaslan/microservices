package com.slnaslan.microservces.itempriceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.slnaslan.microservces.itempriceservice.bean.ItemValue;
import com.slnaslan.microservces.itempriceservice.dao.ItemPriceRepository;

@RestController
public class ItemPriceController {

	@Autowired
	Environment environment;

	@Autowired
	ItemPriceRepository dao;

	@GetMapping("item-price/item/{item}")
	public ItemValue retrieveItemPrice(@PathVariable String item) {

		ItemValue itemValue = dao.findByItem(item);
		itemValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

		return itemValue;

	}
}
