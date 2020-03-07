package com.carter.decorator;
//concrete implementation of macbook
public class IMac extends Macbook{

	public IMac() {
		name = "iMac";
	}
	
	@Override
	public int getTotalCost() {

		return 1700;
	}

}
