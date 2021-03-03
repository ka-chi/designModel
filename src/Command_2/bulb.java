package Command_2;

public class bulb {
	private boolean SHINE = false; ///是否发光
	
	
	public boolean isSHINE() {
		return SHINE;
	}


	public void open() {
		this.SHINE=true;
		System.out.println("灯已经打开");
	}
	
	public void close() {
		this.SHINE=false;
		System.out.println("灯已经关闭");
	}
}