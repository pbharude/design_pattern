package com.designpattern.structural.bridge.shape1;

public class Shape1BridgeDemo {

	/**
	 * Now adding a Green Square, we need to create a new class
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = new BlueCircle();
		Square square = new RedSquare();
		
		circle.applyColor();
		square.applyColor();
	}

}
