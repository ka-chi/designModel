package proxy;

public class dingdan {
	String prouctName ;
	int productNum;
	String customerName;
	public dingdan(String prouctName,int productNum,String customerName) {
		this.customerName=customerName;
		this.productNum=productNum;
		this.prouctName=prouctName;
	}
	public String getProuctName() {
		return prouctName;
	}
	public void setProuctName(String prouctName) {
		this.prouctName = prouctName;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
