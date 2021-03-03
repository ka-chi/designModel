package Bridge_Pattern;

public class laoyin extends bird{
	public void show() {
		this.setBehavior(new swim());
		System.out.print("¿œ”•");
		behavior.showBad();
		this.setBehavior(new fly());
		behavior.showGood();
	}
}
