package Iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
	protected List<Object> object = new ArrayList<Object>();
	
	public AbstractObjectList(List<Object> object) {
		this.object=object;
	}
	public void addObject(Object obj) {
		this.object.add(obj);
	}
	public void removeObject(Object obj) {
		this.object.remove(obj);
	}
	public List<Object> getObjects(){
		return this.object;
	}
	
	public abstract AbstractIterator createIterator();
}
