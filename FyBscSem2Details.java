/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sameera
 */
public class FyBscSem2Details extends JInternalFrame implements ActionListener,ItemListener {
    
	 
       ResultSetMetaData rsmd,rsmd1;
	  JScrollPane rsp,rsp1;
          JLabel l1,l2;
    	JTable rpt,rpt1;
	Object Data[] = new Object[1000];
        Object Data1[] = new Object[1000];
    	String qu;
    	DefaultTableModel mod,mod1;
    Container cntr;
	JLayeredPane loi;
	Color cntr1=Color.green;
	JLabel lcinf,latx,lbmt,lblmt,laf,loi1,limg;
	JLabel tlatx,tlemt,tlblmt,tlelmt,tmt,lemt,lelmt;
	JComboBox taf;
        JPanel p1,p2,p3,p4,p5;
	JButton bcsv,bcscl,bcxt,bdel,bshow;
	 Font fctr1= new Font("Latin",Font.BOLD,25);
	 Font fctr2= new Font("Latinr",Font.BOLD,16);
	Border bctr1=BorderFactory.createEtchedBorder(1,Color.red,new Color(255,255,0));
	Border bctr2=BorderFactory.createSoftBevelBorder(1,Color.WHITE,Color.PINK,Color.WHITE,Color.PINK);
	FyBscSem2Details(String s)
	{
                   super(s);
		cntr=getContentPane();
		cntr.setLayout(null);
                p1=new JPanel();
                p1.setLayout(null);
                 p2=new JPanel();
                p2.setLayout(null);
                 p3=new JPanel();
                p3.setLayout(null);
                 p4=new JPanel();
                p4.setLayout(null);
                 p5=new JPanel();
                p5.setLayout(null);
                 rpt = new JTable();
           rpt1 = new JTable();
    		    rsp = new JScrollPane(rpt);
       		 rsp.setViewportView(rpt);

       		 mod = new DefaultTableModel();
        		rpt.setModel(mod);
		   rsp.setBorder(bctr2);
		   rsp.setBounds(0, 0, 200, 370);
                	
		  rpt.setFont(fctr2);
                   rsp1 = new JScrollPane(rpt1);
       		 rsp1.setViewportView(rpt1);

       		 mod1 = new DefaultTableModel();
        		rpt1.setModel(mod1);
		   rsp1.setBorder(bctr2);
		   rsp1.setBounds(0, 0, 200, 370);
                	
		  rpt1.setFont(fctr2);
               
               
		lcinf=new JLabel("FYBSc Sem II  Details");
		taf=new JComboBox();
		tlatx=new JLabel("");
                tmt=new JLabel("");
		tlemt=new JLabel("");
		tlelmt=new JLabel("");
		tlblmt=new JLabel("");
		loi=new JLayeredPane();
                lbmt=new JLabel("No Of Stud Issued the Book");
		loi1=new JLabel(new ImageIcon("img58.jpg"));
                lemt=new JLabel("Issued");
		lelmt=new JLabel("Returned");
		limg=new JLabel(new ImageIcon("img4.jpg"));
		bcsv=new JButton("Save",new ImageIcon("add.jpg"));
		bcscl=new JButton("Clear",new ImageIcon("clear.jpg"));
		bcxt=new JButton("Cancel",new ImageIcon("exit4.jpg"));
		bdel=new JButton("Delete",new ImageIcon("delete.jpg"));
		bshow=new JButton("Show");//,new ImageIcon(".jpg"));
		
		addCompn1(laf,"Div",10,240,50,30);
		addCompn1(latx,"Total No. Of Students",10,300,200,30);
		addCompn1(lbmt,"No. Of Students Issued The Book",10,360,300,30);
		lemt.setBounds(50,5,180,30);
		addCompn1(lblmt,"No. Of Students Returned The Book",10,420,300,30);
		lelmt.setBounds(50,5,180,30);
                 
		addCompn2(taf,300,240,100,30);
		addCompn2(tlatx,300,300,100,30);
		//addCompn2(tlemt,800,460,150,30);
		addCompn2(tlblmt,300,360,100,30);
		//addCompn2(tlelmt,800,580,150,30);
                addCompn2(tmt,300,420,100,30);
		//addCompn3(bcsv,800,500,100,30);
		/*addCompn3(bdel,0,620,100,30);
		addCompn3(bshow,220,620,100,30);*/
		//addCompn3(bcscl,800,620,100,30);
		//addCompn3(bcxt,8000,620,100,30);
                p2.add(lemt);
                p3.add(lelmt);
                 p1.add(p2);
                  p1.add(p3);
                   p1.add(p4);
                    p1.add(p5);
                    
                    
                   p4.add(rsp);
                   p5.add(rsp1);
                    rsp.getViewport().setBackground(new Color(255,255,255));
                 cntr.add(p1);
                
                 p1.setBounds(480,240,420,430);
                 p1.setBorder(bctr2);
                 p1.setOpaque(false);
                   p2.setBounds(5,5,200,40);
                 p2.setBorder(bctr2);
                 p2.setOpaque(false);
                  p3.setBounds(210,5,205,40);
                 p3.setBorder(bctr2);
                 p3.setOpaque(false);
                  p4.setBounds(5,50,200,370);
                 p4.setBorder(bctr2);
                 p4.setOpaque(false);
                  p5.setBounds(210,50,200,370);
                 p5.setBorder(bctr2);
                 p5.setOpaque(false);
		cntr.add(lcinf);
		lcinf.setBounds(550,10,300,50);
		lcinf.setFont(fctr1);
		cntr.add(limg);
		lbmt.setForeground(Color.yellow);
		cntr.add(lbmt);
		lbmt.setFont(fctr1);
		loi.add(loi1);
		cntr.add(loi);
		//limg.setBounds(500,330,300,300);
		loi.setBounds(0,0,1356,768);
		loi1.setBounds(0,0,1356,768);
		bcsv.addActionListener(this);
		bcxt.addActionListener(this);
		//bdel.addActionListener(this);
		//bshow.addActionListener(this);
		lemt.setFont(fctr2);
		
		lemt.setForeground(Color.WHITE);
                lelmt.setFont(fctr2);
		
		lelmt.setForeground(Color.WHITE);
		bcscl.addActionListener(this);
		lcinf.setForeground(new Color(204, 0, 51));//(255,0,102));//(241,51,0));
		setSize(1356,768);
        		setLocation(0,0);
        		setVisible(true);
		setClosable(true);
		resultset();
                 
		  rsp.getViewport().setBackground(new Color(255,255,255));
		//rpt.setBackground(	new Color(0,255,255));
                rpt.setRowHeight(30);
		rpt.setRowMargin(10);
                 rsp1.getViewport().setBackground(new Color(255,255,255));
		//rpt.setBackground(	new Color(0,255,255));
                rpt1.setRowHeight(30);
		rpt1.setRowMargin(10);
               
		taf.addItemListener(this);
       	 	setDefaultCloseOperation(EXIT_ON_CLOSE);
		                                                                                                                                               		
	}
    
