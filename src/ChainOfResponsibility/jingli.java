package ChainOfResponsibility;

public class jingli extends Handler{
	
	@Override
	public void deal(request request) {
		// TODO Auto-generated method stub
		if(request.getDay()<=10) {
			System.out.println("经理审批"+request.getDay()+"天假期，请假成功");
		}
		else {
			this.successor.deal(request);
		}
	}
	
}


