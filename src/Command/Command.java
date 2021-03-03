package Command;

public abstract class Command {
	bulb bulb;
	public Command() {
		bulb= new bulb();
	}
	
	public void excute() {}
	
}
