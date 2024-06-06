package com.example.demo.vo;

import lombok.Data;

@Data
public class Account {
	private Integer id;
	private String username;
	private String password;
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
}
