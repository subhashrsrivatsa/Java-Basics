/**
 * 
 */
package com.subhash.javabasics.strings;

/**
 * @author Subhash
 *
 */
public class JavaStringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Subhash ");
		System.out.println("My first name is : "+sb);
		System.out.println("My full name is "+sb.append("SRIVATSA"));
		System.out.println("My complete name is : "+sb.insert(8, "Ravindra "));
		System.out.println("Using replace() method : "+sb.replace(0, 7, "SUBHASH"));
		System.out.println("My name in reversed order is : "+sb.reverse());
		System.out.println("The capacity of the string is : "+sb.capacity());
	}

}
