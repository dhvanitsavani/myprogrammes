package com.core;
import java.util.Scanner;

public class Scanner_input {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		a = sc.nextInt();
		sc.close();
		
		System.out.println("Number is : " + a);
		
	}
}
