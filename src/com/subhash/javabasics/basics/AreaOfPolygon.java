/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class AreaOfPolygon {

	/**
	 * @param args
	 * 
	 * Write a Java program to compute the area of a polygon.
	 * Area of a polygon = (n*s^2)/(4*tan(pi/n)) , where n is n-sided polygon and s is the length of a side
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of sides for the polygon");
		int n = s.nextInt();
		System.out.println("Enter the length of the sides");
		double l = s.nextDouble();
		System.out.println("The Area of the Polygon with side "+n+" and length "+l+" is : "+areaPolygon(n,l));
		s.close();

	}

	public static double areaPolygon(int n, double l) {
		return (n*l*l)/(4*Math.tan(Math.PI/n));
	}

}
