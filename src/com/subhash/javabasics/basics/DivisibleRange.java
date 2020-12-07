/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number
 *
 */
public class DivisibleRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting range");
		int start = s.nextInt();
		System.out.println("Enter the ending range");
		int end = s.nextInt();
		System.out.println("Enter the number of which you want to find the divisibility");
		int n = s.nextInt();
		System.out.println("The numbers which are divisible by "+n+" are ");
		int count=0;
		for(int i=start;i<=end;i++) {
			if(i%n==0) {
				System.out.print(i+"  ");
				count++;
			}
		}
		System.out.println("\nTotal number of integers are : "+count);
		s.close();
	}

}
