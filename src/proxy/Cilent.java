package proxy;

import java.util.ArrayList;

public class Cilent {
	public static void main(String[] args) {
		ArrayList<dingdan> list = new ArrayList<>();
		dingdan d1 = new dingdan("�Ϳ�Ь��",20,"����");
		dingdan d2 = new dingdan("�Ϳ��·�",10,"����");
		proxy proxy = new proxy(d1, list);
		proxy.change("����","���ϴ�˹Ь��", 120);
		proxy.change("����","���ϴ�˹Ь��", 120);
	}
}
