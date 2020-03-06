package com.carter.bridge;

//this is a concrete implementor
public class WorkOut implements Training{

	@Override
	public void train() {
		System.out.println("Worked out");
	}

}
