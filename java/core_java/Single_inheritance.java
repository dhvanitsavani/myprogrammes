package com.core;

class A{
	A(){
		System.out.println("Class A...");
	}
}

class B extends A{
	B(){
		System.out.println("Class B...");
	}
}

public class Single_inheritance {
	public static void main(String[] args) {
		B b1 = new B();
	}
}
