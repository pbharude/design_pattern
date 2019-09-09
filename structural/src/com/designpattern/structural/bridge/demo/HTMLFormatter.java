package com.designpattern.structural.bridge.demo;

import java.util.List;

public class HTMLFormatter implements Formatter {

	@Override
	public String format(String header, List<Details> details) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		builder.append("<th>");
		builder.append("Classification");
		builder.append("</th>");
		builder.append("<th>");
		builder.append(header);
		builder.append("</th>");
		
		details.forEach(detail-> {
			builder.append("<tr><td>");
			builder.append(detail.getLabel());
			builder.append("</td><td>");
			builder.append(detail.getValue());
			builder.append("</td></tr>");
		});
		
		builder.append("</table>");
		return builder.toString();
	}

}
