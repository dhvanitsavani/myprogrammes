package com.core;
import java.util.Scanner;

public class If_if_else {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		a = sc.nextInt();
		sc.close();
		
		if(a > 0) {
			System.out.println(a + " is positive.");
		}else {
			System.out.println(a + " is negative.");
		}
	}
}
