package com.designpattern.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
	private int id;
	private String firstname;
	private String lastname;
	private String emailAddress;
	
	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values,",");
		if(tokenizer.hasMoreElements()) {
			id = Integer.parseInt(tokenizer.nextToken());
		}
		if(tokenizer.hasMoreElements()) {
			firstname = tokenizer.nextToken();
		}
		if(tokenizer.hasMoreElements()) {
			lastname = tokenizer.nextToken();
		}
		if(tokenizer.hasMoreElements()) {
			emailAddress = tokenizer.nextToken();
		}
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	

}
