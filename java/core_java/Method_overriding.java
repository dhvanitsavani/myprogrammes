package com.core;

class A1{
	void show() {
		System.out.println("Method called from A.");
	}
}

class B1 extends A1{
	void show() {
		System.out.println("Method called from B.");
	}
}

public class Method_overriding {
	public static void main(String[] args) {	
	B1 b1 = new B1();
	
	b1.show();
	}
}