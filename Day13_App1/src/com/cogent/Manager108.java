package com.cogent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Manager108 {
	public static void main(String args[]) {
	File f=new File("jdbc.properties");
	try {
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println("Driver:-  ");
		System.out.println("Driver:-  ");
		System.out.println("Driver:-  ");
		System.out.println("Driver:-  ");
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	}
}
