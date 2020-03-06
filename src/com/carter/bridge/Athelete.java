package com.carter.bridge;
//this is abstraction
public abstract class Athelete {
	protected Training training1;
	protected Training training2;
	
	protected Athelete(Training training1, Training training2) {
		this.training1 = training1;
		this.training2 = training2;
	}
	
	abstract public void train();
}
