package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(1, "Dhvanit");
		hm.put(2, "Het");
		hm.put(3, "Sonal");
		hm.put(15, "Shreya");
		hm.put(12, "Saumil");
		System.out.println(hm);

		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
