package bridge;

/*
 * ������ ���ӣ����������γɲ�ͬ��ζ����
 */
public abstract class mazi {
	protected noddle noddle;
	
	protected mazi(bridge.noddle noddle) {
		this.noddle = noddle;
	}
	///��ӡ����+������
	 public abstract void operation();
	 
}
