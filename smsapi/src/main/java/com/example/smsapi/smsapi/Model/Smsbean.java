package com.example.smsapi.smsapi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

@Entity
public class Smsbean {
	
	

	@Id
	private long ben_id;
	
	@Column(unique=true,nullable=false)
	private long adharno;
	
	@Column(nullable=false)
	private long mobile_no;
	
	@Column(nullable=false)
	private String sms_content;
	
	@Column(nullable=false)
	private int sms_check;
	
	private String get_response;
	
	
	
	public long getBen_id() {
		return ben_id;
	}
	public void setBen_id(long ben_id) {
		this.ben_id = ben_id;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getSms_content() {
		return sms_content;
	}
	public void setSms_content(String sms_content) {
		this.sms_content = sms_content;
	}
	public int isSms_check() {
		return sms_check;
	}
	public void setSms_check(int sms_check) {
		this.sms_check = sms_check;
	}
	public String getGet_response() {
		return get_response;
	}
	public void setGet_response(String get_response) {
		this.get_response = get_response;
	}
	@Override
	public String toString() {
		return "Smsbean [ben_id=" + ben_id + ", adharno=" + adharno + ", mobile_no="
				+ mobile_no + ", sms_content=" + sms_content + ", sms_check=" + sms_check + ", get_response="
				+ get_response + "]";
	}
	

	
	
	
}
