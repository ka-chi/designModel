package Command;

import java.util.Scanner;

public class Cilent { ///����ģʽ
	public static void main(String[] args) {
		Command c1 = new OpenCommand();
		Command c2 = new CloseCommand();
		invoker i = new invoker(c1);
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("��ѡ��/�ؼ���1������2����أ�0�����˳�");
			int a = in.nextInt();
			switch(a) {
				case 1:i.setCommand(c1);i.call();break;
				case 2:i.setCommand(c2);i.call();break;
				case 0:System.out.println("�˳�ϵͳ��");System.exit(0);break;
			}
		}
		
	}
}
