package com.learn.Collections;

import java.util.*;

public class TestOrders {

	public static void main(String[] args) {
		// order collections
		ArrayList languages = new ArrayList();
		languages.add("Java");
		languages.add("Swift");
		languages.add("JavaScript");

		System.out.println(languages);
		// Array Iterator
		Iterator i = languages.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// List Iterator
		ListIterator i2 = languages.listIterator();
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

		// Lists
		ArrayList list = new ArrayList();
		list.add(0, "Roamed");
		list.add(1, "Gotham City");
		list.add(2, "Metropolis");
		list.add(3, "Geneva");
		System.out.println(list);
		
		// doubt list.set(0,"London") throws an error - check

		// Removing from an array list
		list.remove(2);
		System.out.println(list);
	}

}
