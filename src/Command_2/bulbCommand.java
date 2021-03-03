package Command_2;


public class bulbCommand extends Command {
	public void  excute() {
		if(bulb.isSHINE()) {
			bulb.close();
		}
		else {
			bulb.open();
		}
	}
}
