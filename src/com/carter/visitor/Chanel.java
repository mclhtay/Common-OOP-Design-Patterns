package com.carter.visitor;

//a concrete implementation of shop
public class Chanel implements Shop {

	private String bag;
	private int price;
	
	public Chanel(String itemName, int price) {
		this.bag = itemName;
		this.price = price;
	}
	
	public String getBag() {
		return bag;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
