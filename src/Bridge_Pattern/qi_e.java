package Bridge_Pattern;

public class qi_e extends bird{
	public void show() {
		this.setBehavior(new swim());
		System.out.print("���");
		behavior.showGood();
		this.setBehavior(new fly());
		behavior.showBad();
	}
}
