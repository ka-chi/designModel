package state;



public class Room {
	private state state;  ///×´Ì¬
	private int roomC;      //·¿¼äºÅ

	
	public Room(int roomC) {
		this.roomC=roomC;
		this.state = new free();
 	}
	public state getState() {
		return state;
	}

	public void setState(state state) {
		this.state = state;
	}

	public int getRoomC() {
		return roomC;
	}

	public void setRoomC(int roomC) {
		this.roomC = roomC;
	}
	
	public void checkInRoom() {
		this.state.checkInRoom(this);
	}
	
	public void checkOutRoom() {
		this.state.checkOutRoom(this);
	}
	
	public void cancelRoom() {
		this.state.cancelRoom(this);
	}
	
	public void bookRoom() {
		this.state.bookRoom(this);
	}
	@Override
	public String toString() {
		return this.roomC+"ºÅ·¿";
	}
	
	
}
