package com.example.EmpManage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Payroll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	float taxPaid;
	int dayWorking;
	
	public Payroll() {
		super();
	}
	public Payroll(int id, String name, float taxPaid, int dayWorking) {
		super();
		this.id = id;
		this.name = name;
		this.taxPaid = taxPaid;
		this.dayWorking = dayWorking;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTaxPaid() {
		return taxPaid;
	}
	public void setSalary(float taxPaid) {
		this.taxPaid = taxPaid;
	}
	public int getDay() {
		return dayWorking;
	}
	public void setDay(int dayWorking) {
		this.dayWorking = dayWorking;
	}
	@Override
	public String toString() {
		return "Payroll [id=" + id + ", name=" + name + ", tax paid=" + taxPaid + ", day working=" + dayWorking + "]";
	}
}
