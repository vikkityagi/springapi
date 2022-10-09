package com.example.demoapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DemoapiModel {
	
	@Id
	private int eid;
	private String name;
	private String email;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "DemoapiModel [eid=" + eid + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
