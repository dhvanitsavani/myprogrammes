package com.exception;

public class BankAccount {
	String name;
	int acc_no;
	double balance;
	
	public BankAccount(String name, int acc_no, double balance) {
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
	
		System.out.println("Hello " + name + ", Your acc no. is " + acc_no + " opened with " + balance + " rs.");	
	}
	
	public void check_balance() {
		System.out.println("Balance : " + this.balance);
	}
	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	public void withdraw(double amount) throws InsufficientAmount {
		if(amount <= this.balance) {
			this.balance = this.balance - amount;
		}else {
			throw new InsufficientAmount(amount - this.balance);
		}
	}
}
