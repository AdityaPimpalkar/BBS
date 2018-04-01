/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;

import java.sql.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;



public class Login extends JFrame implements ActionListener{
    
    String s3,s4,s1,s2,s5,s6,s7;
     int len;
  int count=0;
   JDesktopPane jd1;
    JTextField tusnm;
    JButton blogin,bcancel,bclr,bnewa;
    JPasswordField tpwd;
    JRadioButton rb1,rb2;
    JLabel lusnm,lpwd,ltit,lpic;
    Container c;
    ButtonGroup bg;
    Color c1=Color.BLACK;
    int sz=20,style=Font.ITALIC+Font.BOLD;
    Font f1= new Font(" Cooper",style,sz);
  Font fi= new Font("Latin",style,50);
    Border    b1=BorderFactory.createLineBorder(Color.red);
    Border    b4=BorderFactory.createMatteBorder(3,3,3,3, new ImageIcon("img8.jpg"));
    JPanel p1;
	JLayeredPane lp1;
    	JLabel bg1;
	Border b2=b1=BorderFactory.createMatteBorder(3,3,3,3,new ImageIcon("1.jpg"));
    public Login()
    {
	super("LOGIN");
      	c=getContentPane();
        lpic=new JLabel(new ImageIcon(""));
	jd1=new JDesktopPane();
               	c.setLayout(null);
	bg=new ButtonGroup();
          	tusnm=new JTextField(10);
       	tpwd=new JPasswordField(10);
        	lusnm=new JLabel("USERNAME");
	ltit=new JLabel("VIKAS LIBRARY");
       	lpwd=new JLabel ("PASSWORD");
	blogin=new JButton("LOGIN",new ImageIcon("login.jpg"));
        	bcancel=new JButton("EXIT",new ImageIcon("exit4.jpg"));
    	bclr=new JButton("CLEAR",new ImageIcon("clear.jpg"));
    
   	bnewa=new JButton("NEW USER");
    	p1=new JPanel();
       // bfp=new JButton("FP");
              	p1.setLayout(null);
        	p1.add(lusnm);
           	p1.add(tusnm);
        	p1.add(lpwd);
        	p1.add(tpwd);
      
        	p1.add(blogin);
        	p1.add(bcancel);
               
       	p1.add(bclr);
      	p1.add(bnewa);
        	
                c.add(lpic);
    	c.add(p1);
	c.add(ltit);
	ltit.setFont(fi);
	ltit.setBounds(470,150,600,200);
     	p1.setBounds(200,280,790,400);
        	lusnm.setBounds(310,120,200,38);
       	lpwd.setBounds(310,190,200,38);
        	
        	tusnm.setBounds(435,120,170,38);
        	tpwd.setBounds(435,190,170,38);
       	blogin.setBounds(320,310,120,38);
      	bcancel.setBounds(420,360,120,38);
        
    	bclr.setBounds(520,310,120,38);
       
     	//bnewa.setBounds(330,345,130,38);
     	//p1.setBorder(b2);
    //	p1.setBackground(new Color(127,245,124));
      	tusnm.setFont(f1);
    	tpwd.setFont(f1);
     	
      	lusnm.setFont(f1);
    	lpwd.setFont(f1);
     	
    	 blogin.setFont(f1);
    	bcancel.setFont(f1);
   	bclr.setFont(f1);
        
    	bnewa.setFont(f1);
	
    	tusnm.setForeground(c1);
  	tpwd.setForeground(c1);
  	
   	lusnm.setForeground(c1);
  	lpwd.setForeground(c1);
  	
   	blogin.setForeground(c1);
  	bcancel.setForeground(c1);
 	bclr.setForeground(c1);
 	bnewa.setForeground(c1);
       
        	blogin.addActionListener(this);
        	bcancel.addActionListener(this);
       	bclr.addActionListener(this);
	bnewa.addActionListener(this);
        
	
	ltit.setForeground(Color.WHITE);
	
	blogin.setBorder(b4);
	bcancel.setBorder(b4);
	bclr.setBorder(b4);
      
        
	bnewa.setBorder(b4);
	tusnm.setBorder(b4);
	tpwd.setBorder(b4);

	//p1.setBorder(BorderFactory.createBevelBorder(1, Color.red,Color.blue,Color.green,Color.yellow));

	lp1=new JLayeredPane();
	bg1=new JLabel(new ImageIcon("books.jpg"));
	
	c.add(lp1);
	lp1.add(bg1);
	bg1.setBounds(0,0,1356,768);
	lp1.setBounds(0,0,1356,768);
        lpic.setBounds(20,20,240,200);
	p1.setOpaque(false);
	//setContentPane(jd1);
        	setSize(1356,768);
        	setLocation(0,0);
        	setVisible(true);
	
       	 setDefaultCloseOperation(EXIT_ON_CLOSE);
        
   }
   public void actionPerformed(ActionEvent e)
  {
	

	
		if( e.getSource()==blogin )
		{
			login();
			if(!s1.equals(s3) && !s2.equals(s4) && !s1.equals("") && !s2.equals(""))
			{
						//
				JOptionPane.showMessageDialog(null,"please check usernm or pswd","login",JOptionPane.INFORMATION_MESSAGE);
			}
			if(s1.equals("") && s2.equals(""))
			{
			 	JOptionPane.showMessageDialog(null,"please dnt leave text empty ","confirm ",JOptionPane.INFORMATION_MESSAGE);
				tusnm.requestFocus();
			}
			if(s2.equals("") && !s1.equals(""))
			{
			 	JOptionPane.showMessageDialog(null,"please enter password ","confirm ",JOptionPane.INFORMATION_MESSAGE);
			}
			if(!s2.equals("") && s1.equals(""))
			{
			 	JOptionPane.showMessageDialog(null,"please enter username","confirm ",JOptionPane.INFORMATION_MESSAGE);
			}
			if(len>15)
			{
			 	JOptionPane.showMessageDialog(null,"password cannot be greater than 15 ","confirm ",JOptionPane.INFORMATION_MESSAGE);
			}
			if(s1.equals(s3) & s2.equals(s4) & len<=15)
			{
				 JOptionPane.showMessageDialog(null,"login successful","login",JOptionPane.INFORMATION_MESSAGE);
				 Home h = new Home("Login");
                		//	    h.setVisible(true);
		
		 
                        }
                       
	
	
	
        }
	if(e.getSource()==bcancel)
	{
	         System.exit(0);
	}
	if(e.getSource()==bclr)
		clr();
       
        
	
  }
        
  void clr()
  {
	tusnm.setText("");
	tpwd.setText("");
	tusnm.requestFocus();
	
  }
  void login()
 {		
		try
		{
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:aditya","system","server");
			Statement stmt=con.createStatement();
          		s1=tusnm.getText();
			s2=tpwd.getText();
			
			len=s2.length();
			String q="select * from login1 where usnm='"+s1+"' and pwd='"+s2+"'  ";
			ResultSet rs=stmt.executeQuery(q);
			
			while(rs.next())
			{
				s3=rs.getString(1);
				s4=rs.getString(2);
				//
				
				
			}
                       
			con.close();
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}		
}
   
   public static void main(String[] args)
     {
        Login lf=new Login();
      
    }
    

    
}
