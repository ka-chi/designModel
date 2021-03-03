package Bridge_Pattern;


////行为可以下及子类表示行为的优劣
public class swim implements Behavior{
	public void showBad() {
		System.out.println("不会游泳");
	}
	public void showGood() {
		System.out.println("游得好");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("会游泳");
	}
}
