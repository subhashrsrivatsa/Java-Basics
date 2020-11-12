/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
 *
 */
public class SimpleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers of your choice");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = a+b;
		int sub = a-b;
		int prod = a*b;
		int div = a/b;
		
		System.out.println("The SUM of "+a+" and "+b+" is : "+sum);
		System.out.println("The SUM of "+a+" and "+b+" is : "+sub);
		System.out.println("The SUM of "+a+" and "+b+" is : "+prod);
		System.out.println("The SUM of "+a+" and "+b+" is : "+div);
		s.close();

	}

}
