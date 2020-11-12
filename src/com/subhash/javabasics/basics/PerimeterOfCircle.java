/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to print the area and perimeter of a circle
 *
 */
public class PerimeterOfCircle {

	/**
	 * @param args
	 */
	private static final double pi = 3.1428;
	
	public static void main(String[] args) {
		System.out.println("Enter the radius of the circle");
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		
		double peri = 2*pi*r;
		System.out.println("The Perimeter of Circle with Radius "+r+" is : "+peri);
		s.close();

	}

}
