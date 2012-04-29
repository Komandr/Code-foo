/*
 * Author: Astrid Unger
 * 
 * Assignment:
 * You own a license plate manufacturing company.
 * Write a program that takes a population and determines the simplest pattern that will produce
 * enough unique plates. Since all the plates that match the pattern will be generated, find the
 * pattern that produces the least excess plates. Use a combination of letters (A-Z) and numbers (0-9). 
 * 
 * Contains: Main
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)
	{
		System.out.print("Enter the population number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input = null;
	    
	    //read the input. is no input given -> exception
	    try
	    {
	    	input = br.readLine();
	    } catch (IOException ioe) {
	        System.out.println("IO error trying to read your input!");
	        System.exit(1);
	    }
	    
	    //as the input is a string -> parse to double
	    double population = Double.parseDouble(input);
	    
	    CalcPlates calcPlates = new CalcPlates(population);
	    calcPlates.calculate(0,0);
	    calcPlates.getResult();
	}
}