package com.core;
import java.util.Scanner;

public class Array_demo {
	public static void main(String[] arga) {
		int[] numbers = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 5 numbers : ");
		for(int i=0; i<5; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
