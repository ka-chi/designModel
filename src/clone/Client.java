package clone;    ///深克隆及浅克隆

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
		c.getAddress().setAddressname("湖南衡阳");
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
		System.out.println("深克隆：");
		System.out.println("Costumer相同？"+(c3==costumer));           ///不同则被复制成功
		System.out.println("Address相同？"+(c3.getAddress()==costumer.getAddress()));
		
	}
	public void shapecopy() {            /////浅克隆
		costumer.setAddress(address);
		Costumer c2 = costumer.clone();
		System.out.println("浅克隆：");
		System.out.println("Costumer相同？"+(c2==costumer));           ///不同则被复制成功
		System.out.println("Address相同？"+(c2.getAddress()==costumer.getAddress()));
	
	}
}
