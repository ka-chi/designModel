package proxy;

import java.util.ArrayList;

public class proxy {
	private int index=-1; ////����ָʾ
	dingdan user;
	ArrayList<dingdan> list = new ArrayList<>();
	public proxy(dingdan user,ArrayList<dingdan> list) {
		this.list=list;
		this.user=user;
		
	}
	public void check(String name) {
		if(user.getCustomerName()==name) {index = 1;}
		else 
			{System.out.println("�Բ���"+name+"��Ȩ�޸���Ʒ��Ϣ");return;}
	}
	public void change(String name,String product,int n) {
		check(name);
		if(index!=-1) {
			user.setProductNum(n);
			user.setProuctName(product);
			System.out.println(user.getCustomerName()+"�޸ĳɹ�");
			output();
		}
	}
	public void output() {
		System.out.println("�޸ĺ�Ķ�����Ϣ����Ʒ��"+user.getProuctName()+"����Ʒ����"+user.getProductNum());
	}
}
