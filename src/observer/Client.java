package observer;

public class Client {
public static void main(String[] args) {
	Subject s = new Subject();
	Cotroller c = new Cotroller(s);

	c.createStock("ÐÜÃ¨", 100);
	c.createStock("¹·ÐÜ", 220);
	s.input(new user("Ð¡ºì"));
	s.input(new user("Ð¡¾ü"));
	////////
	c.setPrice("ÐÜÃ¨", 50);
}
}
