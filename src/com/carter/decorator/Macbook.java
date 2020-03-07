package com.carter.decorator;

// using decorator design pattern to show the purchase of a new Apple Laptop, decorated with add-ons
public abstract class Macbook {

	String name = "Macbook Model";
	
	public String getPurchase() {
		return name;
	}
	
	public abstract int getTotalCost();
}
