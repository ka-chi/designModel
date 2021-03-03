package Adapter_Pattern;

import java.util.Scanner;

public class Client {    /////适配器模式
	public static void main(String[] args) {
		DataAdapter data = new DataAdapter();
		int[] s = {6,2,9,4,5};
		System.out.println("未排序之前");
		for(int a=0;a<s.length;a++) {
			System.out.print(s[a]+" ");
			}
		data.sort(s);
		System.out.println("\n排序后");
		for(int a=0;a<s.length;a++) {
			System.out.print(s[a]+" ");
			}
		System.out.println("\n输入查找的数");
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		System.out.println("该数字在数组中的索引为："+data.search(s, a));
	}
	
}
