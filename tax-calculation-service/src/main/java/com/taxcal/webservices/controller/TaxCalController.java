package com.taxcal.webservices.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.taxcal.webservices.dto.TaxRateDto;
import com.taxcal.webservices.model.UserInfo;
import com.taxcal.webservices.util.IncomeComparator;
import com.taxcal.webservices.util.Utility;

@RestController
public class TaxCalController {

	@PostMapping("/calculatetax")
	public UserInfo taxCalculation(@RequestBody UserInfo userInfo) {

		double income = userInfo.getIncome();
		double taxAmount = 0;
		final String uri = "http://localhost:9000/taxrate";
		RestTemplate restTemplate = new RestTemplate();
		TaxRateDto[] result = restTemplate.getForObject(uri, TaxRateDto[].class);
		List<TaxRateDto> taxRateinfo = java.util.Arrays.asList(result);
		Collections.sort(taxRateinfo, new IncomeComparator());
		taxAmount = Utility.calculateIncomeTax(taxRateinfo, income);
		userInfo.setTaxAmount(taxAmount);
		return userInfo;

	}

}