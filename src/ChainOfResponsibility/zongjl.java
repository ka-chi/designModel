package ChainOfResponsibility;

public class zongjl extends Handler {

	@Override
	public void deal(request request) {
		// TODO Auto-generated method stub
		if(request.getDay()<=30) {
			System.out.println("�ܾ�������"+request.getDay()+"����ڣ���ٳɹ�");
		}
		else {
			System.out.println("�������̫�����ܾ�����Ȩ����");
		}
	}

}
