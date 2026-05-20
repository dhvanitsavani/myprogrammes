package com.core;

class Student{
	String name;
	int std, age;
	
	Student(String name, int std, int age){
		this.name = name;
		this.std = std;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Std : " + this.std);
		System.out.println("Age : " + this.age);
	}
}

public class Student_class {
	public static void main(String[] args) {
		Student s1 = new Student("Rahul", 10, 15);
		s1.display();
	}
}
