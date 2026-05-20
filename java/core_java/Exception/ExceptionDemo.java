package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a, b, div;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter 2 numbers : ");
			a = sc.nextInt();
			b = sc.nextInt();
			div = a / b;
			System.out.println("Division = " + div);
			int arr[] = {1, 2, 3, 4, 5};
			System.out.print("Enter index : ");
			int idx = sc.nextInt();
			System.out.println("Value at " + idx + "th "  + "index : " + arr[idx]);
		}catch(ArithmeticException e) {
			System.out.println("Exception caught : " + e);
		}catch(InputMismatchException e) {
			System.out.println("Exception caught : " + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught : " + e);
		}
	}
	
}
