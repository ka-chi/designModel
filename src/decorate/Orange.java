package decorate;

public class Orange extends Ingredients{
	public static double price = 3;
	String out1 = "���˳�֭��";
	public Orange(Ingredients coi) {
		this.fee=coi.fee+price;	
		this.out = out1+coi.out;
	}

}
