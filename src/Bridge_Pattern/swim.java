package Bridge_Pattern;


////��Ϊ�����¼������ʾ��Ϊ������
public class swim implements Behavior{
	public void showBad() {
		System.out.println("������Ӿ");
	}
	public void showGood() {
		System.out.println("�εú�");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("����Ӿ");
	}
}
