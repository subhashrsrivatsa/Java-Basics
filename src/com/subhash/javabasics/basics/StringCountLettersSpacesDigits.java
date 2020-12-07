/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 *
 *
 */
public class StringCountLettersSpacesDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence with Letters, Digits and spaces");
		String input = s.nextLine();
		count(input);
		s.close();

	}

	private static void count(String input) {
		char letter [] = input.toCharArray();
		int countLetter = 0, countSpace = 0, countDigits = 0;
		for(int i = 0;i<letter.length;i++) {
			if(Character.isDigit(letter[i])) {
				countDigits++;
			}
			if(Character.isLetter(letter[i])) {
				countLetter++;
			}
			if(Character.isSpaceChar(letter[i])) {
				countSpace++;
			}
		}
		System.out.println("Number of Letters are : "+countLetter);
		System.out.println("Number of Digits are : "+countDigits);
		System.out.println("Number of Letters are : "+countSpace);
		
	}

}
