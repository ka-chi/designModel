package bridge;   ////�Ž�ģʽ

public class Client {
	public static void main(String[] args) {
		tomato t1 = new tomato(new kuanmian());
		beef b1 = new beef(new lamian());
		
		t1.operation();
		b1.operation();
	}
}
