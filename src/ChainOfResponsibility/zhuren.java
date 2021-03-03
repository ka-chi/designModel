package ChainOfResponsibility;

public class zhuren extends Handler {
	
	
	@Override
	public void deal(request request) {
		// TODO Auto-generated method stub
		if(request.getDay()<=3) {
			System.out.println("主任审批"+request.getDay()+"天假期，请假成功");
		}
		else {
			this.successor.deal(request);
		}
	}

}
