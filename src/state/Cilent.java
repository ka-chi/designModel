package state;

public class Cilent { 	
	public static void main(String[] args) {
		Context c = new Context();
		c.createRoom(1);
		c.createRoom(2);
		c.createRoom(3);
		
		c.getRoom(1).bookRoom();  ///订房
		c.getRoom(1).cancelRoom(); ///取消订房
		c.getRoom(2).checkInRoom();
		c.getRoom(2).bookRoom();
	}
}
