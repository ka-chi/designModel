package Bridge_Pattern;

import java.util.Scanner;

public class Client { /////�Ž�ģʽ
	public static void main(String[] args) {
		bird bird = null;
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		while(a!=-1) {
		switch(a) {
		case 1:{bird = new qi_e(); bird.show(); break;}
		case 2:{bird = new gezi(); bird.show(); break;}
		case 3:{bird = new laoyin(); bird.show(); break;}
		default:{System.out.println("�����������1,2,3��");break;}
		}
		a=in.nextInt();
		}
	}

}
