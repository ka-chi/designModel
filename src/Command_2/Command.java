package Command_2;

import java.util.ArrayList;

public abstract class Command {
	bulb bulb;
	condition con;

	
	public Command() {
		 bulb = new bulb();          ///��
		 con = new condition(); ///�յ�    
	}
	
	
	public void  excute() {}
	
}
