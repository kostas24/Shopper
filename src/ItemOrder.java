// Project 1 - Shopping Cart
// ItemOrder.java
// Konstantinos Georgiou
// 2/25/22
// This is project 1 where we create supporting classes to develop the back-end
// of a shopping program. 

public class ItemOrder {

	private Item item;
	private int quantity;
	
	/*
	Constructor that creates an item order for the given item and given 
	quantity.  The quantity will be an integer.
	 */
	
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	//Returns the cost for this item order.
	public double getPrice()
	{
		return item.priceFor(quantity);
	}
	
	//Returns a reference to the item in this order.
	public Item getItem() {
		return item;
	}
}
