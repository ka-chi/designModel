package state;



public class checkIn implements state {

	@Override
	public void bookRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"�Ѿ�����ס��");
	}

	@Override
	public void checkInRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println("...");
		//System.out.println("��ӭ��ס");
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
		System.out.println(r+"����ס������ȡ��");
	}

	


}
