package simpleFactory;
import java.util.Scanner;
public class Main {     ////简单工厂
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("输入 数字1 ");
		Float data1 = in.nextFloat();
		System.out.println("输入  运算符 ");
		String o = in.next();
		System.out.println("输入  数字2");
		float data2 = in.nextFloat();
		Chart chart = Factory.returnChart(o);
		float con = chart.operation(data1, data2);
		System.out.println(con);
	}
}