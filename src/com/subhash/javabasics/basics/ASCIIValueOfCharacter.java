/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to print the ascii value of a given character.
 *
 */
public class ASCIIValueOfCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character of your choice");
		char c = s.next().charAt(0);
		System.out.println("The ASCII value is : "+(int)c);
		s.close();
	}

}
