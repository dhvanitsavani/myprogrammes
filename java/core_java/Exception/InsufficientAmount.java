package com.exception;

public class InsufficientAmount extends Exception {
	double amount;

	public InsufficientAmount(double amount) {
		this.amount = amount;
	}
	
	public double get_amount() {
		return amount;
	}
}
