package com.taxrate.webservices.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TaxRate {

	private int id;

	private long incomeLimit;

	private int rate;

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

}
