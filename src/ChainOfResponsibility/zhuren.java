package ChainOfResponsibility;

public class zhuren extends Handler {
	
	
	@Override
	public void deal(request request) {
		// TODO Auto-generated method stub
		if(request.getDay()<=3) {
			System.out.println("��������"+request.getDay()+"����ڣ���ٳɹ�");
		}
		else {
			this.successor.deal(request);
		}
	}

}
