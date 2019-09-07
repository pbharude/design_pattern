package com.designpattern.creation.factory;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		// TODO Auto-generated method stub
		pages.add(new CartPage());
		pages.add(new ContactPage());
		pages.add(new ItemPage());
	}

}
