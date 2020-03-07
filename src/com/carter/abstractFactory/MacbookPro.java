package com.carter.abstractFactory;

//concrete implementation of abstract product 2
public class MacbookPro implements PowerPC {

	@Override
	public void produce(int ram, int storage) {

		System.out.println(  "Macbook Pro: "+ram+"GB of Ram and "+storage+" GB of Storage"+" is produced");
	}

}
