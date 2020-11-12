/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to print the sum of two numbers.
 *
 */
public class SumOf2Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers of your choice");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = a+b;
		
		System.out.println("The SUM of "+a+" and "+b+" is : "+sum);
		s.close();
	}

}
