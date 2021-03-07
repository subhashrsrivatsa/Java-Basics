/**
 * 
 */
package com.subhash.javabasics.strings;

/**
 * @author Subhash
 *
 */
public class JavaStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Subhash ");
		System.out.println("My first name is : "+sb);
		System.out.println("The length of the string is : "+sb.length());
		System.out.println("My name is : "+sb.append("SRIVATSA"));
		System.out.println("The capacity of this String is : "+sb.capacity());
		System.out.println(sb.charAt(5));
		System.out.println(sb.equals("Subhash"));
		System.out.println("The substring of the main string is : "+sb.substring(7));
		System.out.println("The length of the string is : "+sb.length());
		System.out.println("The reverse of the given string is : "+sb.reverse());
		

	}

}
