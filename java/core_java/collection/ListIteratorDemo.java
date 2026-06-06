package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(100);
		al.add(1000);
		al.add(10000);
		al.add(100000);
		System.out.println("Normal ArrayList : " + al + "\n");		
		
		// Changing Data
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			litr.set(litr.next() + " n");
		}
		System.out.println("Changed ArrayList : " + al + "\n");
		
		
		// Printing in forward direction
		litr = al.listIterator();
		System.out.println("------Printing through litr in forward direction------");
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		
		// Printing in backward direction
		litr = al.listIterator(al.size());
		System.out.println("\n------Printing through litr in backward direction------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
