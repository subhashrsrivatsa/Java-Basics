/**
 * 
 */
package com.subhash.javabasics.strings;

/**
 * @author Subhash
 *
 */
public class BuliInStringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "I am Subhash ravindra SRIVATSA";
		String address = "I live in NICE";
		System.out.println(s);
		System.out.println("<y first name is : "+s.substring(5,12));
		System.out.println("My Last name is : "+s.substring(22));
		System.out.println(" "+s.concat(address));
		System.out.println("Is the address empty : "+address.isEmpty());

	}

}
