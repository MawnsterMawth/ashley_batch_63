package com.example.EmpManage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Complain {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String desc;
	String name;
	float status;
	
	public Complain() {
		super();
	}
	public Complain(int id,String desc,String name,float status) {
		super();
		this.id=id;
		this.desc=desc;
		this.name=name;
		this.status=status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc=desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getStatus() {
		return status;
	}
	public void setStatus(float status) {
		this.status=status;
	}
	@Override
	public String toString() {
		return "Complaint [id=" + id + ", desc=" + desc + ", name=" + name + ", status=" + status + "]";
	}
}
