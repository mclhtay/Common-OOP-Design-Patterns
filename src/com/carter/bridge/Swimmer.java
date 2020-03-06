package com.carter.bridge;
//another refined abstraction
public class Swimmer extends Athelete{

	protected Swimmer(Training training1, Training training2) {
		super(training1, training2);
	}

	@Override
	public void train() {
		
		System.out.println("Swimmer Serena: ");
		training1.train();
		training2.train();
	}

}
