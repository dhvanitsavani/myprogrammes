package com.core;

class Account{
	private String name;
	private int id, balance;
	
	public Account(String name, int id, int balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public int get_id() {
		return this.id;
	}
	
	public int get_balance() {
		return this.balance;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public void set_id(int id) {
		this.id = id;
	}
	
	public void set_balance(int balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("Name : " + this.name + "\nId : " + this.id + "\nBalance : " + this.balance);
	}
}

public class Encapulation {
	public static void main(String[] args) {
		Account a1 = new Account("Ketan", 10, 18000);
		
		System.out.println(a1.get_name());
		System.out.println(a1.get_id());
		System.out.println(a1.get_balance());
		a1.display();
		
		a1.set_name("Het");
		a1.set_id(15);
		a1.set_balance(21000);
		
		a1.display();
	}
}
