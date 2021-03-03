package memento;

public class information {

	String Account;
	String password;
	String tel;
	
	public information(String Account ,String password, String tel) {
		this.Account=Account;
		this.password=password;
		this.tel=tel;
	}
	//����һ������¼
	public Memento createMemento() {
		return new Memento(this);
		
	}
	///���ݱ���¼����ָ�ԭ������
	public void restoreMemento(Memento m) {
		this.Account=m.Account;
		this.password=m.password;
		this.tel=m.tel;
	}
	
	@Override
	public String toString() {
		return "Account:"+Account+"\npassword:"+password+"\ntel:"+ tel;
		
	}
	
	
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
