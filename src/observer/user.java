package observer;

public class user implements Observer {
	String name ;
	public user(String name) {
		this.name=name;
	}
	
	@Override
	public void update(stock stock) {
		// TODO Auto-generated method stub
		System.out.println(this.name+", ��Ĺ�Ʊ("+stock.getName()+")�۸��Ѿ�����䶯Ϊ"+stock.getPrice());
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
