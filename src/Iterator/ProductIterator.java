package Iterator;

import java.util.List;

public class ProductIterator implements AbstractIterator {

	private List<Object> tv;
	private int cursor1;
	private int cursor2;
	
	public ProductIterator(ProductList list) {
		this.tv=list.getObjects();
		cursor1=0;
		cursor2=tv.size()-1;
	}
	
	
	@Override
	public void next() {
		// TODO Auto-generated method stub
		if(cursor1<tv.size()) {
			cursor1++;
		}
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		if(cursor2>-1) {
			cursor2--;
		}
	}

	@Override
	public boolean isLast() {
		// TODO Auto-generated method stub
		return (cursor1==tv.size());
	}

	@Override
	public boolean isFirst() {
		// TODO Auto-generated method stub
		return (cursor2==-1);
	}

	@Override
	public Object getNextItem() {
		// TODO Auto-generated method stub
		return tv.get(cursor1);
	}

	@Override
	public Object getPreviousItem() {
		// TODO Auto-generated method stub
		return tv.get(cursor2);
	}

}
