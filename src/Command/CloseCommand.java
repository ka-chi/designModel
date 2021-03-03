package Command;

public class CloseCommand extends Command{
	@Override
	public void excute() {
		this.bulb.close();
	}
}
