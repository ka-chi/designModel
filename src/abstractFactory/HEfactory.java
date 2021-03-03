package abstractFactory;

public class HEfactory implements AbstractFactory {

	@Override
	public kongtiao Ckongtiao() {
		return new HEkt();
		// TODO Auto-generated method stub
		
	}

	@Override
	public dianshiji Cdianshiji() {
		return new HEdsj();
		// TODO Auto-generated method stub
		
	}

}
