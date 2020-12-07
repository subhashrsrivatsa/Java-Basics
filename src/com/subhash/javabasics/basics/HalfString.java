/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to extract the first half of a string of even length.
 *
 */
public class HalfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an even character string");
		String in = s.nextLine();
		if(in.length()%2==0) {
			System.out.println(in.substring(0, in.length()/2));
		}
		else
			System.out.println("The String is not even");
		s.close();
	}
}