	void addCompn1(JComponent jc,String str,int x,int y,int w,int h)
	{
		jc=new JLabel(str);
		jc.setFont(fctr2);
		//jc.setBorder(bctr2);
		jc.setBounds(x,y,w,h);
		jc.setForeground(Color.WHITE);
		cntr.add(jc);
		
	}
        void addCompn11(JComponent jc,String str,int x,int y,int w,int h)
	{
		jc=new JLabel(str);
		jc.setFont(fctr2);
		//jc.setBorder(bctr2);
		jc.setBounds(x,y,w,h);
		jc.setForeground(Color.WHITE);
		//cntr.add(jc);
		
	}
	void addCompn2(JComponent jc,int x,int y,int w,int h)
	{
		
		jc.setFont(fctr2);
		jc.setBorder(bctr2);
		jc.setBounds(x,y,w,h);
		cntr.add(jc);
		//jc.setForeground(Color.WHITE);
		
	}
	void addCompn3(JComponent jc,int x,int y,int w,int h)
	{
		
		jc.setFont(fctr2);
		jc.setBorder(bctr2);
		jc.setBounds(x,y,w,h);
		cntr.add(jc);
		
	}
         public void itemStateChanged(ItemEvent ie) {

        if (ie.getSource() == taf) {
           
           
            showDetails();
        }

    }
	 public void actionPerformed(ActionEvent e2)
  	{
		
		if(e2.getSource()==bcxt)
	         	{
			this.dispose();
			
		}
		
		
		
	}
	
