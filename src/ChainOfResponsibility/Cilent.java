package ChainOfResponsibility;

import java.util.Scanner;

class Cilent {     ////������
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
		System.out.println("�������������");
		Scanner in  = new Scanner(System.in);
		day = in.nextInt();
		r1.setDay(day);
		zhuren.deal(r1);
	}
	
}
}
