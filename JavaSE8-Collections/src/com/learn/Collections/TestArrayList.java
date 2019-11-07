package com.learn.Collections;
import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// example for Collection - array list
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("World");
		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list1.add("Bruce Banner");
		list1.add("Barry Allen");
		list1.add("Bruce Wayne");
		list1.add("Clark Kent");
		list1.add("Sri Ramajeyam..!");
		System.out.println(list1);
		
		System.out.println(list.size() + " is the Size of the list array.");
		System.out.println(list1.size() + " is the size of the list1 array");
		
		ArrayList list2 = new ArrayList(4);
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("e");
		System.out.println(list2);
		list2.add("d");
		System.out.println(list2.get(4));
		System.out.println(list2);
		
		list1.remove(1);
		System.out.println(list1);
		list2.remove("e");
		System.out.println(list2);
		
		ArrayList cities = new ArrayList();
		cities.add("London");
		cities.add("Frankfort");
		cities.add("Geneva");
		cities.add("Swiss");
		cities.add("Gotham City");
		System.out.println("The list of cities are..!\n" + cities);
		if(cities.contains("Gotham City")) {
			System.out.println("Gotham City is a member...!");
		}
		
		// Iteration
		Iterator iter = cities.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Empty the lists
		if(!list.isEmpty()) {
			list.clear();
			System.out.println("list is cleared." + list);
		}
		if(!list1.isEmpty()) {
			list1.clear();
			System.out.println("List1 is cleared. " + list1);
		}
		if(!list2.isEmpty())
			list2.clear();
		if(!cities.isEmpty()) {
			cities.clear();
			System.out.println("Cities list also cleared. " + cities);
		}
		
	}

}
