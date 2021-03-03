package Command;

public class invoker {
	Command command;
	
	public invoker(Command command) {
		this.command=command;
	}
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void call() {
		command.excute();
	}
}
