package Adapter_Pattern;


////Ëã·¨ÊÊÅäÆ÷
public  class DataAdapter {   
	QuickSort qs = new QuickSort();
	BinarySearch bs = new BinarySearch();
	public  void  sort(int[] s ) {
		qs.quickSort(s);
	}
	public  int search(int[] s,int n) {
		int a = bs.binarySearch(s, n);
		return a;
	}
}
