package memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

class Memento {
	//ArrayList<Object> list = new ArrayList<Object>();
	String Account;
	String password;
	String tel;
//	Date date = new Date();
//	Map<Date,information> map ;
	Memento(information obj) {
		this.Account=obj.Account;
		this.password=obj.password;
		this.tel=obj.tel;
	}
	
	
}
 