package com.carter.adapter;

//adapting apes to humans
public class Adapter implements Human{
	
	private Ape ape;
	
	public Adapter(Ape ape) {
		this.ape = ape;
	}
	
	//the method for humans is now being used for an object of ape, thus adapting a human to an ape.
	@Override
	public void makeLove() {
		ape.reproduce();
	}

	
	
}
