package com.example.demo.vo;

import lombok.Data;

@Data
public class Practice {
	private Integer id;
	private String name;
	private String address;
	private String phone;
	private String destination;
	public Practice(String name, String address, String phone, String destination) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.destination = destination;
	}
	
	
}
