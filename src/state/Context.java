package state;

import java.util.ArrayList;



public class Context {
	Room room = null;
	ArrayList<Room> r = new ArrayList<Room>();
	
	public void  setState(int roomC,state state) {
		room = getRoom(roomC);
		room.setState(state);
		
	}
	
	public void createRoom(int roomC) {
		r.add(new Room(roomC));
	}
	
	public state getState(int roomC) {
		room = getRoom(roomC);
		return room.getState();
	}

	public Room getRoom(int roomC) {
		for(Room room:r) {
			if(room.getRoomC()==roomC) {
				return room;
			}
		}
		return null;
	}



}
