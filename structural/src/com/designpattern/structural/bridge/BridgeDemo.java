package com.designpattern.structural.bridge;

import com.designpattern.structural.bridge.demo.Formatter;
import com.designpattern.structural.bridge.demo.HTMLFormatter;
import com.designpattern.structural.bridge.demo.Movie;
import com.designpattern.structural.bridge.demo.MoviePrinter;
import com.designpattern.structural.bridge.demo.PrintFormatter;
import com.designpattern.structural.bridge.demo.Printer;

public class BridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:25");
		movie.setYear("2014");
		
		Formatter printeFormatter = new PrintFormatter();
		Printer moviePrinter =  new MoviePrinter(movie);
		String printedMaterial = moviePrinter.print(printeFormatter);
		
		Formatter htmlFormatter = new HTMLFormatter();
		
		System.out.println(printedMaterial);
		
		String htmlDetail = moviePrinter.print(htmlFormatter);
		

		System.out.println(htmlDetail);
	}

}
