/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to accepts an integer and count the factors of the number. 
 *
 */
public class FactorsOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of your choice");
		int n = s.nextInt();
		System.out.println(result(n));
		s.close();
	}

	private static int result(int n) {
		int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(n); i++) {
            if(n%i==0 && i*i!=n) {
                ctr+=2;
            } else if (i*i==n) {
                ctr++;
            }
        }
        return ctr;
	}

}
