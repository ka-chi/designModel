package abstractFactory;

public class TCLfactory implements AbstractFactory{

	@Override
	public kongtiao Ckongtiao() {
		return new TCLkt();
		// TODO Auto-generated method stub
		
	}

	@Override
	public dianshiji Cdianshiji() {
		return new TCLdsj();
		// TODO Auto-generated method stub
		
	}

}
