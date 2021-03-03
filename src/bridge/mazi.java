package bridge;

/*
 * 抽象类 码子，放入面条形成不同口味的面
 */
public abstract class mazi {
	protected noddle noddle;
	
	protected mazi(bridge.noddle noddle) {
		this.noddle = noddle;
	}
	///打印码子+面条名
	 public abstract void operation();
	 
}
