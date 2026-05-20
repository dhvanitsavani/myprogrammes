package com.core;
import java.util.Scanner;

public class If_nested_if {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		n = sc.nextInt();
		sc.close();
		
		if(n > 0) {
			if(n % 2 == 0) {
				System.out.println("Number is positive and even.");
			}else {
				System.out.println("Number is positive and odd.");
			}
		}else {
			System.out.println("Number is negative.");
		}
	}
}
