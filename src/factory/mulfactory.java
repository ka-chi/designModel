package factory;

public class mulfactory implements interface_factory{

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new mul();
	}

}
