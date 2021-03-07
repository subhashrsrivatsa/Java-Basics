/**
 * 
 */
package com.subhash.javabasics.sortings;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class BubbleSort {

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
		Sort_Array(a);
		System.out.println("The Array elements After sorting are ");
		Array_Display(a);
		s.close();
	}

	
	private static void Array_Display(int[] a) {
			for(int i=0; i<a.length;i++) {
				System.out.println(a[i]+" ");
			}
	}

	private static void Sort_Array(int[] a) {
		int l=a.length,i,j,temp;
		for(i=0;i<l;i++) {
			for(j=0;j<l-i-1;j++) {
				if(a[j+1] < a[j]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
