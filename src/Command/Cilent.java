package Command;

import java.util.Scanner;

public class Cilent { ///命令模式
	public static void main(String[] args) {
		Command c1 = new OpenCommand();
		Command c2 = new CloseCommand();
		invoker i = new invoker(c1);
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("请选择开/关键，1代表开，2代表关，0代表退出");
			int a = in.nextInt();
			switch(a) {
				case 1:i.setCommand(c1);i.call();break;
				case 2:i.setCommand(c2);i.call();break;
				case 0:System.out.println("退出系统！");System.exit(0);break;
			}
		}
		
	}
}
