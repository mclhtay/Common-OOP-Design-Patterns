package com.carter.iterator;

public class Client {

	public static void main(String[] args) {
		
		Collection asnCollection = new AssignmentCollection();
		
		Iterator asnIterator = asnCollection.createIterator();
		
		while(asnIterator.hasNext()) {
			Assignment a = asnIterator.next();
			System.out.println(a.getCourse()+" "+a.getAsnNum());
		}

	}

}
