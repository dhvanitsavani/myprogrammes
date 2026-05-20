package com.core;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int choice, n1=0, n2=0, ans=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------Menu-----------------");
		System.out.println("1. Sum");
		System.out.println("2. Subtract");
		System.out.println("3. Product");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("-------------------------------------\n");

		while(true) {
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			
			if(choice == 5) {
				System.out.println("Thank you !");
				break;
			}else {
				 if(choice <= 4 && choice >= 1) {
					 System.out.print("Enter two numbers : ");
					 n1 = sc.nextInt();
					 n2 = sc.nextInt();
				 }
					 switch(choice) {
					case 1: ans = n1 + n2;
					break;
					case 2: ans = n1 - n2;
					break;
					case 3: ans = n1 * n2;
					break;
					case 4: ans = n1 / n2;
					break;
					default: System.out.println("Invalid Choice Number !\n");
					}
					
					 if(choice <= 4 && choice >= 1) {
					System.out.println("Answer = " + ans + "\n");
					 }
			}
			
			
		}
	}
}
