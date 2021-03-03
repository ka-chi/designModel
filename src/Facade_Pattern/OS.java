package Facade_Pattern;

public class OS implements showMaker{
	public String go(int b) {
		if(b==4)
			return "流加载成功";
			else 
			return "流加载失败";
	}
}
