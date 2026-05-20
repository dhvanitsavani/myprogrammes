package com.core;
import java.util.Scanner;

class Max{
	int n1, n2, n3;
	
	Max(int a, int b, int c){
		n1 = a;
		n2 = b;
		n3 = c;
	}
	
	int max() {
		if(n1 >= n2 && n1 >= n3) {
			return n1;
		}else if(n2 >= n1 && n2 >= n3) {
			return n2;
		}else if(n3 >= n1 && n3 >= n2) {
			return n3;
		}else {
			return n1;
		}
	}
}

public class Max_of_three_method {
	public static void main(String[] args) {
		Max m1 = new Max(2, 5, 3);
		Max m2 = new Max(20, 5, 3);
		Max m3 = new Max(2, 5, 13);
		
		System.out.println(m1.max());
		System.out.println(m2.max());
		System.out.println(m3.max());
	}
}
