package memento;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		String Account =null;
		String password=null;
		String tel=null;
		/*
		 * Scanner in = new Scanner(System.in); System.out.println("�����û���"); Account =
		 * in.nextLine(); System.out.println("��������"); password = in.nextLine();
		 * System.out.println("����绰����"); tel = in.nextLine();
		 */
		///�½�
		information infor = new information("zhangsan" ,"123456","13987901234");
		System.out.println("״̬1");
		System.out.println(infor);
		
		Creater c = new Creater();
		c.setMemento(infor.createMemento());
		
		//����
		infor.setAccount("zhangsan");
		infor.setPassword("111111");
		infor.setTel("13900000001");
		
		System.out.println("״̬2");
		System.out.println(infor);
		
		System.out.println("����״̬1");
		infor.restoreMemento(c.getMemento());
		System.out.println(infor);
		 
		
	}
	
	
}
