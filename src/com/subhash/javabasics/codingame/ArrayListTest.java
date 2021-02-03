/**
 * 
 */
package com.subhash.javabasics.codingame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Subhash
 *
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(0);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		System.out.println(intList.stream().filter(i -> i==0).findAny());
		System.out.println(intList.size());
		System.out.println(IntStream.range(0, 4).sum());

	}

}
