/**
 * 
 */
package com.subhash.javabasics.sortings;

import java.util.Scanner;

/**
 * @author Subhash
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number of elements of your choice");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the "+size+" elements to be sorted");
		for(int i=0;i<size;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("The Array elements Before sorting are ");
		Array_Display(a);
		Sort_Array(a);
		System.out.println("The Array elements After sorting are ");
		Array_Display(a);
		s.close();
	}

	
	private static void Array_Display(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
	}
	
	private static void Sort_Array(int[] a) {
		int n=a.length,p,i,j,temp;
		for(i=0;i<n-1;i++) {
			p=i;
			
			for(j=i+1;j<n;j++) {
				if(a[p]>a[j])
					p=j;
			}
			temp = a[p];
			a[p] = a[i];
			a[i] = temp;
		}
		
	}

}
