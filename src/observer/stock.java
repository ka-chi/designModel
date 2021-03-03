package observer;

public class stock {  ////¹ÉÆ±ÊµÀýÀà
	private String name;
	private float price;
	private boolean flag = false;

	public stock(String name ,float price) {
		this.name=name;
		this.price=price;
	}
	public float getPrice() {
		return price;
	}
	
	
	public void setPrice(float price2) {
		float t ;
		t = Math.abs(price2 - this.price);
		if(t/this.price >	0.05) {
			this.flag=true;
		}	
		this.price = price2;
	}


	public boolean isFlag() {
		return flag;
	}


	public void setFlag() {
		this.flag = false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
