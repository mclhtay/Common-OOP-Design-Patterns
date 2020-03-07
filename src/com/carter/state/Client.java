package com.carter.state;

public class Client {

	public static void main(String [] args) {
		Context context = new Context();
		context.alert();
		context.setAlert(new PresidentialAlert());
		context.alert();
	}
}
