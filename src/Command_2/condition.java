package Command_2;

public class condition {
	private boolean FLAG = false;

	public boolean isFLAG() {
		return FLAG;
	}

	public void open() {
		this.FLAG=true;
		System.out.println("�յ�����");
	}
	
	public void close() {
		this.FLAG=false;
		System.out.println("�յ��ر�");
	}
	
}
