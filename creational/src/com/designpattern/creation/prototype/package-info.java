/**
 * Design Pattern: Prototype
 */
/**
 * @author pratimesh
 *
 */
/**
 * Design Pattern: Prototype
 * 
 * Concepts:
 *  Avoids costly creation
 *  Avoids subclassing
 *  typically doesn't use "New"
 *  Often utilizes an interface
 *  Usually implemented with a Registry
 *  Examples:
 * 	java.lang.Object#clone()
 * 
 * Design:
 *  Clone / Cloneable
 *  Avoids keyword "new"
 *  Although a copy, each instance unique
 *  costly construction not handled by client
 *  Can still utilize parameters for construction
 *  Shallow vs Deep Copy
 *  
 * Pitfalls:
 * 	Sometimes not clear when to use
 * 	Used with other patterns
 * 	 Registry
 *  Shallow VS Deep Copy
 *  
 * Contrast 
 * 
 * Prototype
 *  Lighter weight construction
 *   Copy constructor or Clone
 *  Shallow or Deep
 *  Copy of itself
 * 
 * Factory
 * 	Flexible Objects
 * 	 Multiple constructors
 *  Concrete Instance
 *  Fresh Instance
 *  
 */
package com.designpattern.creation.prototype;