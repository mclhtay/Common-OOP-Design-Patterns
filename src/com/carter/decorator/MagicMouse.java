package com.carter.decorator;

//concrete implementation of decorator
public class MagicMouse extends AddOnDecorator{

	Macbook mac; //holds a reference to the Macbook that is having these add-ons
	
	public MagicMouse(Macbook mac) {
		this.mac = mac;
	}
	@Override
	public String getPurchase() {
		
		return mac.getPurchase()+" + Magic Mouse";
	}

	@Override
	public int getTotalCost() {
		return 119+mac.getTotalCost();
	}

}
