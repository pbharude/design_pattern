/**
 * 
 */
package com.designpattern.creation.builder1;

/**
 * @author pratimesh
 * Pitfall
 * Tele scopic Constructor
 */
public class LunchOrderBeanTele {
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderBeanTele(String bread){
		this.bread = bread;
	}
	
	public LunchOrderBeanTele (String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderBeanTele (String bread, String condiments, String drsssing) {
		this(bread,condiments);
		this.dressing = dressing;
	}
	
	public LunchOrderBeanTele(String bread, String condiments, String dressing, String meat) {
		this(bread,condiments,dressing);
		this.meat = meat;
	}
	
	
	
	/**
	 * @return the bread
	 */
	public String getBread() {
		return bread;
	}
	/**
	 * @return the condiments
	 */
	public String getCondiments() {
		return condiments;
	}
	/**
	 * @return the dressing
	 */
	public String getDressing() {
		return dressing;
	}
	/**
	 * @return the meat
	 */
	public String getMeat() {
		return meat;
	}
	

}
