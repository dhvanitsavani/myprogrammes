package com.core;

abstract class AbstractClass{
	void show() {
		System.out.println("Showed from parent abstract class...");
	}
	
	abstract void show_abstract();
}

class ChildClass extends AbstractClass{
	void show_abstract() {
		System.out.println("Showed from child class...");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		ChildClass c1 = new ChildClass();
		
		c1.show();
		c1.show_abstract();
	}
}
