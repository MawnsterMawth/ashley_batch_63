package com.app;

public class Student {
	private int stno;
	private String stname;
	private String email;
	
	public Student() {
		super();
	}
	public Student(int stno, String stname, String email) {
		super();
		this.stno = stno;
		this.stname = stname;
		this.email = email;
	}
	public int getStno() {
		return stno;
	}
	public String getStname() {
		return stname;
	}
	public String getEmail() {
		return email;
	}
}
