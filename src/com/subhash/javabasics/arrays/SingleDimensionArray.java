/**
 * 
 */
package com.subhash.javabasics.arrays;

import java.util.Arrays;

/**
 * @author Subhash
 *
 */
public class SingleDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = {10,20,30,40,50,60};
		System.out.println("--Elements of 1st Array using For loop ---");
		for(int i=0;i<array.length;i++) {
			System.out.println("Element at Index "+i+" is : "+array[i]);
		}
		System.out.println("\n------------------------------------------");
		
		System.out.println("\n--Elements of 2nd Array using For each --");
		for(int i:array){
			System.out.print(i+" ");
		}
		System.out.println("\n------------------------------------------");
		
		System.out.println("\nThe number of elements in the Array is : "+array.length);
		
		int[] dupArray = array.clone();
		System.out.println("\nElements of 2nd Array after cloning 1st Array");
		for(int i:dupArray){
			System.out.print(i+" ");
		}
		System.out.println("\n------------------------------------------");
		
		if(Arrays.equals(array,dupArray)){
			System.out.println("\nTwo arrays have been perfectly cloned");
		}
	}

}
