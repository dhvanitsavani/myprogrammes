package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(1);
		hs.add("hello");
		hs.add(false);
		hs.add(null);
		hs.add('t');
		hs.add(1.9);
		hs.add(1);
		System.out.println(hs);
		
		System.out.println("\n------Iterator------");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}