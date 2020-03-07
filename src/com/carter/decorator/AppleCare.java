package com.carter.decorator;

public class AppleCare extends AddOnDecorator{
	Macbook mac;
	
	public AppleCare(Macbook mac) {
		this.mac = mac;
	}
	@Override
	public String getPurchase() {
		
		return mac.getPurchase()+" + AppleCare";
	}

	@Override
	public int getTotalCost() {
		
		return 379+mac.getTotalCost();
	}

}
