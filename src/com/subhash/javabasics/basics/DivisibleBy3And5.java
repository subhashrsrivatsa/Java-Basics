/**
 * 
 */
package com.subhash.javabasics.basics;

/**
 * @author Subhash
 * 
 * Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both
 *
 */
public class DivisibleBy3And5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The numbers between 1 and 1000 that are divisible by 3 are ");
		for(int i=1; i<=100; i++) {
			if(i%3==0){
				System.out.print("\t"+i);
			}
		}
		System.out.println("\nThe numbers between 1 and 1000 that are divisible by 5 are ");
		for(int i=1; i<=100; i++) {
			if(i%5==0){
				System.out.print("\t"+i);
			}			
		}
		System.out.println("\nThe numbers between 1 and 1000 that are divisible by 3 and 5 are ");
		for(int i=1; i<=100; i++) {
			if(i%15==0){
				System.out.print("\t"+i);
			}			
		}
	}
}
