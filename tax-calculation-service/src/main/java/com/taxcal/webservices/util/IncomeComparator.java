package com.taxcal.webservices.util;

import java.util.Comparator;

import com.taxcal.webservices.dto.TaxRateDto;

public class IncomeComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		TaxRateDto t1 = (TaxRateDto) obj1;
		TaxRateDto t2 = (TaxRateDto) obj2;

		if (t1.getIncomeLimit() == t2.getIncomeLimit())
			return 0;
		else if (t1.getIncomeLimit() > t2.getIncomeLimit())
			return 1;
		else
			return -1;
	}
}
