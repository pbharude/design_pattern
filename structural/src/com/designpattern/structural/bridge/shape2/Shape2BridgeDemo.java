package com.designpattern.structural.bridge.shape2;

public class Shape2BridgeDemo {

	public static void main(String[] args) {

		Color blue = new Blue();
		Shape square = new Square(blue);
		Color red = new Red();
		Shape circle = new Circle(red);
		square.applyColor();
		circle.applyColor();
		Color green = new Green();
		Shape rectangle = new Rectangle(green);
		rectangle.applyColor();
	}

}
