package Facade_Pattern;

public class CPU implements showMaker{
	public String go(int b) {
		if(b==1)
		return "cpu运行成功";
		else 
		return "cpu运行失败";
	}


	
}
