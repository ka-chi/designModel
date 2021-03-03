package decorate;

public abstract class Ingredients {
	public double fee;
	public String out ="";
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getOut() {
		return out;
	}
	public void setOut(String out) {
		this.out = out;
	}
	public void ToPrice() {
		System.out.print(out+fee+"ԪǮ");
	}
	
}
