package com.exception;

import java.util.Scanner;

public class Throw {
	
	public static void demo() {
		int x;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter x : ");
			x = sc.nextInt();
		
		
			if(x > 0) {
				System.out.println("Square of " + x + " : " + x * x);
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("Please Enter positive value");
			demo();
		}
	}
	
	public static void main(String[] args) {
		demo();
	}
}
