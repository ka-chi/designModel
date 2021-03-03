package Command;

public class OpenCommand extends Command{
	
	@Override
	public void excute() {
		this.bulb.open();
	}
}
