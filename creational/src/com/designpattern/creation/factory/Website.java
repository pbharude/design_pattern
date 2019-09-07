/**
 * 
 */
package com.designpattern.creation.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pratimesh
 *
 */
public abstract class Website {
	protected List<Page> pages = new ArrayList<>();
	
	public List<Page> getPages(){
		return pages;
	}
	
	public Website() {
		this.createWebsite();
	}
	
	public abstract void createWebsite();
}
