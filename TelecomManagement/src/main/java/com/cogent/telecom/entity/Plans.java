package com.cogent.telecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Plans {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String plan_name;
	float cost;
	boolean validity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlanName() {
		return plan_name;
	}
	public void setPlanName(String plan_name) {
		this.plan_name = plan_name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public boolean getValidity() {
		return validity;
	}
	public void setValidity(boolean validity) {
		this.validity = validity;
	}
	public Plans() {
		super();
	}
	
	public Plans(int id,String plan_name,float cost,boolean validity) {
		super();
		this.id = id;
		this.plan_name = plan_name;
		this.cost = cost;
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "Plans [id=" + id + ", plan_name=" + plan_name + ", cost=" + cost + ", validity=" + validity + "]";
	}
}
