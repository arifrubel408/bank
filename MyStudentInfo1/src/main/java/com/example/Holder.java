package com.example;

import org.springframework.stereotype.Service;

@Service
public class Holder {

	int id;
	String name, email;
	String round;
	
	
	public Holder() {
		super();
	}


	public Holder(int id, String name, String email, String round) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.round = round;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getRound() {
		return round;
	}


	public void setRound(String round) {
		this.round = round;
	}
	
	

}
