package observer;

public class user implements Observer {
	String name ;
	public user(String name) {
		this.name=name;
	}
	
	@Override
	public void update(stock stock) {
		// TODO Auto-generated method stub
		System.out.println(this.name+", 你的股票("+stock.getName()+")价格已经大幅变动为"+stock.getPrice());
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
