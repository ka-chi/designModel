package observer;

import java.util.ArrayList;

public class Cotroller {
	Subject sub;
	ArrayList <stock> stocks = new ArrayList<stock>();
	
	public Cotroller(Subject sub) {
		this.sub=sub;
	}
	
	public void setPrice(String name ,float price) {
		for(stock s : stocks) {
			if(s.getName()==name) {
				s.setPrice(price);
				if(s.isFlag()) {
					sub.update(s);
				}
			}
			
		}
	}
	
	public void createStock(String name,float price) {
		stocks.add(new stock(name,price));
	}
}
