/**
 * 
 */
package com.subhash.javabasics.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Subhash SRIVATSA
 *
 */
public class JavaLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 10; i>0;i--) {
			li.add(i);
		}
		displayNumbers(li);
		li.addFirst(11);
		li.addLast(0);
		System.out.println("\nLinked List after adding new elements");
		displayNumbers(li);
		System.out.println("\nLinked List after puahing an element");
		li.push(12);
		displayNumbers(li);
		System.out.println("\nLinked List after popping an element");
		li.pop();
		displayNumbers(li);
		System.out.println("\nThe First element is : "+li.getFirst());
		System.out.println("The last element is : "+li.getLast());
	}

	private static void displayNumbers(LinkedList<Integer> li) {
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
	}

}
