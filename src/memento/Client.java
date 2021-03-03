package memento;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		String Account =null;
		String password=null;
		String tel=null;
		/*
		 * Scanner in = new Scanner(System.in); System.out.println("输入用户名"); Account =
		 * in.nextLine(); System.out.println("输入密码"); password = in.nextLine();
		 * System.out.println("输入电话号码"); tel = in.nextLine();
		 */
		///新建
		information infor = new information("zhangsan" ,"123456","13987901234");
		System.out.println("状态1");
		System.out.println(infor);
		
		Creater c = new Creater();
		c.setMemento(infor.createMemento());
		
		//更改
		infor.setAccount("zhangsan");
		infor.setPassword("111111");
		infor.setTel("13900000001");
		
		System.out.println("状态2");
		System.out.println(infor);
		
		System.out.println("返回状态1");
		infor.restoreMemento(c.getMemento());
		System.out.println(infor);
		 
		
	}
	
	
}
