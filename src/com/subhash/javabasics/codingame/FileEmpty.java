/**
 * 
 */
package com.subhash.javabasics.codingame;

import java.io.File;

/**
 * @author Subhash
 *
 */
public class FileEmpty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
	         File file = new File("demo1.txt");
	         file.createNewFile();
	         System.out.println("File: " + file);
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

	}

}
