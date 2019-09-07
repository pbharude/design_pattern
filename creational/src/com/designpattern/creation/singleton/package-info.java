/**
 * Design Pattern : Singleton
 */
/**
 * @author pratimesh
 *
 */
/**
 * Design Pattern : Singleton
 * 
 * Concepts:
 *  Only one instance created
 *  Guarantees control of a resource
 *  Lazily loaded
 *  Examples:
 * 	 Runtime
 *   Logger
 *   Spring Beans
 *   Graphic Managers
 * 
 * Design:
 *  Class is responsible for life cycle
 *  Static in nature(Static does not guarantee thread safe)
 *  Needs to be thread safe
 *  Private instance
 *  Private constructor 
 *  No parameters required for construction
 *  
 * Pitfalls:
 * 	Often overused
 *  Difficult to unit test
 *  It not careful, not thread safe
 *  Sometimes confused for factory
 * 
 * Contrast:
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
 *  Interface driven
 *  Easier to unit test
 *  Adaptable to environment more easily 
 */
package com.designpattern.creation.singleton;