package com.core;
import java.util.Scanner;

public class Array_sort {
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
			for(int j=i; j<n; j++) {
					if(nums[i] > nums[j]) {
						nums[i] = nums[i] + nums[j];
						nums[j] = nums[i] - nums[j];
						nums[i] = nums[i] - nums[j];
					}
			}
		}
		System.out.print("\nAscending : ");
		for(int i=0; i<n; i++) {
			System.out.print(nums[i] + " ");
		}
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
					if(nums[i] < nums[j]) {
						nums[i] = nums[i] + nums[j];
						nums[j] = nums[i] - nums[j];
						nums[i] = nums[i] - nums[j];
					}
			}
		}
		System.out.print("\nDescending : ");
		for(int i=0; i<n; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
