/**
 * Design Pattern: Abstract Factory
 */
/**
 * @author pratimesh
 *
 */
/**
 * Design Pattern: Abstract Factory
 * 
 * Concepts:
 *  Factory of Factories
 *  Factory of related objects
 *  Common interface
 *  Defer to subclass
 *  Examples:
 * 	 DocumentBuilder
 * 
 * 
 * Design:
 *  Groups Factories together
 *  Factory is responsible for life-cycle
 *  Common Interface
 *  Concrete Classes
 *  Parameterized create method
 *  Composition
 *  
 * Pitfalls:
 * 	Complexity
 *  Runtime switch
 *  Pattern within a pattern
 *  problem specific
 *  Re-factoring
 *  
 * Contrast 
 * 
 * AbstractFactory
 *  Implemented with a Factory 
 *  Hides the Factory
 *  Abstracts Environment
 *  Build through composition
 *  
 * Factory
 *  Returns various instances
 *   Multiple constructors
 *  Interface/Contract driven
 *  Easier to unit test
 *  Adaptable to environment more easily 
 *  
 */package com.designpattern.creation.abstractfactory;