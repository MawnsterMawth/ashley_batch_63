package com.cogent.bean;
import java.util.ArrayList;
import java.util.List;

public class Person {
	private long pid;
	private String pname;
	
	public Person() {
		super();
	}
	
	public Person(long pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	public long getPid() {
		return pid;
	}
	
	public void setPid(long pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public static void main(String args[]) {
		List<Person> people = new ArrayList();
		{
			people.add(new Person(1, "Ashley"));
			people.add(new Person(2, "Ben"));
			people.add(new Person(3, "Jacob"));
			people.add(new Person(4, "jumbo"));
			people.add(new Person(5, "ankit"));
			people.add(new Person(1, "Netty"));
			people.add(new Person(2, "Varis"));
			people.add(new Person(3, "Qiu"));
			people.add(new Person(4, "pasker"));
			people.add(new Person(5, "rhys"));
		}
		
		for(int i = 0; i < people.size(); i++) {
			char initial = Character.toLowerCase(people.get(i).getPname().charAt(0));
			if(initial == 'a' || initial == 'j') {
				System.out.println(people.get(i).getPid() + " " + people.get(i).getPname());
			}
		}
	}
}
