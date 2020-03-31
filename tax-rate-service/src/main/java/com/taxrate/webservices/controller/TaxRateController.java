package com.taxrate.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxrate.webservices.model.TaxRate;
import com.taxrate.webservices.repository.TaxRateRepository;

@RestController
public class TaxRateController {

	@Autowired
	TaxRateRepository taxRateRepository;
	
	@Autowired
	Environment environment;

	@GetMapping("/taxrate")
	public List<TaxRate> retrieveTaxRate() {

		List<TaxRate> taxRateList = taxRateRepository.findAll();

		return taxRateList;
	}

}
