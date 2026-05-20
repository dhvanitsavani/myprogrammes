package com.core;

class Box{
	int length, width, height;
	Box(){
		System.out.println("Default Constructor...");
		length = 1;
		width = 1;
		height = 1;
	}
	Box(Box b){
		System.out.println("Copy Constructor...");
		length = b.length;
		height = b.height;
		width = b.width;
	}
	Box(int l, int w, int h){
		System.out.println("Parameterized Constructor...");
		length = l;
		width = w;
		height = h;
	}
	
	void volume() {
		System.out.println("Volume : " + length * height * width);
	}
}

public class Object_cloning {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.volume();
		
		Box b2 = new Box(5, 2, 3);
		b2.volume();
		
		Box b3 = new Box(b2);
		b3.volume();
	}
}
