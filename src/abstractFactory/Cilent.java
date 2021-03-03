package abstractFactory;  /////抽象工厂模式

public class Cilent {
	public static void main(String[] args) {
		AbstractFactory factory = new HEfactory();
		factory.Cdianshiji().play();
		factory.Ckongtiao().play();
		AbstractFactory factory2 = new TCLfactory();
		factory2.Cdianshiji().play();
		factory2.Ckongtiao().play();
	}
}
