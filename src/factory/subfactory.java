package factory;

public class subfactory implements interface_factory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new sub();
	}

}
