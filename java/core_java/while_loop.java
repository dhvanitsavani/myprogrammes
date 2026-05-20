package com.core;
import java.util.Scanner;

public class while_loop {
	public static void main(String args[]) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n : ");
		n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("Sum = " + sum);
	}
}
