package decorate;

import java.util.Scanner;

public class Client {  ///в╟йндёй╫
	public static void main(String[] args) {
	Ingredients coi1,coi2,coi3;
	coi1 = new Natie();
	coi2 = new Milk(coi1);
	coi3 = new Orange(coi2);
	coi3.ToPrice();
}
}
