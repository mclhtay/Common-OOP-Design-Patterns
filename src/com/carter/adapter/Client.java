package com.carter.adapter;

public class Client {

	public static void main(String [] args) {
		Human human = new Adapter(new ApeKing());
		human.makeLove();
	}
}
