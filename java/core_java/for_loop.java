package com.core;
import java.util.Scanner;

public class for_loop {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n : ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i + " ");
		}
	}
}
