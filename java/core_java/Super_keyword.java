package com.core;

class A2{
	void show() {
		System.out.println("Method called from A.");
	}
}

class B2 extends A2{
	void show() {
		super.show();
		System.out.println("Method called from B.");
	}
}

public class Super_keyword {
	public static void main(String[] args) {
		B2 b1 = new B2();
		
		b1.show();
	}
}
