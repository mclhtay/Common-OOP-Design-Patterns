package com.carter.composite;

import java.util.ArrayList;

//this is a composite
public class Category implements Champion {

	private ArrayList<Champion>list = new ArrayList<Champion>();
	@Override
	public void showChamp() {
		for(Champion c : list) {
			c.showChamp();
		}
		
	}
	public void addChamp(Champion c) {
		list.add(c);
	}
	public void removeChamp(Champion c) {
		list.remove(c);
	}

}
