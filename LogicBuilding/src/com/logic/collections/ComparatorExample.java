package com.logic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {

		ArrayList<Banks> list = new ArrayList<>();
		list.add(new Banks(2562, "SBI", "Mumbai"));
		list.add(new Banks(4562, "ICICI", "Pune"));
		list.add(new Banks(5345, "PNB", "Banglore"));
		list.add(new Banks(3453, "RBI", "Noida"));
		list.add(new Banks(3452, "BOI", "Dehli"));
		list.add(new Banks(6465, "Maharashtra Bank", "Mumbai"));
		list.add(new Banks(6544, "Axis Bank", "Mumbai"));

		System.out.println("without sorting order:\n" + list);

		// by using Comparator Customize sorting order
		list.sort(new MyComparator());
		System.out.println("According to Comparator sorting order:\n" + list);
		
		ArrayList<String> set = new ArrayList<>();
		set.add("java");
		set.add("python");
		set.add("aem");
		set.add("ruby");
		set.add("scala");
		// by using sort method Natural sorting order
		Collections.sort(set);
		System.out.println("According sort method sorting order:\n" + set);

	}

}

class MyComparator implements Comparator<Banks> {

	@Override
	public int compare(Banks o1, Banks o2) {
		// Compare based on the bank names
		return o1.getName().compareTo(o2.getName());
//		compare based on bank code
//		return Integer.compare(o1.getCode(), o2.getCode());
//		
//		compare based on bank address
//		return o1.getAddress().compareTo(o2.getAddress());
	}
}