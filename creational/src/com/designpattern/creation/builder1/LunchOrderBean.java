/**
 * 
 */
package com.designpattern.creation.builder1;

/**
 * @author pratimesh
 * 
 * Approach 1:
 * Getter and setter
 *  
 */
public class LunchOrderBean {
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderBean() {
		
	}
	
	
	/**
	 * @return the bread
	 */
	public String getBread() {
		return bread;
	}
	/**
	 * @param bread the bread to set
	 */
	public void setBread(String bread) {
		this.bread = bread;
	}
	/**
	 * @return the condiments
	 */
	public String getCondiments() {
		return condiments;
	}
	/**
	 * @param condiments the condiments to set
	 */
	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}
	/**
	 * @return the dressing
	 */
	public String getDressing() {
		return dressing;
	}
	/**
	 * @param dressing the dressing to set
	 */
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	/**
	 * @return the meat
	 */
	public String getMeat() {
		return meat;
	}
	/**
	 * @param meat the meat to set
	 */
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	
	public void print() {
		System.out.println(this.getBread());
		System.out.println(this.getCondiments());
		System.out.println(this.getDressing());
		System.out.println(this.getMeat());
	}

}
