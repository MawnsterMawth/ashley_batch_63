package com.cogent.spring.boot.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empl_table")
public class EmployeeEntity {
	@Id
	@Column(name="EmployeeID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="EmployeeName")
	private String name;
	@Column(name="EmployeeDept")
	private String dept;
	@Column(name="EmployeeSalary")
	private double salary;
	
	public EmployeeEntity() {
		
	}

	public long getEmployeeId() {
		// TODO Auto-generated method stub
		return id;
	}
}
