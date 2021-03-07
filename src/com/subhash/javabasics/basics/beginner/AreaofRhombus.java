/**
 * 
 */
package com.subhash.javabasics.basics.beginner;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class AreaofRhombus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lengths of Diagonal 1 and 2 respectively");
		double d1 = s.nextDouble();
		double d2 = s.nextDouble();
		AreaofRhombus areaRhombus = new AreaofRhombus();
		areaRhombus.area(d1,d2);
		s.close();
	}

	private void area(double d1, double d2) {
		System.out.println("The Area of Rhombus is : "+((d1+d2)/2)+" sq. units");		
	}

}
