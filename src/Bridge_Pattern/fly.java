package Bridge_Pattern;

public class fly implements Behavior{
	public void showBad() {
		System.out.println("不会飞!");
	} 
	public void showGood() {
		System.out.println("飞的好!");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("会飞!");
	} 
}
