package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(10.5);
		al.add(true);
		al.add('h');
		al.add("world");
		al.add(null);
		al.add(10.5);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(4));
		System.out.println(al.indexOf(10.5));
		System.out.println(al.lastIndexOf(10.5));
		System.out.println(al.isEmpty());
	}
}