package Command;

public class bulb {
	boolean SHINE = false; ///�Ƿ񷢹�
	
	public void open() {
		this.SHINE=true;
		System.out.println("���Ѿ���");
	}
	
	public void close() {
		this.SHINE=false;
		System.out.println("���Ѿ��ر�");
	}
}
