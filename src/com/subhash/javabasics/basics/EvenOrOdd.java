/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to accept a number and check the number is even or not.
 *
 */
public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of your choice");
		int n = s.nextInt();
		if(n%2==0) {
			System.out.println(n+" is an EVEN Number");
		}
		else
			System.out.println(n+" is a ODD Number");
		s.close();
	}

}
