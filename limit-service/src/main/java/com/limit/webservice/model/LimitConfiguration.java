package com.limit.webservice.model;


public class LimitConfiguration {

	private int minimum;

	protected LimitConfiguration() {

	}

	public LimitConfiguration(int minimum) {
		super();
		this.minimum = minimum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
