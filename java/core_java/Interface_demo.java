package com.core;

interface ifs1{
	void demo1();
}

interface ifs2{
	void demo2();
}

//public class Interface_demo implements ifs1, ifs2 {
//	public void demo1() {
//		System.out.println("Demo1 method called");
//	}
//	public void demo2() {
//		System.out.println("Demo2 method called");
//	}
//	
//	public static void main(String[] s) {
//		InterfaceDemo i = new InterfaceDemo();
//		
//		i.demo1();
//		i.demo2();
//	}
//}

interface ifs3 extends ifs1, ifs2{
	void demo3();
}

public class Interface_demo implements ifs3{
	public void demo1() {
		System.out.println("Demo1 method called");
	}
	public void demo2() {
		System.out.println("Demo2 method called");
	}
	
	public void demo3() {
		System.out.println("Demo3 method called");
	}
	
	public static void main(String[] args) {
		Interface_demo i = new Interface_demo();
		
		i.demo1();
		i.demo2();
		i.demo3();
	}
}