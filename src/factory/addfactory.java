package factory;

public class addfactory implements interface_factory{

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new add();
	}
	
}
