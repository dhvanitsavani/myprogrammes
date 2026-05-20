package com.core;

class Student_{
	static String college = "PDEU";
	String name;
	
	Student_(String name){
		this.name = name;
	}
	
	static void change_college(String new_college) {
		college = new_college;
	}
	
	void display() {
		System.out.println(this.name + " " + college);
	}
}

public class Static_methods_and_variables {
	public static void main(String[] args) {
		Student_ s1 = new Student_("Het");
		s1.display();
		
		Student_.change_college("Nirma University");
		s1.display();
	}
}
