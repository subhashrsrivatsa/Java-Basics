/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to swap two variables
 *
 */
public class Swap2Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the 2 numbers of your choice");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("The values of a and b before swapping are : "+a+" and "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("The values of a and b after swapping are : "+a+" and "+b);
		s.close();

	}

}
