package decorate;

public class Milk extends Ingredients{
	public double price = 2;
	String out1 = "╪сакеёдл╣д";
	public Milk(Ingredients coi) {
		this.fee=coi.fee+price;
		this.out = out1+coi.out;
	}
}
