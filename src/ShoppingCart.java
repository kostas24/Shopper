// Project 1 - Shopping Cart
// ShoppingCart.java
// Konstantinos Georgiou
// 2/25/22
// This is project 1 where we create supporting classes to develop the back-end
// of a shopping program. 

import java.util.ArrayList;

public class ShoppingCart {

	
	private double discount = 0;
	private double total =0;
	
	private ArrayList<ItemOrder> order;
	
	//Constructor that creates an empty list of item orders.
	public ShoppingCart() {
		order = new ArrayList<ItemOrder>();
		total =0;
	}
	
	/*
	Adds an item order to the list, replacing any previous order for this item 
	with the new order.  The parameter will be of type ItemOrder.
	 */	
    public boolean add(ItemOrder itemOrder) {
	        
		  for (int i = 0; i < order.size(); i++) {
	          ItemOrder temporary = order.get(i);
	          if ((temporary.getItem()).equals(itemOrder.getItem()))
	          {
	              order.set(i, itemOrder);
	              return true;
	          }
	      }
	        order.add(itemOrder);
	        return true;
	    }
	
	/*
	Sets whether or not this order gets a discount (true means there is a 
	discount, false means no discount).
	 */
	public void setDiscount(boolean value) {
		if(value)
			discount = total*.1;	
		else
			discount =0;
	}
	
	//Returns the total cost of the shopping cart.
	public double getTotal() {
		total =0;
		for(int i =0; i <order.size(); i++)
		{
			total += order.get(i).getPrice();
		}
		return total-discount;
	}
	
	

	
	
	
}
