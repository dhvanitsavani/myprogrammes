package com.core;
import java.util.Scanner;

public class Array_max_and_min {
	public static void main(String[] args) {
		int n, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
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
			if(nums[i] > max) {
				max = nums[i];
			}
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
}
