package com.taxcal.webservices.model;

public class UserInfo {
	
	private int id;
	private String name;
	private double income;
	private double taxAmount;
	
	public UserInfo() {}
	public UserInfo(int id, String name, double income,double taxAmount) {
		super();
		this.id = id;
		this.name = name;
		this.income = income;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}


}
