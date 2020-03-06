package com.carter.proxy;

public class RealInternet implements Internet{

	@Override
	public void connect(String domain) {
		System.out.println("Connecting to : "+domain);
	}

}
