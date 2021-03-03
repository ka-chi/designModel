package state;



public class checkIn implements state {

	@Override
	public void bookRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"已经有人住了");
	}

	@Override
	public void checkInRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println("...");
		//System.out.println("欢迎入住");
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
		System.out.println(r+"已入住，不能取消");
	}

	


}
