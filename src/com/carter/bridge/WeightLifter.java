package com.carter.bridge;
//this is a refined abstraction
public class WeightLifter extends Athelete{

	protected WeightLifter(Training training1, Training training2) {
		super(training1, training2);
	}

	@Override
	public void train() {
		System.out.println("Weight Lifter John: ");
		training1.train();
		training2.train();
	}

}
