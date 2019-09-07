/**
 * 
 */
package com.designpattern.creation.prototype;

/**
 * @author pratimesh
 *
 */
public class PrototypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registry registry= new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in  Java");
		printMovie(movie);
		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		
		printMovie(anotherMovie);
		
		
	}
	
	private static void printMovie(Movie m) {
		System.out.println(m);
		System.out.println(m.getRuntime());
		System.out.println(m.getTitle());
		System.out.println(m.getUrl());
	}

}
