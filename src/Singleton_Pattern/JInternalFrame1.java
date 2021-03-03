package Singleton_Pattern;

import javax.swing.JInternalFrame;

public class JInternalFrame1 extends JInternalFrame{
 
	//×Ó´°Ìå
	private static JInternalFrame1 JIF1 = null;
	private JInternalFrame1(String name, boolean b1, boolean b2, boolean b3, boolean b4){
		super(name, b1, b2, b3, b4);
	}
 
	public static JInternalFrame1 getJInternalFrame1(String name, boolean b1, boolean b2, boolean b3, boolean b4){
		if(JIF1 == null)
			JIF1 = new JInternalFrame1(name, b1, b2, b3, b4);
		return JIF1;
	}
}