package com.taxcal.webservices.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxRateDto {

	private long incomeLimit;
	private int rate;

	public TaxRateDto() {
	}

	public TaxRateDto(long incomeLimit, int rate) {
		super();
		this.incomeLimit = incomeLimit;
		this.rate = rate;
	}

	public long getIncomeLimit() {
		return incomeLimit;
	}

	public void setIncomeLimit(long incomeLimit) {
		this.incomeLimit = incomeLimit;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "TaxRateDto [incomeLimit=" + incomeLimit + ", rate=" + rate + "]";
	}

}
