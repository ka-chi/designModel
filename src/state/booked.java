package state;



public class booked implements state {

	@Override
	public void bookRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"已被预订");
	}

	@Override
	public void checkInRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println("欢迎入住"+r);
		r.setState(new checkIn());
	}

	@Override
	public void checkOutRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"退房成功");
		r.setState(new free());
	}

	@Override
	public void cancelRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"已取消");
		r.setState(new free());
	}

	


}
