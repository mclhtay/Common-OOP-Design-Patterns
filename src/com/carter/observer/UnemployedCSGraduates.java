package com.carter.observer;

import java.util.ArrayList;
import java.util.Observer;

// this is the subject of the application
public class UnemployedCSGraduates {
	ArrayList<NewGrad> listOfGrads = new ArrayList<NewGrad>(); //a list of all new Grads
	ArrayList<Employer> observerCollection = new ArrayList<Employer>(); // the collection of all observers, i.e. employers looking for new cs grads in this context
	public UnemployedCSGraduates() {
		listOfGrads.add(new NewGrad("Carter", 50));
		listOfGrads.add(new NewGrad("Bob", 55));
		listOfGrads.add(new NewGrad("Lin", 90));
		// and so on
	}
	
	public void registerObserver(Employer ob) {
		observerCollection.add(ob);
	}
	
	public void unregisterObserver(Employer ob) {
		observerCollection.remove(ob);
	}
	
	public void notifyObserver() {
		for(Employer ob : observerCollection) {
			for(NewGrad n : listOfGrads) {
				ob.getNotification(n.getName());
			}
		}
	}
	
	class NewGrad{
		String name;
		int mark;
		public NewGrad(String n, int i) {
			this.name = n;
			this.mark = i;
		}
		public String getName() {
			return name;
		}
	}
}
