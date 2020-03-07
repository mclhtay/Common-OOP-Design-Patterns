package com.carter.decorator;

//another concrete implementation of the Macbook
public class MagicKeyboard extends AddOnDecorator{

	Macbook mac;
	public MagicKeyboard(Macbook mac) {
		this.mac = mac;
	}
	
	@Override
	public int getTotalCost() {
		
		return 130+mac.getTotalCost();
	}

	@Override
	public String getPurchase() {
		
		return mac.getPurchase()+" + Magic Keyboard";
	}

}
