package com.taxcal.webservices.util;

import java.util.List;

import com.taxcal.webservices.dto.TaxRateDto;

public class Utility {

	public static double calculateIncomeTax(List<TaxRateDto> taxRateDto, double income) {
		long incomeTaxRate = 0;
		int taxRate = 0;
		if (income <= 0)
			return 0;
		for (int i = 0; i < taxRateDto.size(); i++) {

			incomeTaxRate = taxRateDto.get(i).getIncomeLimit();

			if (income <= incomeTaxRate) {
				taxRate = taxRateDto.get(i).getRate();
				return income * taxRate / 100;
			}

		}
		if (income > taxRateDto.get(taxRateDto.size() - 1).getIncomeLimit()) {
			return income * taxRateDto.get(taxRateDto.size() - 1).getRate() / 100;
		}

		return 0;
	}

}
