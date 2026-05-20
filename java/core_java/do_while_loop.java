package com.core;
import java.util.Scanner;

public class do_while_loop {
	public static void main(String args[]) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 for Exit\n");
	
		do {
			System.out.print("Enter age : ");
			age = sc.nextInt();
			
			if(age >= 18) {
				System.out.println("Can give Vote");
			}else {
				if(age != 0) {
					System.out.println("Cannot give Vote");
				}
			}
		}while(age != 0);
	}
}
