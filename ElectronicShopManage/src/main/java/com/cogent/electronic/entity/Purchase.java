package com.cogent.electronic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String productname;
	float cost;
	String purchasedate;
	String deliverydate;
	String feedback;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productname;
	}
	public void setName(String productname) {
		this.productname = productname;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getPurchaseDate() {
		return purchasedate;
	}
	public void setPurchaseDate(String purchasedate) {
		this.purchasedate = purchasedate;
	}
	public String getDeliveryDate() {
		return deliverydate;
	}
	public void setDeliveryDate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase(int id,String productname,float cost,String purchasedate,String deliverydate,String feedback) {
		super();
		this.id = id;
		this.productname = productname;
		this.cost = cost;
		this.purchasedate = purchasedate;
		this.deliverydate = deliverydate;
		this.feedback = feedback;
		// TODO Auto-generated constructor stub
	}
}
