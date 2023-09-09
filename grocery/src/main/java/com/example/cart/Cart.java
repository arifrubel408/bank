package com.example.cart;

public class Cart {

	int cart_id, p_id, customer_id;
	String p_name; 
	double p_quantity, unit_price, total_price;
	String p_img;
	
	public Cart() {
		super();
	}

	public Cart(int cart_id, int p_id, int customer_id, String p_name, double p_quantity, double unit_price, double total_price,
			String p_img) {
		super();
		this.cart_id = cart_id;
		this.p_id = p_id;
		this.customer_id=customer_id;
		this.p_name = p_name;
		this.p_quantity = p_quantity;
		this.unit_price = unit_price;
		this.total_price = total_price;
		this.p_img = p_img;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public double getP_quantity() {
		return p_quantity;
	}

	public void setP_quantity(double p_quantity) {
		this.p_quantity = p_quantity;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}
	
	
}
