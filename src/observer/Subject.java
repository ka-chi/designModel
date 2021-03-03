package observer;

import java.util.ArrayList;

public class Subject {
	ArrayList <Observer> observer = new ArrayList<Observer>();
	
	public void update(stock stock) {
		for(Observer ob:observer) {
			ob.update(stock);
		}
	}
	
	public void input(Observer o) {
		this.observer.add(o);
	}
}
