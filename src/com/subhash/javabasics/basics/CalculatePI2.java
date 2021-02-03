/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class CalculatePI2 {

	public static boolean isInside (double xPos, double yPos)	
	{   
		boolean result;   
		double distance = Math.sqrt((xPos * xPos) + (yPos * yPos)); 
		if (distance < 1)
			result = false; 
			return(distance < 1); 
	}
	
	public static double computePI (int numThrows)
	{  
		Random randomGen = new Random (System.currentTimeMillis());		
		int hits = 0;
		double PI = 0;		 
		
		for (int i = 0; i <= numThrows; i++)
		{   
			double xPos = (randomGen.nextDouble()) * 2 - 1.0;
			double yPos = (randomGen.nextDouble()) * 2 - 1.0;
			if (isInside(xPos, yPos)) 
			{
				hits++;
			}
			PI = (4 * (hits/numThrows));
		}
		return PI; 
	}
 
	public static void main (String[] args)
	{ 
		Scanner reader = new Scanner (System.in);
		System.out.println("This program approximates PI using the Monte Carlo method.");
		System.out.println("It simulates throwing darts at a dartboard.");
		System.out.print("Please enter number of throws: ");
		int numThrows = reader.nextInt();
		double PI = computePI(numThrows);
		double Difference = PI - Math.PI;
		System.out.println ("Number of throws = " + numThrows + ", Computed PI = " + PI + ", Difference = " + Difference );		
		reader.close();
	}
}
