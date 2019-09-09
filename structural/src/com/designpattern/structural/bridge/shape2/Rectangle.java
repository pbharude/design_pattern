package com.designpattern.structural.bridge.shape2;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}
