// Project 1 - Shopping Cart
// Catalog.java
// Konstantinos Georgiou
// 2/25/22
// This is project 1 where we create supporting classes to develop the back-end
// of a shopping program. 

import java.util.*;

public class Catalog {

	private String name;
	private ArrayList<Item> list;
	
	/*
	 Constructor that takes the name of this catalog as a parameter.  The 
	name will be a String.
	 */
	public Catalog(String name) {
		list = new ArrayList<Item>();
		this.name= name;
	}
	
	
	//Adds an Item at the end of this list.
	public void add(Item item) {
		list.add(item);
		
	}
	//Returns the number of items in this list.
	public int size() {
		return list.size();
	}
	
	//Returns the Item with the given index (0-based).
	public Item get(int index) {
		return list.get(index);
	}
	
	//Returns the name of this catalog.
	public String getName() {
		return name;
	}
}
