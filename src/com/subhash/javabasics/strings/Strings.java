/**
 * 
 */
package com.subhash.javabasics.strings;

/**
 * @author Subhash
 *
 */
public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String p = "foo";
		
		System.out.println(Strings.isFoo(p));
	}

	private static boolean isFoo(String p) {
		if (p=="foo") {
			return true;
		}
		else
			return false;
	}

}
