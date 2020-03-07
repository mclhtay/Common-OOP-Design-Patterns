package com.carter.strategy;

public class Pikachu extends Pokemon{

	public Pikachu(SuperMove sm, SuperSupportMove ssm) {
		super(sm, ssm);
		whichPoke();
	}

	public void whichPoke() {
		System.out.println("Pikachu: ");
	}



}
