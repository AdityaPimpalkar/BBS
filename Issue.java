package issue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Issue extends JFrame{
	Container c;
	JPanel pn1,pn2,pn3,pn4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2,b3,b4,b5,b6;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	JComboBox cb1;
	
	public Issue() {
		super("Issue Form");
		c=getContentPane();
		pn1= new JPanel();
		pn2= new JPanel();
		pn3= new JPanel();
		pn4= new JPanel();
		Border bf = BorderFactory.createLineBorder(Color.red);
		pn1.setLayout(new FlowLayout());
		l1=new JLabel("Name");
		l2=new JLabel("Class");
		l3=new JLabel("Div");
		l4=new JLabel("Roll No.");
		l5=new JLabel("Issue Date");
		l6=new JLabel("Reuturn Date");
		l7=new JLabel("Title");
		l8=new JLabel("Author");
		l9=new JLabel("Accession No.");
		
		b1=new JButton("Return");
		b2=new JButton("Search");
		
		b3=new JButton("Issue");
		b4=new JButton("Update");
		b5=new JButton("Clear");
		b6=new JButton("Exit");
		
		cb1=new JComboBox();
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		t6=new JTextField(20);
		t7=new JTextField(20);
		t8=new JTextField(20);
		t9=new JTextField(20);
	
		c.add(pn1);
		c.add(pn2);
		c.add(pn3);
		c.add(pn4);
		
		pn1.setBorder(bf);
		pn2.setBorder(bf);
		pn3.setBorder(bf);
		pn4.setBorder(bf);
		
		pn1.add(l1);
		pn1.add(t1);
		pn1.add(l2);
		pn1.add(t2);
		pn1.add(l3);
		pn1.add(t3);
		pn1.add(l4);
		pn1.add(t4);
		pn1.add(l5);
		pn1.add(t5);
		pn1.add(l6);
		pn1.add(t6);
		pn1.add(l7);
		pn1.add(t7);
		pn1.add(l8);
		pn1.add(t8);
		pn1.add(l9);
		
		pn2.add(cb1);
		pn2.add(b1);
		pn2.add(b2);
		
		pn1.add(t9);
		pn1.add(b1);
		pn1.add(b2);
		pn1.add(b3);
		
		
		setSize(1000,1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Issue e = new Issue();

	}

}
