package com.slnaslan.microservces.limitservice.bean;

public class LimitsConfiguration {

	int max;
	int min;

	public LimitsConfiguration() {

	}

	public LimitsConfiguration(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

}
