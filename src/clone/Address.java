package clone;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable{
	private String addressname;
	private String yzbm;
	
	public String getAddressname() {
		return addressname;
	}
	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}
	public String getYzbm() {
		return yzbm;
	}
	public void setYzbm(String yzbm) {
		this.yzbm = yzbm;
	}

	public Address() {

				}
	
}
