package Facade_Pattern;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	show show = new show();
	JButton b = new JButton("Æô¶¯");
	JPanel panel = new JPanel();
	JTextArea area = new JTextArea();
	public MainFrame() {
		this.setSize(500,300);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(new BorderLayout());;
		panel.add(b);
		this.add(panel);	
		Start(panel);
		this.setVisible(true);
		
	}
	public void Start(JPanel panel) {
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.remove(b);
				panel.add(area);
				area.append(show.cpu()+"\n");
				area.append(show.hardDisk()+"\n");
				area.append(show.memory()+"\n");
				area.append(show.os()+"\n");
			}
		});
	}
	
	
	
}
