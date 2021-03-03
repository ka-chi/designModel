package proxy;

import java.util.ArrayList;

public class proxy {
	private int index=-1; ////集合指示
	dingdan user;
	ArrayList<dingdan> list = new ArrayList<>();
	public proxy(dingdan user,ArrayList<dingdan> list) {
		this.list=list;
		this.user=user;
		
	}
	public void check(String name) {
		if(user.getCustomerName()==name) {index = 1;}
		else 
			{System.out.println("对不起"+name+"无权修改商品信息");return;}
	}
	public void change(String name,String product,int n) {
		check(name);
		if(index!=-1) {
			user.setProductNum(n);
			user.setProuctName(product);
			System.out.println(user.getCustomerName()+"修改成功");
			output();
		}
	}
	public void output() {
		System.out.println("修改后的订单信息：商品名"+user.getProuctName()+"，商品数量"+user.getProductNum());
	}
}
