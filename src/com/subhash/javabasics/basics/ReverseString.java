/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to reverse a string.
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string of your choice");
		char[] letters = s.nextLine().toCharArray();
		for(int i = letters.length -1; i>=0; i--) {
			System.out.print(letters[i]);
		}
		s.close();
	}

}
