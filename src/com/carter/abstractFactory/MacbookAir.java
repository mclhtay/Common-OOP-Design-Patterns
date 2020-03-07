package com.carter.abstractFactory;

//concrete implementation of abstract product 1
public class MacbookAir implements SuperBook {

	@Override
	public void produce(int ram, int storage) {

		System.out.println( "Macbook Air: "+ram+"GB of Ram and "+storage+" GB of Storage"+" is produced");
	}



}
