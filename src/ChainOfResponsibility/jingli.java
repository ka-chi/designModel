package ChainOfResponsibility;

public class jingli extends Handler{
	
	@Override
	public void deal(request request) {
		// TODO Auto-generated method stub
		if(request.getDay()<=10) {
			System.out.println("��������"+request.getDay()+"����ڣ���ٳɹ�");
		}
		else {
			this.successor.deal(request);
		}
	}
	
}


