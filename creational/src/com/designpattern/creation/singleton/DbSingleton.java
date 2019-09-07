/**
 * 
 */
package com.designpattern.creation.singleton;

/**
 * @author pratimesh
 * Lazyload helps to start time for application 
 * It helps 
 */
public class DbSingleton {
	/*
	 * Explain : volatile 
	 *
	 */
	private static volatile DbSingleton instance;
	
	private DbSingleton() {
		//Protects against reflection
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}
	
	//Rather than synchronized at function we are doing is with in the method
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized (DbSingleton.class) {
				if(instance == null) {
					//Lazily loaded
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}

}
