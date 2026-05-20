package com.core;
import java.util.Scanner;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + this.name + "\nAge : " + this.age + "\n");
	}
}

public class Array_of_objects {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		String[] names = new String[3];
		int[] ages = new int[3];
		Scanner sc = new Scanner(System.in);
		
		// input names & ages :-
		System.out.print("Enter 3 names : ");
		for(int i=0; i<3; i++) {
			names[i] = sc.next();
		}
		System.out.print("Enter their ages : ");
		for(int i=0; i<3; i++) {
			ages[i] = sc.nextInt();
		}
		System.out.println();
		
		// creating objects :-
		for(int i=0; i<3; i++) {
			persons[i] = new Person(names[i], ages[i]);
		}
		
		// displaying objects :-
		for(int i=0; i<3; i++) {
			persons[i].display();
		}
	}
}
