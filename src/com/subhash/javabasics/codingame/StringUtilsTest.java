/**
 * 
 */
package com.subhash.javabasics.codingame;

/**
 * @author Subhash
 *
 */
public class StringUtilsTest {

	/**
	 * @param args
	 */
	
	static String concat(String[] strings) {
		
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"f","o","o","bar"}; 
		concat(a);
		String s = "A";
		System.out.println("\n"+s.toLowerCase());

	}

}
