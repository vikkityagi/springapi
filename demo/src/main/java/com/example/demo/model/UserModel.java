package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {
	
	@Id
	private int eid;
	private String name;
	private String useremail;
	private String salary;
	private int user_password;
	
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
	
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	public int getUser_password() {
		return user_password;
	}
	public void setUser_password(int user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "UserModel [eid=" + eid + ", name=" + name + ", useremail=" + useremail + ", salary=" + salary
				+ ", user_password=" + user_password + "]";
	}
	
	
	
	

}
