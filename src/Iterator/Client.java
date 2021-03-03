package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		List<Object> tv = new ArrayList<Object>();
		tv.add("CCTV1");
		tv.add("CCTV2");
		tv.add("CCTV3");
		tv.add("CCTV4");
		tv.add("CCTV5");
		tv.add("CCTV6");
		tv.add("CCTV7");
		tv.add("CCTV8");
		tv.add("CCTV9");
		tv.add("CCTV10");
		
		AbstractObjectList list;
		AbstractIterator iterator;
		
		list = new ProductList(tv);
		iterator = list.createIterator();
		
		System.out.println("正向频道输出");
		while(!iterator.isLast()) {
			System.out.println(iterator.getNextItem());
			iterator.next();
		}
		System.out.println("------------");
		System.out.println("反向频道输出");
		while(!iterator.isFirst()) {
			System.out.println(iterator.getPreviousItem());
			iterator.previous();
		}
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("请输入数字选择相应频道，可以选择1-10");
			int a = in.nextInt();
			try {
			System.out.println(tv.get(a-1));
			}catch(java.lang.IndexOutOfBoundsException e) {
				System.out.println("输入的数字超出范围，请输入0-10的数字");
			}
		}
		
		
		
	}
}
