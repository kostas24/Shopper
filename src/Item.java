// Project 1 - Shopping Cart
// Item.java
// Konstantinos Georgiou
// 2/25/22
// This is project 1 where we create supporting classes to develop the back-end
// of a shopping program. 

import java.text.*;
public class Item {

	private String name;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;
	
	
	/*
	Constructor that takes a name and a price as arguments.  The name will 
	be a String and the price will be a double. Should throw an 
	IllegalArgumentException is price is negative.
	 */
	public Item(String name, double price) throws IllegalArgumentException
	{
		//is this needed?
		this.name = name;
		this.price = price;
		
		if(price < 0) {
			throw new IllegalArgumentException("Price must be greater than 0");
		}
	}
	/*
	 Constructor that takes a name and a single-item price and a bulk 
	quantity and a bulk price as arguments.  The name will be a String and 
	the quantity will be an integer and the prices will be doubles.  Should 
	throw an IllegalArgumentException if any number is negative.
	 */
	public Item(String name, double price, int bulkQuantity, double bulkPrice)throws IllegalArgumentException {
		
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
		
		if(price < 0 || bulkPrice < 0 || bulkQuantity < 0) {
			throw new IllegalArgumentException();
		}
	}
	/*
	 Returns the price for a given quantity of the item (taking into account 
	bulk price, if applicable).  Quantity will be an integer.  Should throw an 
	IllegalArgumentException if quantity is negative.
	 */
	public double priceFor(int quantity){	
		
		double cost =0;
		
		if(quantity < 0)
		{
			throw new IllegalArgumentException();	
		}	
		else 
			{
			if (bulkQuantity != 0)
			{			
				cost = ((quantity / bulkQuantity) * bulkPrice) + ((quantity % bulkQuantity) * price);
			}
			else
				cost = quantity*price;
			}
		return cost;
		
	}
	
	/*
	 Returns a String representation of this item: name followed by a comma 
	and space followed by price.  If this has a bulk price, then you should 
	append an extra space and a parenthesized description of the bulk 
	pricing that has the bulk quantity, the word “for” and the bulk price.
	 */
	
	public String toString() { 
		
		NumberFormat nf = (NumberFormat) NumberFormat.getCurrencyInstance();
		
		if(bulkQuantity != 0) {
			return name + ", " + nf.format(price) + " (Bulk quantity " +bulkQuantity + " for " + nf.format(bulkPrice)+ ")";
		}
		else
			return name + ", " + nf.format(price);
	}
}
