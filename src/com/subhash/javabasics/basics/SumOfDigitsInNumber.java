/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class SumOfDigitsInNumber {

	/**
	 * @param args
	 * 
	 *  Write a Java program and compute the sum of the digits of an integer
	 *  
	 */
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the number of your choice");
		int num = s.nextInt();
		System.out.println("The sum of digits in "+num+" is : "+sumDigits(num));
		s.close();
	}

	public static int sumDigits(int num) {
		int sum = 0;
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		
		return sum;
	}

}
