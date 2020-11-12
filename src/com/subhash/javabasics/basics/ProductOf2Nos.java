/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program that takes two numbers as input and display the product of two numbers
 *
 */
public class ProductOf2Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers of your choice");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int prod = a*b;
		
		System.out.println("The PRODUCT of "+a+" and "+b+" is : "+prod);
		s.close();

	}

}
