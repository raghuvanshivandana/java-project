package project;

import java.awt.Font;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frontpg extends JApplet{
  Font f=new Font("Arial", Font.BOLD,40);
	JLabel l=new JLabel("enter username");
	JTextField t=new JTextField(50);
	
	JLabel l1=new JLabel("enter password");
	public void init()
	{
		setLayout(null);
		setSize(300,300);
		l.setBounds(250,200,300,30);
		l.setFont(f);
		add(l);
		
		t.setBounds(580,200,260,40);
		add(t);
	}
}
