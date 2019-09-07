/**
 * 
 */
package com.designpattern.creation.prototype;

/**
 * @author pratimesh
 *
 */
public abstract class Item implements Cloneable {
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	private String title;
	private double price;
	private String url;
	
}
