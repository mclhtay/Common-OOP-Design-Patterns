package com.carter.proxy;

import java.util.ArrayList;

public class Proxy implements Internet{
	private static ArrayList<String> bannedSites = new ArrayList<String>();
	private Internet internet = new RealInternet();
	
	static{
		bannedSites.add("niggafat.com");
		bannedSites.add("shabi.com");

	}
	@Override
	public void connect(String domain) throws Exception{

		
		if(bannedSites.contains(domain)) {
			throw new Exception("Access Denied");
		}
		internet.connect(domain);
		
	}
	
}
