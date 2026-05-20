package com.core;
import java.util.Scanner;

public class Array_sum {
	public static void main(String[] args) {
		int n, sum=0;
		int[] nums = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array(1-10) : ");
		n = sc.nextInt();
		
		// input :-
		System.out.print("Enter " + n + " numbers : ");
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}

		// process :-
		for(int i=0; i<n; i++) {
			sum += nums[i];
		}
		
		System.out.println("Sum = " + sum);
	}
}
