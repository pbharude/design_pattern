package com.designpattern.structural.bridge.demo;

import java.util.List;

public interface Formatter {
	String format(String header, List<Details> details);
}
