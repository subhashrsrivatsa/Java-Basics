/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to divide two numbers and print on the screen
 *
 */
public class DivisionOf2Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers of your choice");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		
		double quotient = a/b;
		
		System.out.println("The QUOTIENT of "+a+" and "+b+" is : "+quotient);
		s.close();
	}

}
