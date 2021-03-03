package ChainOfResponsibility;

import java.util.Scanner;

class Cilent {     ////责任链
public static void main(String[] args) {
	request r1 = new request();

	int day;
	Handler zhuren,jingli,zongjl;
	zhuren = new zhuren();
	jingli = new jingli();
	zongjl= new zongjl();
	
	zhuren.setSuccessor(jingli);
	jingli.setSuccessor(zongjl);
	
	while(true) {
		System.out.println("请输入请假天数");
		Scanner in  = new Scanner(System.in);
		day = in.nextInt();
		r1.setDay(day);
		zhuren.deal(r1);
	}
	
}
}
