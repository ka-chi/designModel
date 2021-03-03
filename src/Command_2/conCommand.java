package Command_2;

public class conCommand extends Command {
	
	public void excute() {
		if(con.isFLAG()) {
			con.close();
		}
		else {
			con.open();
		}
	}
}
