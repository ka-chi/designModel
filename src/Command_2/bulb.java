package Command_2;

public class bulb {
	private boolean SHINE = false; ///�Ƿ񷢹�
	
	
	public boolean isSHINE() {
		return SHINE;
	}


	public void open() {
		this.SHINE=true;
		System.out.println("���Ѿ���");
	}
	
	public void close() {
		this.SHINE=false;
		System.out.println("���Ѿ��ر�");
	}
}