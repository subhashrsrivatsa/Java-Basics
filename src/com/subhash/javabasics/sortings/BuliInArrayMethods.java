/**
 * 
 */
package com.subhash.javabasics.sortings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class BuliInArrayMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the Array");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The Array elements Before sorting are ");
		Array_Display(a);
		Arrays.sort(a);
		System.out.println("The Array elements After sorting are ");
		Array_Display(a);
		System.out.println("Enter the number to be searched in the array");
		int key = s.nextInt();
		System.out.println("The element ss found in : "+((Arrays.binarySearch(a,key))+1) +" position");
		System.out.println("Array ements after converting into strings are : "+Arrays.toString(a));

	}
	private static void Array_Display(int[] a) {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
}

}
