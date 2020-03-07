package com.carter.decorator;

public class Client {

	public static void main(String [] args) {
		Macbook newMacbook = new MacbookAir();
		System.out.println(newMacbook.getPurchase()+": $"+newMacbook.getTotalCost());
		
		Macbook anotherMacbook = new MacbookPro();
		anotherMacbook = new MagicMouse(anotherMacbook);
		anotherMacbook  = new MagicKeyboard(anotherMacbook);
		anotherMacbook = new AppleCare(anotherMacbook);
		
		System.out.println(anotherMacbook.getPurchase()+" : $"+anotherMacbook.getTotalCost());
	}
}
