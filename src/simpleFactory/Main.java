package simpleFactory;
import java.util.Scanner;
public class Main {     ////�򵥹���
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("���� ����1 ");
		Float data1 = in.nextFloat();
		System.out.println("����  ����� ");
		String o = in.next();
		System.out.println("����  ����2");
		float data2 = in.nextFloat();
		Chart chart = Factory.returnChart(o);
		float con = chart.operation(data1, data2);
		System.out.println(con);
	}
}