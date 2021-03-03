package Facade_Pattern;

public class Memory implements showMaker{
	
	public String go(int b) {
		if(b==3)
			return "内存加载成功";
			else 
			return "内存加载失败";
	}
}
