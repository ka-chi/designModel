package clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Costumer implements Cloneable,Serializable{
	private String name;
	private int age;
	private Address address = new Address();
	
	public Costumer() {
		this.name = "shazi";
		this.age=20;
	}
	
	public Costumer deepClone() throws IOException, ClassNotFoundException,OptionalDataException{
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Costumer)ois.readObject();
	}
	
	
	
	public Costumer clone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (Costumer)obj;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;	
		}
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
