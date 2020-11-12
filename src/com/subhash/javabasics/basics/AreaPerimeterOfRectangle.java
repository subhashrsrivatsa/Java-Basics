/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to print the area and perimeter of a rectangle
 *
 */
public class AreaPerimeterOfRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the Length and Width of the Rectangle");
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int w = s.nextInt();
		
		int area = l*w;
		int peri = 2*(l+w);
		
		System.out.println("The AREA of Rectangle with Length "+l+" and Width "+w+" is : "+area+" sq units");
		System.out.println("The PERIMETER of Rectangle with Length "+l+" and Width "+w+" is : "+peri+" units");
		s.close();
	}

}
