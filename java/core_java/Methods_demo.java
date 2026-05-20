package com.core;
import java.util.Scanner;

class FindMax{
	int calculate(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
}

public class Methods_demo {
	public static void main(String[] args) {
		int a, b, max;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		FindMax obj1 = new FindMax();
		
		max = obj1.calculate(a, b);
		
		System.out.println("Max = " + max);
	}
}
