package bridge;

/*
 * ���� ������
 */
public class tomato extends mazi{
	protected tomato(bridge.noddle noddle) {
		super(noddle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("����"+noddle.toString());
	}
	
}
