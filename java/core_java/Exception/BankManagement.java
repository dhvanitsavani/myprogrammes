package com.exception;

import java.util.Scanner;

public class BankManagement {
	public static void main(String[] args) {
		BankAccount acc_1 = new BankAccount("Dhvanit", 90, 17000);
		double amount;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************************************************");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.println("************************************************");
		while(true) {
			System.out.print("\nEnter Choice : ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.print("Enter Amount : ");
				amount = sc.nextDouble();
				acc_1.deposit(amount);
			}else if(choice == 2) {
				System.out.print("Enter Amount : ");
				amount = sc.nextDouble();
				
				try {
					acc_1.withdraw(amount);
				}catch(InsufficientAmount e) {
					System.out.println(e.get_amount() + " rs. balance is needed to withdraw " + amount + " rs.");
				}
				
			}else if(choice == 3) {
				acc_1.check_balance();
			}else if(choice == 4) {
				System.out.println("Thank you for Using Our Services.");
				break;
			}else {
				System.out.println("Invalid Choice, Try again.");
			}
			
			System.out.println("************************************************");
		}
	}
}
