package Bridge_Pattern;

public class fly implements Behavior{
	public void showBad() {
		System.out.println("�����!");
	} 
	public void showGood() {
		System.out.println("�ɵĺ�!");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("���!");
	} 
}
