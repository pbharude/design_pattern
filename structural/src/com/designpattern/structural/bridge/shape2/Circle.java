package com.designpattern.structural.bridge.shape2;

public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
		
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		color.applyColor();
	}

}
