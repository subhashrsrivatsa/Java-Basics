/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class AreaOfHexagon {

	/**
	 * @param args
	 * 
	 * Write a Java program to compute the area of a hexagon.
	 * Area of a hexagon = (6 * s^2)/(4*tan(pi/6)) , where s is the length of a side
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of a side for the Hexagon");
		double l = s.nextDouble();
		System.out.println("The Area of Hexagon with side "+l+" is "+areaHexa(l));
		s.close();
	}

	private static double areaHexa(double l) {
		double pi = Math.PI;
		return ((6*l*l)/(4 * Math.tan(pi/6)));
	}

}
