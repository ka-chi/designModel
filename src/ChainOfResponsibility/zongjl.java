package ChainOfResponsibility;

public class zongjl extends Handler {

	@Override
	public void deal(request request) {
		// TODO Auto-generated method stub
		if(request.getDay()<=30) {
			System.out.println("总经理审批"+request.getDay()+"天假期，请假成功");
		}
		else {
			System.out.println("请假天数太长，总经理无权审批");
		}
	}

}
