/**
 * Design Pattern: Builder
 */
/**
 * @author pratimesh
 *
 */
/**
 * Design Pattern: Builder
 * 
 * Concepts:
 *  Handles complex constructors
 *  Large number of parameters
 *  Immutability
 *  Examples:
 * 	 String Builder
 * 	 DocumnentBuilder
 * 	 Locale.Builder
 * 
 * Design:
 *  Flexibility over telescoping constructor
 *  Static inner class
 *  Calls appropriate constructor 
 *  Negates the need for exposed setters
 *  Java 1.5+ can take advantage of Generics
 *  
 * Pitfalls:
 * 	Immutable
 * 	Inner static class
 *  Designed first
 *  Complexity
 *  
 * Contrast 
 * 
 * Builder
 * 	Handles complex constructors
 *  No Interface required
 *  Can be a separate class
 *  Works with legacy 
 * 
 * Prototype
 *  Implemented around a clone
 *  Avoids calling complex constructors
 *  Difficult to implement in legacy code
 *  
 */
package com.designpattern.creation.builder1;