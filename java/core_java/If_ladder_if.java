package com.core;
import java.util.Scanner;

public class If_ladder_if {
	public static void main(String[] args) {
		int marks;
		char grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your marks : ");
		marks = sc.nextInt();
		sc.close();
		
		if(marks >= 90) {
			grade = 'A';
		}else if(marks >= 70) {
			grade = 'B';
		}else if(marks >= 50) {
			grade = 'C';
		}else if(marks >= 35) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("Grade : " + grade);
	}
}
