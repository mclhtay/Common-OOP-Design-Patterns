package com.carter.visitor;

//a concrete implementation of shop
public class LV implements Shop{

	private String item;
	private int price;
	
	public LV(String item, int price) {
		this.item = item;
		this.price = price;
	}
	
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
		
	}
}
