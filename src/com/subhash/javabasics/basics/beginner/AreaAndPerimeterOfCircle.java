/**
 * 
 */
package com.subhash.javabasics.basics.beginner;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class AreaAndPerimeterOfCircle {

	/**
	 * @param args
	 */
	public static final double PI = 3.1428;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double radius = s.nextDouble();
		AreaAndPerimeterOfCircle aCircle = new AreaAndPerimeterOfCircle();
		aCircle.area(radius);
		aCircle.perimeter(radius);
		s.close();
	}

	private void perimeter(double radius) {
		System.out.println("Ther PERIMETER of Circle with Radius "+radius+" is :  "+(2*PI*radius));		
	}

	private void area(double radius) {
		System.out.println("The AREA of Circle with Radius "+radius+" is :  "+(PI*radius*radius)+" sq. units");		
	}

}
