package Iterator;

public interface AbstractIterator {
	public void next();   ///�Ƶ���һԪ��
	public void previous();///�Ƶ���һԪ��
	public boolean isLast();///�ж��Ƿ�Ϊ���һ����Ԫ��
	public boolean isFirst();////�ж��Ƿ�Ϊ��һ��Ԫ��
	public Object getNextItem();///��ȡ��һ��Ԫ��
	public Object getPreviousItem();////��ȡ��һ��Ԫ��
}
