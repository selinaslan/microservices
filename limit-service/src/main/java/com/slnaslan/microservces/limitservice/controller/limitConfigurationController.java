package com.slnaslan.microservces.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slnaslan.microservces.limitservice.bean.LimitsConfiguration;
import com.slnaslan.microservces.limitservice.configuration.Configuration;

@RestController
public class limitConfigurationController {

	@Autowired
	private Configuration conf;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		return new LimitsConfiguration(conf.getMax(), conf.getMin());
	}
}
