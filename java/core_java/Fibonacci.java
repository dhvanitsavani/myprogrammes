package com.core;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n, a=0, b=1, temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(a + " ");
		
			temp = a;
			a = b;
			b = temp + b;
		}
	}
}
