/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to compare two numbers. 
 *
 */
public class Compare2Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 2 numbers to be compared");
		int a = s.nextInt();
		int b = s.nextInt();
		if(a<b) {
			System.out.println(a+" is less than "+b);
		}
		else if(a==b) {
			System.out.println(a+" is equal to "+b);
		}
		else 
			System.out.println(a+" ss greater than "+b);
	}
}
