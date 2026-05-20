package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int r_no;
	String name;
	double per;
	public Student(int r_no, String name, double per) {
		this.r_no = r_no;
		this.name = name;
		this.per = per;
	}

	public String toString() {
		return "Student [r_no=" + r_no + ", name=" + name + ", per=" + per + "]";
	}
}


public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	
	Student s1 = new Student(10, "Dhvanit", 92.67);
	
	FileOutputStream fos = new FileOutputStream("demo3.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);

	oos.writeObject(s1);
	oos.flush();
	oos.close();
	
	FileInputStream fis = new FileInputStream("demo3.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Student s2 = (Student) ois.readObject();
	System.out.println(s2);
	ois.close();
	}
}