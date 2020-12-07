/**
 * 
 */
package com.subhash.javabasics.basics;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * Write a Java program to find the penultimate (next to last) word of a sentence.
 *
 */
public class PenultimateWordInSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Input a Sentence: ");
	    String in = s.nextLine();
	    String[] words = in.split("[ ]+");
	    System.out.println("Penultimate word: "+words[words.length - 2]);
	    s.close();
	}

}
