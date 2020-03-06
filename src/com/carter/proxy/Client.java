package com.carter.proxy;

public class Client {

	public static void main(String [] args) {
		Proxy proxy = new Proxy();
		try {
			proxy.connect("google.com");
			proxy.connect("niggafat.com");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
