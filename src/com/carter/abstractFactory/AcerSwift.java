package com.carter.abstractFactory;

//concrete implementation 2 of abstract product 1
public class AcerSwift implements SuperBook {

	@Override
	public void produce(int ram, int storage) {

		System.out.println( "Acer Swift: "+ram+"GB of Ram and "+storage+" GB of Storage"+" is produced");
	}

}
