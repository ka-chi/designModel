package state;



public class booked implements state {

	@Override
	public void bookRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"�ѱ�Ԥ��");
	}

	@Override
	public void checkInRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ��ס"+r);
		r.setState(new checkIn());
	}

	@Override
	public void checkOutRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"�˷��ɹ�");
		r.setState(new free());
	}

	@Override
	public void cancelRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"��ȡ��");
		r.setState(new free());
	}

	


}
