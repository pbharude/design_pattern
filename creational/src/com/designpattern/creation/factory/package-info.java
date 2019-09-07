/**
 * Design Pattern: Factory
 */
/**
 * @author pratimesh
 *
 */
/**
 * Design Pattern: Factory
 * 
 * Concepts:
 *  Doesn't expose instantiation logic
 *  Defer to subclasses
 *  Common interface
 *  Specified by architecture, implemented by user
 *  Examples:
 * 	 Calendar
 * 	 ResourceBundle
 *   NumberFormat
 * 
 * Design:
 *  Factory is responsible for life-cycle
 *  Common interface
 *  Concrete Classes
 *  Parameterized create method
 *  
 *  
 * Pitfalls:
 * 	Complexity
 *  Creation in subclass
 *  Re-factoring
 *  
 * Contrast 
 * 
 * Singleton 
 *  Returns same instance
 * 	 One constructor method - no Args
 *  No interface
 *  Difficult to unit test
 * 
 * Factory
 *  Returns various instances
 *   Multiple constructors
 *  Interface/Contract driven
 *  Easier to unit test
 *  Adaptable to environment more easily 
 *  
 */package com.designpattern.creation.factory;