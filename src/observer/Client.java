package observer;

public class Client {
public static void main(String[] args) {
	Subject s = new Subject();
	Cotroller c = new Cotroller(s);

	c.createStock("��è", 100);
	c.createStock("����", 220);
	s.input(new user("С��"));
	s.input(new user("С��"));
	////////
	c.setPrice("��è", 50);
}
}
