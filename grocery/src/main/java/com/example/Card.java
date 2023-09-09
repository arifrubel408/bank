package com.example;

import java.sql.Date;

public class Card {

	 int c_id, p_id;
	 String p_title;
	 String weight; 
	 double p_price;
	 int p_stock;
	 String p_type;
	 Date p_manuf;
	 Date p_expire;
	 String p_notes;
	 String p_img;
	 
	public Card() {
		super();
	}

	public Card(int c_id, int p_id, String p_title, String weight, double p_price, int p_stock, String p_type,
			Date p_manuf, Date p_expire, String p_notes, String p_img) {
		super();
		this.c_id = c_id;
		this.p_id = p_id;
		this.p_title = p_title;
		this.weight = weight;
		this.p_price = p_price;
		this.p_stock = p_stock;
		this.p_type = p_type;
		this.p_manuf = p_manuf;
		this.p_expire = p_expire;
		this.p_notes = p_notes;
		this.p_img = p_img;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_title() {
		return p_title;
	}

	public void setP_title(String p_title) {
		this.p_title = p_title;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public double getP_price() {
		return p_price;
	}

	public void setP_price(double p_price) {
		this.p_price = p_price;
	}

	public int getP_stock() {
		return p_stock;
	}

	public void setP_stock(int p_stock) {
		this.p_stock = p_stock;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	public Date getP_manuf() {
		return p_manuf;
	}

	public void setP_manuf(Date p_manuf) {
		this.p_manuf = p_manuf;
	}

	public Date getP_expire() {
		return p_expire;
	}

	public void setP_expire(Date p_expire) {
		this.p_expire = p_expire;
	}

	public String getP_notes() {
		return p_notes;
	}

	public void setP_notes(String p_notes) {
		this.p_notes = p_notes;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

		
	 
	

	 
}
