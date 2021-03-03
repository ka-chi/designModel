package Singleton_Pattern;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
 
 
public class JInternalFrameDemo extends JFrame implements ActionListener {
	
	private static JInternalFrame1 internalFrame;
	Container contentPane = this.getContentPane();
	
	public JInternalFrameDemo(){
		super("������");		
		contentPane.setLayout(new BorderLayout());
		JButton button = new JButton("����һ���Ӵ���");
		button.addActionListener(this);
		contentPane.add(button, BorderLayout.SOUTH);	
		this.setSize(new Dimension(300, 300));
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {		
		internalFrame = JInternalFrame1.getJInternalFrame1("�Ӵ���"
				, true, true, true, true);		
		internalFrame.setSize(new Dimension(200, 200));
		internalFrame.setVisible(true);
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		desktopPane.add(internalFrame);			
		try {
			internalFrame.setSelected(true);
		} catch (java.beans.PropertyVetoException ex) {
			System.out.println("Exception while selecting");
		}	
	}
}