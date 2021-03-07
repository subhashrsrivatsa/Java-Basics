/**
 * 
 */
package com.subhash.javabasics.arrays;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word of your choice");
		String s = scan.next();
		System.out.println("The length of your word is : "+s.length());
		System.out.println("The last character of your word is : "+s.charAt(s.length()-1));
		System.out.println("Enter another word of your choice");
		String input = scan.next();
		System.out.println("The String in Upper Case is : "+s.toUpperCase());
		System.out.println("The String after concatenating your word : "+s.concat(input));
		System.out.println("The two are same : "+s.equalsIgnoreCase(input));
		System.out.println("No of common letters in 2 words : "+s.compareTo(input));
		scan.close();
	}

}
