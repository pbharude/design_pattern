package com.designpattern.structural.bridge.demo;

public class Details {
	private String label;
	private String value;
	
	public Details(String label, String value) {
		this.label= label;
		this.value = value;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String getValue() {
		return value;
	}
}
