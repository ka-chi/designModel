package simpleFactory;

public class Factory {
	
	public static Chart returnChart(String s) {
		Chart operation = null;
		switch(s) {
		case "+":operation = new add();break;
		case "-":operation = new mul();break;
		case "*":operation = new sub();break;
		case "/":operation = new div();break;
		}
		return operation;
	}
}
