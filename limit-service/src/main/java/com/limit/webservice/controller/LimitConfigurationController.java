package com.limit.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limit.webservice.component.Configuration;
import com.limit.webservice.model.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limit")
	public LimitConfiguration retrieveLimitFromConfigurations() {
		return new LimitConfiguration(configuration.getMinimum());
		
	}

}
