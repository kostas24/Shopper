// Project 1 - Shopping Cart
// ShoppingMain.java
// Konstantinos Georgiou
// 2/25/22
// This is project 1 where we create supporting classes to develop the back-end
// of a shopping program. 
// ShoppingMain provides method main for a simple shopping program.

public class ShoppingMain {
    public static void main(String[] args) {
        Catalog list = new Catalog("CS Gift Catalog");
        list.add(new Item("Silly putty", 3.95, 10, 19.99));
        list.add(new Item("Silly string", 3.50, 10, 14.95));
        list.add(new Item("Bottle of bubbles", 0.99));
        list.add(new Item("Playstation 5 System", 499.99));
        list.add(new Item("Battlefield (PS5)", 49.99));
        list.add(new Item("Call of Duty (PS5)", 49.99));
        list.add(new Item("Pack of Pens", 3.40));
        list.add(new Item("Rubik's cube", 9.10));
        list.add(new Item("Toy doll", 19.99));
        list.add(new Item("'Java Rules!' button", 0.99, 10, 5.0));
        list.add(new Item("'Java Rules!' bumper sticker", 0.99, 20, 8.95));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
        
    }
}
