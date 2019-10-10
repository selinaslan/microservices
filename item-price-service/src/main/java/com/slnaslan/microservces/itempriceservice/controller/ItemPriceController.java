package com.slnaslan.microservces.itempriceservice.controller;

import org.slf4j.Logger;

import java.math.BigDecimal;
import java.util.Optional;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.slnaslan.microservces.itempriceservice.bean.ItemValue;
import com.slnaslan.microservces.itempriceservice.dao.ItemPriceRepository;

@RestController
public class ItemPriceController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Environment environment;

	@Autowired
	ItemPriceRepository dao;

	@GetMapping("item-price/item/{item}")
	public ItemValue retrieveItemPrice(@PathVariable String item) {

		Optional<ItemValue> itemValue = dao.findByItem(item);
		if (itemValue.isPresent()) {
			ItemValue val = itemValue.get();
			val.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			logger.info("{}", val);
			return val;
		} else {
			return new ItemValue(0L,"Not Found",BigDecimal.ZERO);
		}

	}
}
