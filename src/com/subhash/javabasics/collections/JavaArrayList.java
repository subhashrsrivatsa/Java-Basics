/**
 * 
 */
package com.subhash.javabasics.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Subhash SRIVATSA
 *
 */
public class JavaArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] brands = {"bmw","volvo","citroen","renault","suzuki"};
		String[] model = {"z3","xoom","c4","zoe","swift"};
		
		ArrayList<String> carBrands = new ArrayList<String>();
		for(String s : brands) {
			carBrands.add(s);
		}
		ArrayList<String> carModels = new ArrayList<String>();
		for(String s1 : model) {
			carModels.add(s1);
		}
		System.out.println("The car brands in our showroom are : ");
		display(carBrands);
		System.out.println("\nAdded another model");
		carBrands.add("peugeot");
		display(carBrands);
		System.out.println("\nThe cars along woth their models are : ");
		carBrands.addAll(carModels);
		display(carBrands);
		System.out.println("\nTotal number of cars are : "+carBrands.size()+" and number of Brands are : "+carModels.size());
		if(carBrands.containsAll(carModels)) {
			System.out.println("\nAll the models are defined properly");
		}
		String carBoeing = "Boeing";
		if(!carBrands.contains(carBoeing)) {
			System.out.println("BOEING is not a Car brand");
		}
		
		

	}

	private static void display(ArrayList<String> cars) {
		Iterator<String> it = cars.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
	}

}
