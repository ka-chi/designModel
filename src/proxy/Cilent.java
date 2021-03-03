package proxy;

import java.util.ArrayList;

public class Cilent {
	public static void main(String[] args) {
		ArrayList<dingdan> list = new ArrayList<>();
		dingdan d1 = new dingdan("耐克鞋子",20,"李四");
		dingdan d2 = new dingdan("耐克衣服",10,"张五");
		proxy proxy = new proxy(d1, list);
		proxy.change("张三","阿迪达斯鞋子", 120);
		proxy.change("李四","阿迪达斯鞋子", 120);
	}
}
