package com.designpattern.structural.bridge.demo;

import java.util.List;

public abstract class Printer {
	public Printer() {
		
	}
	
	public String print (Formatter formatter) {
		return formatter.format(getHeader(),getDetails());
	}

	protected abstract List<Details> getDetails();

	abstract protected String getHeader() ;
}
