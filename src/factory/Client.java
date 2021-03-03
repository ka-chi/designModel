package factory;    ///工厂方法模式

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		interface_factory itf = null;
		//Operation operation =null;
		Scanner in = new Scanner(System.in);
		System.out.println("输入 数字1 ");
		double data1 = in.nextDouble();
		System.out.println("输入  运算符 ");
		String o = in.next();
		System.out.println("输入  数字2");
		double data2 = in.nextDouble();
		switch(o) {
		case "+":itf = new addfactory();break;
		case "-":itf = new mulfactory();break;
		case "*":itf = new subfactory();break;
		case "/":itf = new divfactory();break;
		}
		System.out.printf("运算结果:"+itf.createOperation().operatioin(data1, data2));
		
		
	}
}
