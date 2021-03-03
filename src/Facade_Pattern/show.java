package Facade_Pattern;

public class show {

	showMaker cpu,os,hardDisk,memory;
	 static int count = 0;
	public show() {
		cpu = new CPU();
		os = new OS();
		hardDisk = new HardDisk();
		memory = new Memory();
	}
	
	public String cpu() {
		count++;
		return cpu.go(count);
	}
	public String hardDisk() {
		count++;
		return hardDisk.go(count);
	}
	public String memory() {
		count++;
		return memory.go(count);
	}
	public String os() {
		count++;
		return os.go(count);
	}
}

