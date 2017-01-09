import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

import java.util.Date;
import java.text.SimpleDateFormat;

public class login extends JFrame implements ActionListener{
	Container c;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1;
	JPanel p1;
	
	public login(){
		super("BBS");
		c = getContentPane();
		p1= new JPanel();
		p1.setLayout(null);
		l1 = new JLabel("LOGIN");
		l2 = new JLabel("PASSWORD");
		l3 = new JLabel("Invalid");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b1 = new JButton("Submit");
		b1.addActionListener(this);
		c.add(p1);
		p1.add(l1);
		p1.add(t1); 
		p1.add(l2);
		p1.add(t2);
		p1.add(b1);
		p1.add(l3);
		l1.setBounds(282, 115, 80, 70);
		t1.setBounds(210, 170, 190, 30);
		l2.setBounds(270, 190, 80, 70);
		t2.setBounds(210, 245, 190, 30);
		b1.setBounds(265, 300, 80, 30);
		setSize(600,600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	public static void main(String[] args) {
		login n = new login();

	}

}
