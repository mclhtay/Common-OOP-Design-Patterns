package com.carter.abstractFactory;

//concrete implementation 2 of abstract product 2
public class RazerBlade implements PowerPC {

	@Override
	public void produce(int ram, int storage) {

		System.out.println(  "Razer Blade Studio: "+ram+"GB of Ram and "+storage+" GB of Storage"+" is produced");
	}

}
