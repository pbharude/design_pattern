/**
 * 
 */
package com.designpattern.creation.builder1;

/**
 * @author pratimesh
 *
 */
public class LunchOrderBeanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchOrderBean bean =  new LunchOrderBean();
		bean.setBread("Wheat");
		bean.setCondiments("Lettuce");
		bean.setDressing("Mustard");
		bean.setMeat("Ham");
		
		bean.print();
		System.out.println("test");
		
		
		System.out.println("Lunch Order Tele Scopic Constructor");
		
		
		
		System.out.println("Lunch Order Builder");
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("wheat").condiments("Lettuce").dressing("Mustard").meat("HAM");
		LunchOrder lunchOrder = builder.build();
		
		lunchOrder.print();
		

	}

}
