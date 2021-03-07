/**
 * 
 */
package com.subhash.javabasics.basics.beginner;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class AreaAndPerimeterOfRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the Rectangle");
		double l = s.nextDouble();
		double b = s.nextDouble();
		AreaAndPerimeterOfRectangle aRectangle = new AreaAndPerimeterOfRectangle();
		aRectangle.area(l,b);
		aRectangle.peri(l,b);
		s.close();
	}

	private void peri(double l, double b) {
		System.out.println("The AREA of Rectangle with Length "+l+" and Breadth "+b+" is : "+(l*b));
		
	}

	private void area(double l, double b) {
		System.out.println("The PERIMETER of Rectangle with Length "+l+" and Breadth "+b+" is : "+(l+b)+" sq. units");
		
	}

}
