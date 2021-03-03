package Command_2;

import java.util.Scanner;

public class Cilent {
	public static void main(String[] args) {
		Command c1 = new bulbCommand(); 
		Command c2 = new conCommand();
		control control = new control();
		control control1 = new control(c1);
		control control2 = new control(c2);
		control.list.add(c1);
		control.list.add(c2);
		Scanner in = new Scanner(System.in);
		System.out.println("请选择开关");
		System.out.println("数字1代表对空调和电灯执行同时命令，数字2表示对电灯单独命令，数字3表示对空调单独命令！");
		while(true) {
			int a = in.nextInt();
			switch(a) {
				case 1:control.excuteAll();break;
				case 2:control1.excute();break;
				case 3:control2.excute();break;
			}
		}
		
	}
}
