package com.core;

class Voter {
	String name;
	int age;
	
	Voter(){
		this.name = "Unknown";
		this.age = 18;
	}
	Voter(String name){
		this.name = name;
		this.age = 18;
	}
	Voter(int age){
		this.name = "Unknown";
		this.age = age;
	}
	Voter(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}
}

public class Cunstructor_overloading {
	public static void main(String[] args) {
		Voter v1 = new Voter();
		Voter v2 = new Voter("Rahul");
		Voter v3 = new Voter(25);
		Voter v4 = new Voter("Mehul", 28);
		
		v1.display();
		v2.display();
		v3.display();
		v4.display();
	}
}
