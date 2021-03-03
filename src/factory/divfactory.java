package factory;

public class divfactory implements interface_factory{

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new div();
	}
	
}
