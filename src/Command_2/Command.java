package Command_2;

import java.util.ArrayList;

public abstract class Command {
	bulb bulb;
	condition con;

	
	public Command() {
		 bulb = new bulb();          ///µÆ
		 con = new condition(); ///¿Õµ÷    
	}
	
	
	public void  excute() {}
	
}
