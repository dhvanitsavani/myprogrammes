package com.core;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int n, ans=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n : ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			ans *= i;
		}
		
		System.out.println("Factorial of " + n + " = " + ans);
	}
}
