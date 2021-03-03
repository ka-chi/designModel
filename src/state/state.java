package state;

public interface state {
	//public void doAction(Context context);
	public void bookRoom(Room r );
	public void checkInRoom(Room r);
	public void checkOutRoom(Room r);
	public void cancelRoom(Room r);
}
