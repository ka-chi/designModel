package clone;    ///���¡��ǳ��¡

import java.io.IOException;
import java.io.OptionalDataException;

public class Client {
	Costumer costumer = new Costumer();
	Address address = new Address();
	
	Costumer c2,c3;
	public static void main(String[] args) {
		Client client = new Client();
		client.deepcopy();
		client.shapecopy();
	}
	public void changeaddress(Costumer c) {
		c.getAddress().setAddressname("���Ϻ���");
		c.getAddress().setYzbm("654321");
		
	}
	
	public void deepcopy() {
		try {
			c3 = costumer.deepClone();
		} catch (OptionalDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���¡��");
		System.out.println("Costumer��ͬ��"+(c3==costumer));           ///��ͬ�򱻸��Ƴɹ�
		System.out.println("Address��ͬ��"+(c3.getAddress()==costumer.getAddress()));
		
	}
	public void shapecopy() {            /////ǳ��¡
		costumer.setAddress(address);
		Costumer c2 = costumer.clone();
		System.out.println("ǳ��¡��");
		System.out.println("Costumer��ͬ��"+(c2==costumer));           ///��ͬ�򱻸��Ƴɹ�
		System.out.println("Address��ͬ��"+(c2.getAddress()==costumer.getAddress()));
	
	}
}