	   void resultset()
	       {
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:sameera","system","server");
		 Statement ars = con.createStatement();
		 ResultSet rs=ars.executeQuery("select   *  from FYSemII");
                   while(rs.next())
		{
			String no=rs.getString(2);
                       // if(taf.getSelectedIndex(no)== -1)
                       
                        taf.addItem(no);
                        
			
		}
		//con.commit();
		}
		  catch(Exception e2)
	      	 {
			JOptionPane.showMessageDialog(null,"Data Should not be Rentered","confirm ",JOptionPane.INFORMATION_MESSAGE);
                       	}
		
	       }
          
	void showDetails()
	{
	          try
	        {
		
                    tlatx.setForeground(Color.WHITE);
                     tlblmt.setForeground(Color.WHITE);
                      tmt.setForeground(Color.WHITE);
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 Connection con=DriverManager.getConnection("jdbc:odbc:sameera","system","server");
		Statement ars1=con.createStatement();
		String ele=(String)taf.getSelectedItem();
                String q="select count(*) from FYSemII where div=?";
                 PreparedStatement pstmt = con.prepareStatement(q);
                 pstmt.setString(1, ele);
      ResultSet rs = pstmt.executeQuery();
      if (rs.next()) {
        tlatx.setText(String.valueOf(rs.getInt(1)));
			
                                }
      String gt="Issued";
			 String q1="select count(*) from FYSemII where div=? and status=? ";
                 PreparedStatement pstmt1 = con.prepareStatement(q1);
                  pstmt1.setString(1, ele);
                   pstmt1.setString(2, gt);
      ResultSet rs1 = pstmt1.executeQuery();
      if (rs1.next()) {
        tlblmt.setText(String.valueOf(rs1.getInt(1)));
			
                                }
        String gt1="Returned";
			 String q2="select count(*) from FYSemII where div=? and status=? ";
                 PreparedStatement pstmt2= con.prepareStatement(q2);
                  pstmt2.setString(1, ele);
                   pstmt2.setString(2, gt1);
      ResultSet rs2 = pstmt2.executeQuery();
      if (rs2.next()) {
        tmt.setText(String.valueOf(rs2.getInt(1)));
			
                                }
       
		
		con.commit();
		con.close();
                show1();
		
	        }
                 
	
	        catch(Exception e2)
	       {
			e2.printStackTrace();
                       }	
            }
	void show1()
	{
             try {
                 //issued
                mod.setRowCount(0);
            mod.setColumnCount(0);

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:sameera", "system", "server");
            Statement stmt = con.createStatement();
            String ele=(String)taf.getSelectedItem();
                String h="Issued";
		String q="select *  from FYSemII where div='"+ele+"' and status='"+h+"'";
            ResultSet rs = stmt.executeQuery(q);
            rsmd = rs.getMetaData();
           
                mod.addColumn(rsmd.getColumnLabel(3));
               
           

            while (rs.next()) {
              int   i=1;
            
                    Data[i - 1] =String.valueOf( rs.getInt(3));
                   mod.addRow(Data);
              

            }
            //returned
                mod1.setRowCount(0);
            mod1.setColumnCount(0);

          
            Statement stmt1 = con.createStatement();
         
                String r="Returned";
		String q1="select *  from FYSemII where div='"+ele+"' and status='"+r+"'";
            ResultSet rs1 = stmt1.executeQuery(q1);
            rsmd1= rs1.getMetaData();
           
                mod1.addColumn(rsmd1.getColumnLabel(3));
               
           

            while (rs1.next()) {
              int   i=1;
            
                    Data1[i - 1] =String.valueOf( rs1.getInt(3));
                   mod1.addRow(Data1);
              

            }
                   
		con.commit();
		con.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
	
	}
	
    
}

