package state;

public class Cilent { 	
	public static void main(String[] args) {
		Context c = new Context();
		c.createRoom(1);
		c.createRoom(2);
		c.createRoom(3);
		
		c.getRoom(1).bookRoom();  ///����
		c.getRoom(1).cancelRoom(); ///ȡ������
		c.getRoom(2).checkInRoom();
		c.getRoom(2).bookRoom();
	}
}
