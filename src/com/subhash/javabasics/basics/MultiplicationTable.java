/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program that takes a number as input and prints its multiplication table upto 10
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number of your choice");
		Scanner s  = new Scanner(System.in);
		int a = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		s.close();

	}

}
