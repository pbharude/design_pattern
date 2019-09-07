package com.designpattern.creation.builder1;

public class LunchOrder {
	public static class Builder{
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public Builder() {
			
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
	}
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	
	public LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}
	
	
	public void print() {
		System.out.println(this.getBread());
		System.out.println(this.getCondiments());
		System.out.println(this.getDressing());
		System.out.println(this.getMeat());
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
