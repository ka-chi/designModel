package Command_2;

import java.util.ArrayList;

public class control {
	Command command;
	ArrayList<Command> list = new ArrayList<>();
	public control() {}
	
	public control(Command command) {
		this.command=command;
	}
	public void setCommand(Command command) {
		this.command=command;
	}
	public void excute() {
		command.excute();
	}
	public void excuteAll() {
		for(Command c:list) {
			c.excute();
		}
	}
}
