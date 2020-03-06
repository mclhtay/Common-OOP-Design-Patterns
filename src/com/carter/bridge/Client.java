package com.carter.bridge;

public class Client {

	public static void main(String [] args) {
		Athelete john = new WeightLifter(new WorkOut(), new Recover());
		john.train();
		Athelete serena = new Swimmer (new WorkOut(), new Recover());
		serena.train();
	}
}
