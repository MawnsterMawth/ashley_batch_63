package com.cogent.telecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerCare {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String complaint_desc;
	int user_id;
	boolean complaint_status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplaintDesc() {
		return complaint_desc;
	}
	public void setComplaintDesc(String complaint_desc) {
		this.complaint_desc = complaint_desc;
	}
	public int getUserId() {
		return user_id;
	}
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
	public boolean getComplaintStatus() {
		return complaint_status;
	}
	public void setComplaintStatus(boolean complaint_status) {
		this.complaint_status = complaint_status;
	}
	public CustomerCare() {
		super();
	}
	public CustomerCare(int id,String complaint_desc,int user_id,boolean complaint_status) {
		super();
		this.id = id;
		this.complaint_desc = complaint_desc;
		this.user_id = user_id;
		this.complaint_status = complaint_status;
	}
	@Override
	public String toString() {
		return "CustomerCare [id=" + id + ", complaint_desc=" + complaint_desc + ", user_id=" + user_id + ", complaint_status=" + complaint_status + "]";
	}
}
