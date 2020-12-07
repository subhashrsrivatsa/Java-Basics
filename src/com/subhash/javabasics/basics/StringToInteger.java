/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to convert a string to an integer in Java.
 *
 */
public class StringToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the number");
		String s1 = s.next();
		Integer i = Integer.parseInt(s1);
		System.out.println("The value in integer is : "+i);
		s.close();
	}

}
