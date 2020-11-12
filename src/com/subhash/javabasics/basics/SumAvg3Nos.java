/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * 
 *  Write a Java program that takes three numbers as input to calculate and print the average of the numbers 
 *
 */
public class SumAvg3Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the 3 number of your choice");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		double sum = a+b+c;
		double avg = sum/3;
		System.out.println("The SUM of "+a+","+b+" and "+c+" is : "+sum);
		System.out.println("The AVERAGE of "+a+","+b+" and "+c+" is : "+avg);
		
		s.close();

	}

}
