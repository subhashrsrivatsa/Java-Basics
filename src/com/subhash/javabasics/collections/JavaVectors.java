/**
 * 
 */
package com.subhash.javabasics.collections;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Subhash SRIVATSA
 *
 */
public class JavaVectors {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Vector<String> names = new Vector<String>();
		names.add("Rohit");
		names.add("Rahul");
		names.add(0, "Virat");
		displayNames(names);
		names.clear();
		displayNames(names);
	}

	private static void displayNames(Vector<String> names) {
		Iterator<String> it = names.iterator();
		if(names.isEmpty()) {
			System.out.println("There are no players");
		}
		while(it.hasNext()) {
			System.out.println(" "+it.next());
		}
	}

}
