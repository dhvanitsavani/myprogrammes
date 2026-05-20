package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("demo2.txt");
		String s = "This is File management with Writter-Reader using Java.";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("demo2.txt");
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
	}
}
