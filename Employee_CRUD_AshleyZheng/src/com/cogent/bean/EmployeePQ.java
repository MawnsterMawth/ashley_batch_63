package com.cogent.bean;

import java.util.PriorityQueue;
import java.util.Scanner;
import com.cogent.bean.*;
public class EmployeePQ implements Comparable<EmployeeBean> {
	public static void main(String args[]) {
		PriorityQueue<EmployeeBean> pq = new PriorityQueue<>();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			EmployeeBean employeeBean = new EmployeeBean();
			employeeBean.setEmployeeId((long)i);
			employeeBean.setemployeeFname((char)(65+i)+"s");
			employeeBean.setEmployeeLname((char)(65+i)+"s");
			employeeBean.setEmployeeEmail((char)(65+i)+"@mail.com");
			employeeBean.setEmployeeAge(i);
			employeeBean.setMarryStatus(i%2==0);
			employeeBean.setEmployeeCity((char)(65+i)+"town");
			employeeBean.setEmployeeCountry((char)(65+i)+"land");
			pq.add(employeeBean);
		}
		while(true) 
		{
		    EmployeeBean e = pq.poll();
		    System.out.println(e.getEmployeeId());
		     
		    if(e == null) break;
		}
	}
}
