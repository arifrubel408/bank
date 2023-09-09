package com.example.customerInfo;

import java.sql.Date;

public class CustomerInfo {
	int customer_id;
    String customer_name;
	String customer_email;
    String customer_gender;
    Date customer_dob;
    String customer_address;
    int customer_mobile;
	String customer_img;
	public CustomerInfo() {
		super();
	}
	public CustomerInfo(int customer_id, String customer_name, String customer_email, 
			String customer_gender, Date customer_dob, String customer_address, int customer_mobile, String customer_img) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
		this.customer_gender = customer_gender;
		this.customer_dob = customer_dob;
		this.customer_address = customer_address;
		this.customer_mobile= customer_mobile;
		this.customer_img = customer_img;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public Date getCustomer_dob() {
		return customer_dob;
	}
	public void setCustomer_dob(Date customer_dob) {
		this.customer_dob = customer_dob;
	}
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	
	public int getCustomer_mobile() {
		return customer_mobile;
	}
	public void setCustomer_mobile(int customer_mobile) {
		this.customer_mobile = customer_mobile;
	}
	public String getCustomer_img() {
		return customer_img;
	}
	public void setCustomer_img(String customer_img) {
		this.customer_img = customer_img;
	}
	
	

}
