package Adapter_Pattern;

import java.util.Scanner;

public class Client {    /////������ģʽ
	public static void main(String[] args) {
		DataAdapter data = new DataAdapter();
		int[] s = {6,2,9,4,5};
		System.out.println("δ����֮ǰ");
		for(int a=0;a<s.length;a++) {
			System.out.print(s[a]+" ");
			}
		data.sort(s);
		System.out.println("\n�����");
		for(int a=0;a<s.length;a++) {
			System.out.print(s[a]+" ");
			}
		System.out.println("\n������ҵ���");
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		System.out.println("�������������е�����Ϊ��"+data.search(s, a));
	}
	
}
