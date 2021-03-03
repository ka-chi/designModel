package Iterator;

import java.util.List;

public class ProductList extends AbstractObjectList {

	public ProductList(List<Object> object) {
		super(object);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractIterator createIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}
	
	
}
