package state;



public class free implements state{

	@Override
	public void bookRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"Ԥ���ɹ�");
		r.setState(new booked());
	}

	@Override
	public void checkInRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r+"��ӭ��ס");
		r.setState(new checkIn());
	}

	@Override
	public void checkOutRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void cancelRoom(Room r) {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

}
