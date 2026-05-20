package com.core;

class Sum{
	int sum(int a, int b) {
		return a + b;
	}
	
	float sum(float a, float b) {
		return a + b;
	}
	
	String sum(String a, String b) {
		return a + b;
	}
}

public class Method_overloading {
	public static void main(String[] args) {
		Sum s1 = new Sum();
		
		System.out.println(s1.sum(5, 10));
		System.out.println(s1.sum(3.5f, 9.9f));
		System.out.println(s1.sum("Het ", "Patel"));
	}
}
