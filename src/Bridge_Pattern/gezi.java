package Bridge_Pattern;

public class gezi extends bird{
	public void show() {
		this.setBehavior(new swim());
		System.out.print("����");
		behavior.showBad();
		this.setBehavior(new fly());
		behavior.showGood();
	}
}
