/**
 * 
 */
package com.subhash.javabasics.basics;

/**
 * @author Subhash
 * 
 * Write a Java program to display the system time
 *
 */
public class CurrentSystemDateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.format("\nCurrent Date Time : %tc%n\n", System.currentTimeMillis());
	}

}
