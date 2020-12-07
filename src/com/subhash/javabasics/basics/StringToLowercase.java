/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to convert a given string into lowercase.
 *
 */
public class StringToLowercase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string of your choice");
		String str = s.nextLine();
		System.out.println("The given string in lowercase is : "+str.toLowerCase());
		s.close();
	}

}
