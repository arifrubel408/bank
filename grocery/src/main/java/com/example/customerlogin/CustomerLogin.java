package com.example.customerlogin;

public class CustomerLogin {
	int customer_id;
	String customer_email;
	public CustomerLogin() {
		super();
	}
	public CustomerLogin(int customer_id, String customer_email) {
		super();
		this.customer_id = customer_id;
		this.customer_email = customer_email;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	
	
}
