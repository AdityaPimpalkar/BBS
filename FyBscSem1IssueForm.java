/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;

import datechooser.beans.DateChooserCombo;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Aditya
 */
public class FyBscSem1IssueForm extends JInternalFrame implements ActionListener, ItemListener, Printable, KeyListener, FocusListener 
{

    int count=0, count1;
    ResultSet rs;
    FileInputStream fis;
    File file;
    String num3= "[^0-9]";
    String num1 = "[^A-Za-z]";
    String num2 = "[^A-Z]";
   
    String nj = "[[0-9]\\.[0-9]{2}{am,pm}]";
    DateChooserCombo bdt,bdt1;
    Date d,d1;
String d3,d4;
    String no,sru;
    JLayeredPane lop1;
    int r, tp1 = 0;
    JFileChooser fc;
    JPanel pf1, pf2, pf3, pf4, pf5, pf6;
    JTextField tid, tnm, tsrc, ttm,  tdt, atm, tfa, tauthr,tacno,lstat;
    JLabel fid, fnm, fsrc, ftm, fcls,  fdt, ftit, fsr, fatm, ftp, fa, lop2, Image, limg1, limg2,lstatus;
    JComboBox csr, tp;
    JLabel tcls, tcls1;
    JButton baddf, bupdt, bdel, bcnc, brs, bpt, bcfl,badd,bdelle;
  
    Container cf;
    Color cfi = Color.red;
    Font fi = new Font("cooper", Font.BOLD, 16);
    Font fi1 = new Font("Latin", Font.BOLD, 20);
    Font fi3 = new Font("Latin", Font.BOLD, 22);
    Font fi2 = new Font("Latin", Font.BOLD, 16);
    Border bf = BorderFactory.createLineBorder(Color.red);
    Border bf1 = BorderFactory.createEtchedBorder(1, Color.BLACK,Color.BLACK);
    Border bf2 = BorderFactory.createTitledBorder(bf1, "Student Information", TitledBorder.CENTER, TitledBorder.TOP, fi2, new Color(204, 0, 51));
    Border bf6 = BorderFactory.createTitledBorder(bf1, "Search", TitledBorder.CENTER, TitledBorder.TOP, fi2, Color.WHITE);
     Border bf3 = BorderFactory.createSoftBevelBorder(1, new Color(255, 0, 204), new Color(255, 255, 51), new Color(0, 0, 255), new Color(51, 255, 51));

    FyBscSem1IssueForm (String s){
      super(s);
        cf = getContentPane();
        fc = new JFileChooser("/project/sam/nw/");
       
        Image = new JLabel(new ImageIcon("a1.jpg"));
        limg1 = new JLabel();
        limg2 = new JLabel();
        cf.setLayout(null);
        pf1 = new JPanel();
        pf1.setLayout(null);
        pf2 = new JPanel();
        pf2.setLayout(null);
        pf3 = new JPanel();
        pf3.setLayout(null);
        pf4 = new JPanel();
        pf4.setLayout(null);
        pf5 = new JPanel();
        pf5.setLayout(null);
        pf6 = new JPanel();
        pf6.setLayout(null);
       
        tid = new JTextField(10);
        bdt=new DateChooserCombo();
        bdt1=new DateChooserCombo();
        tnm = new JTextField(10);
        atm = new JTextField(10);
        tsrc = new JTextField(10);
        ttm = new JTextField(10);
        tfa = new JTextField(10);
       
        tdt = new JTextField(10);
      
        tauthr = new JTextField(10);
        tacno = new JTextField(10);
        lstat=new JTextField();
        ftit = new JLabel("FYBSc Sem I Issue Form");
        fsr = new JLabel("Student Id");
        bdel = new JButton("Return", new ImageIcon("delete.jpg"));
        baddf = new JButton("Search ", new ImageIcon("add.jpg"));
        bupdt = new JButton("Update", new ImageIcon("update.jpg"));
        bcnc = new JButton("Exit", new ImageIcon("cancel.jpg"));
        badd = new JButton("Add", new ImageIcon("add.jpg")); 
        bdelle = new JButton("Delete", new ImageIcon("delete.jpg"));
        //brs = new JButton("Browse", new ImageIcon("browse.jpg"));
       bpt = new JButton("Print", new ImageIcon("print4.jpg"));
        bcfl = new JButton("Clear", new ImageIcon("clear.jpg"));
        csr = new JComboBox();
        lop1 = new JLayeredPane();
        lop2 = new JLabel(new ImageIcon("lib9.jpg"));
        pf1.setBorder(bf2);
        pf1.setBounds(100, 70, 600, 550);
       pf2.setBorder(bf1);
        pf2.setBounds(300, 15, 800, 50);
     //  pf4.setBorder(bf1);
        //pf4.setBounds(15, 10, 160, 300);
       pf3.setBorder(bf1);
        pf3.setBounds(700, 178, 420, 210);
      // pf5.setBorder(bf1);
      //  pf5.setBounds(10, 180, 170, 280);
        pf6.setBorder(bf6);
        pf6.setBounds(885, 460, 105, 65);
       
        pf2.add(ftit);
        //pf1.add(tp);
        //pf1.add(tcls);
        pf1.add(tauthr);
        pf1.add(tacno);
       
        
      pf3.add(bdel);
      pf3.add(bcfl);
      pf3.add(bpt);
        pf3.add(bupdt);
        pf3.add(bcnc);
        pf3.add(badd);
        pf3.add(bdelle);
        tnm.setText("FYBsc-SemI");
        tnm.setEnabled(false);
       
        cf.add(pf1);
        cf.add(pf2);
        cf.add(pf3);
        pf3.add(pf4);
        pf3.add(pf5);
        //pf3.add(pf6);
         cf.add(pf6);
       // pf6.add(fsr);
        pf6.add(csr);
        pf2.add(limg1);
        pf2.add(limg2);
        pf1.add(bdt);
        pf1.add(bdt1);
        lop1.add(lop2);
        limg1.setBounds(0, 0, 100, 30);

        ftit.setForeground(new Color(204, 0, 51));
        cf.add(lop1);
        Image.setBounds(7, 25, 145, 140);
        pf4.add(Image);
        lop1.setBounds(0, 0, 1356, 768);
        lop2.setBounds(0, 0, 1356, 768);
        pf1.setOpaque(false);
        pf2.setOpaque(false);
        pf3.setOpaque(false);
        pf4.setOpaque(false);
        pf5.setOpaque(false);
        pf6.setOpaque(false);
        ftit.setBounds(300, 10, 400, 30);
        fsr.setBounds(12, 22, 120, 30);
        csr.setBounds(5, 25, 95, 30);
        tauthr.setBounds(270, 390, 240, 35);
        tacno.setBounds(270, 440, 240, 35);

    /*  bpt.setBounds(10, 100, 140, 30);*/
        bupdt.setBounds(150, 10, 110, 30);
        bdel.setBounds(290, 10, 110, 30);
        bdelle.setBounds(5, 70, 110, 30);
        badd.setBounds(5, 10, 110, 30);
        bcnc.setBounds(290, 70, 110, 30);
        bcfl.setBounds(150, 70, 110, 30);
        bpt.setBounds(150, 140, 110, 30);
       // brs.setBounds(15, 190, 160, 33);
 tauthr.setFont(fi);
  tacno.setFont(fi);
        bcfl.setFont(fi2);
        ftit.setFont(fi3);
        badd.setFont(fi2);
        bdelle.setFont(fi2);
        //tp.setFont(fi);
        baddf.setFont(fi2);
        bdel.setFont(fi2);
        bcnc.setFont(fi2);
        bupdt.setFont(fi2);
       // brs.setFont(fi2);
        bpt.setFont(fi2);
        csr.setFont(fi2);
        fsr.setFont(fi2);
        csr.setBorder(bf3);
        badd.setBorder(bf3);
        bdelle.setBorder(bf3);
       // tp.setBorder(bf3);
        bcnc.setBorder(bf3);
        bdel.setBorder(bf3);
        baddf.setBorder(bf3);
        bupdt.setBorder(bf3);
        //brs.setBorder(bf3);
        bpt.setBorder(bf3);
        bcfl.setBorder(bf3);
        tauthr.setBorder(bf3);
        tacno.setBorder(bf3);
 
        addComp1(tid, 270, 40, 240, 30);
        addComp1(tnm, 270, 90, 240, 30);
        addComp1(tfa, 270, 140, 100, 30);
        addComp1(tsrc, 270, 190, 120, 30);
        addComp1(tdt, 270, 240, 100, 30);
        bdt.setBounds(380,240,100,30);
        
        addComp1(atm, 270, 290, 100, 30);
        bdt1.setBounds(380,290,100,30);
       
        addComp1(ttm, 270, 340, 240, 30);
         addComp1(lstat,270, 500, 240, 30);
        //addComp1(tcls, 270, 440, 120, 35);
        //addComp1(tcls1, 395, 440, 120, 35);
        //
        addComp(fid, "Name", 95, 40, 240, 30);
        addComp(fnm, "Class", 90, 90, 240, 30);
        addComp(fa, "Div", 90, 140, 240, 30);
        addComp(fsrc, "Roll No.", 90, 190, 260, 30);
        addComp(fdt, "Issue Date", 85, 240, 240, 30);
        addComp(fatm, "Due Date", 85, 290, 240, 30);
        addComp(ftp, "Author", 90, 390, 240, 30);
        addComp(fcls, "Accession No.", 90, 440, 240, 30);
        addComp(lstatus,"Status:",90, 500, 240, 30);
       
        //addComp(fchgs, "", 100, 490, 240, 30);
        //addComp(fseats, "Seats", 100, 540, 240, 30);
        addComp(ftm, "Title", 100, 340, 240, 30);
        bupdt.addActionListener(this);
         bpt.addActionListener(this);
        badd.addActionListener(this);
        bcnc.addActionListener(this);
        bcfl.addActionListener(this);
        
        bdelle.addActionListener(this);
        bdel.addActionListener(this);
        csr.addItemListener(this);
        tsrc.addKeyListener(this);
        tdt.addKeyListener(this);
        tfa.addKeyListener(this);
        atm.addKeyListener(this);
        ttm.addKeyListener(this);
        tauthr.addKeyListener(this);
        tacno.addKeyListener(this);
      
        tid.addKeyListener(this);
 tid.addFocusListener(this);
 tfa.addFocusListener(this);
		//tnm.addKeyListener(this);
        //atm.addKeyListener(this);
   
        resultset1();
        enText(false);
        setSize(1356, 768);
        setLocation(0, 0);
        setVisible(true);
        lstat.setEnabled(false);
          atm.setEnabled(false);
        tdt.setEnabled(false);
        
       // setClosable(true);
    }
   

    public void focusGained(FocusEvent e) {
    }

    public void focusLost(FocusEvent e) {
        try {

            if (e.getSource() ==tfa ) {
                if (!tfa.getText().equals("")) {
                    if (tfa.getText().length() != 1) {
                        JOptionPane.showMessageDialog(null, "Division Should be of Single Letter");
                        tfa.setText("");
                        tfa.requestFocus();
                    }

                    else 
                        if (tfa.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "please enter The Division");
                        tfa.setText("");
                        tfa.requestFocus();
                    }

                }
            }
         /*   if (e.getSource() == tseats1) {
                if (!tseats1.getText().equals("")) {

                    if (Integer.parseInt(tseats1.getText()) > 150) {
                        JOptionPane.showMessageDialog(null, "Seats in Bussiness Class should be less than 150");
                        tseats1.setText("");
                    }

                    if (tseats1.getText().length() != 3) {
                        JOptionPane.showMessageDialog(null, "Enter only 3  digits");
                        tseats1.setText("");
                    } else if (tseats1.getText().equals("000")) {
                        JOptionPane.showMessageDialog(null, "plzz enter correct number");
                        tseats1.setText("");
                    }

                }
            }
            if (e.getSource() == tchgs) {
                if (!tchgs.getText().equals("")) {

                    if (Integer.parseInt(tchgs.getText()) > 80000) {
                        JOptionPane.showMessageDialog(null, "Charges Should be less than  80000 thousand");
                        tchgs.setText("");
                    }
                    if (tchgs.getText().length() > 5) {
                        JOptionPane.showMessageDialog(null, "Enter the charges of 4 or 5 digits");
                        tchgs.setText("");
                    } else if (tchgs.getText().equals("00000") || tchgs.getText().equals("0000")) {
                        JOptionPane.showMessageDialog(null, "plzz enter correct amount");
                        tchgs.setText("");
                    }

                }
            }
           

                
            }*/

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e1) {
        try {
            if (e1.getSource() == bpt) {
                //bpt.setVisible(false);
                setSize(1356, 768);
                PrinterJob printJob = PrinterJob.getPrinterJob();
                printJob.setPrintable(this);
                if (printJob.printDialog()) {

                    printJob.print();

                    printJob.cancel();
                }
                printJob.cancel();
                bpt.setVisible(true);
                setSize(1356, 768);
            }
        } catch (PrinterException ex) {
        }
       
        if (e1.getSource() == badd) {
          
            if (tid.getText().equals("") ||  tsrc.getText().equals("") || ttm.getText().equals("") || tauthr.getText().equals("") || tacno.getText().equals("")  ) 
                    {
                JOptionPane.showMessageDialog(null, "Please Enter The Details", "Confirm", JOptionPane.INFORMATION_MESSAGE);
            } 
            else {
             lstat.setText("Issued");
             
                //btnen(false);
                saveBook();
                
            }

        }
        if (e1.getSource() == bupdt) {

          bupdt.setText("Save");
				//bdelle.setEnabled(false);
					enText(true);
				tsrc.setEnabled(false);	
                                 bdel.setEnabled(false);
                                 bdelle.setEnabled(false);
                                 badd.setEnabled(false);
                                 bcfl.setEnabled(false);
				count++;
                                    
				//System.out.println(count);
				if(count>1 && count<3 && bupdt.getText().equals("Save"))
				{	
					//bupdt.setText("Edit");
					updateBook();
                                        bupdt.setText("Update");
						
				}

        }
        if (e1.getSource() == bcnc) {
            this.dispose();
        }
        if(e1.getSource() == bdel)
        {
           // lstat.setText("Returned");  
            returnBook();
                   
        }
        if (e1.getSource() == bdelle) {

            
            delBook();
            showBook();
        }
        if (e1.getSource() == bcfl) {

            clearBook();
            enText(true);
            tid.requestFocus();

        }
    }

    public void itemStateChanged(ItemEvent ie) {

        if (ie.getSource() == csr) {
            count = 0;
            count1 = 0;
           
            showBook();
        }

    }

    void btnen(Boolean b) {

       // bdel.setEnabled(b);
       // bupdt.setEnabled(b);
    }
 void returnBook()
 {
       try {
           
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            PreparedStatement pfadd = con.prepareStatement("update FYSemI set status=? where roll_no=? and status=?");
            pfadd.setString(1,"Returned");
            int y=Integer.parseInt(tsrc.getText());
            pfadd.setInt(2,y);
             
            pfadd.setString(3,lstat.getText());
            pfadd.executeUpdate();
           
          
          
            con.commit();
            con.close();
               enText(false);
               lstat.setText("Returned");
               
            JOptionPane.showMessageDialog(null, "Booked Returned", "confirm ", JOptionPane.INFORMATION_MESSAGE);

          

        } catch (Exception e2) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }

 }
    void updateBook() {

        try {
           count=0;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            PreparedStatement pfadd = con.prepareStatement("update FYSemI set name=?,div=?,issue_date=? ,due_date=?,title=?,author=?,access_number=? where roll_no=?");
            pfadd.setString(1, tid.getText());
            pfadd.setString(2, tfa.getText());
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(3,d3);
            d1= new SimpleDateFormat("dd/MM/yyyy").parse(bdt1.getText());
                           d4 = new SimpleDateFormat("dd-MMM-yyyy").format(d1);
            pfadd.setString(4, d4);
             pfadd.setString(5, ttm.getText());
            pfadd.setString(6, tauthr.getText());
            pfadd.setString(7, tacno.getText());
          
            pfadd.setString(8, tsrc.getText());
            pfadd.executeUpdate();
           
          
          
            con.commit();
            con.close();
               enText(false);
            JOptionPane.showMessageDialog(null, "Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
             bdel.setEnabled(true);
                                 bdelle.setEnabled(true);
                                 badd.setEnabled(true);
                                 bcfl.setEnabled(true);
          

        } catch (Exception e2) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }

    }

    void showBook() {
        try {
            enText(false);

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            Statement stmt = con.createStatement();
            int ele =  Integer.parseInt((String) csr.getSelectedItem());
            rs = stmt.executeQuery("select * from FYSemI where roll_no=" + ele + "");
            if (rs.next()) {

                tid.setText(rs.getString(1));
               // tnm.setText(rs.getString(2));
                tfa.setText(rs.getString(2));
                tsrc.setText(String.valueOf(rs.getInt(3)));
                 String data =rs.getString("issue_date");
                Date dt7= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(data);
                    
                     String a  = new SimpleDateFormat("dd/MM/yyyy").format(dt7);
                tdt.setText(a);
                 String data1 =rs.getString("due_date");
                 Date dt8= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(data1);
                    
                     String a1  = new SimpleDateFormat("dd/MM/yyyy").format(dt8);
                atm.setText(a1);
                ttm.setText(rs.getString(6));
               
                tauthr.setText(rs.getString(7));
                tacno.setText(String.valueOf(rs.getInt(8)));
                lstat.setText(rs.getString(9));
               // GetImage1();
            }
            con.commit();
            con.close();

        } catch (Exception e2) {
            //e2.printStackTrace();
        }
    }

  
    void saveBook() {
         
        try {
             //JOptionPane.showMessageDialog(null, "Details", "Confirm", JOptionPane.INFORMATION_MESSAGE);
         
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            PreparedStatement pfadd = con.prepareStatement("insert into FYSemI values(?,?,?,?,?,?,?,?,?)");

            pfadd.setString(1, tid.getText());
            pfadd.setString(2, tfa.getText());
              int ch = Integer.parseInt(tsrc.getText());
          
            pfadd.setInt(3, ch);
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(4,d3);
            d1= new SimpleDateFormat("dd/MM/yyyy").parse(bdt1.getText());
                           d4 = new SimpleDateFormat("dd-MMM-yyyy").format(d1);
            pfadd.setString(5, d4);
             pfadd.setString(6, ttm.getText());
            pfadd.setString(7, tauthr.getText());
            pfadd.setString(8, tacno.getText());
          
        
            pfadd.setString(9,lstat.getText());
         
            pfadd.executeUpdate();
            //resultset1();
            JOptionPane.showMessageDialog(null, "saved ", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            //btnen(true);
            con.commit();
            con.close();
             resultset1();
             
            enText(false);
         
            tdt.setText(d3);
            atm.setText(d4);
            
           // badd.setText("Add");
           // btnen(true);

        } catch (Exception e2) {
            //e2.printStackTrace();
        }
    }

    void delBook() {

        try {

            //ef(false);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            PreparedStatement pfadd = con.prepareStatement("delete  from FYSemI where roll_no=?");
            pfadd.setInt(1, Integer.parseInt(tsrc.getText()));

            pfadd.executeUpdate();
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null, "1 record deleted", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            csr.removeItem(tsrc.getText());
            clearBook();

        } catch (Exception e2) {
            System.out.println(e2);//e2.printStackTrace();
        }

    }

    void resultset1() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            java.sql.Statement stmt1 = con.createStatement();

            ResultSet rs1 = stmt1.executeQuery("select roll_no from FYSemI");
            while (rs1.next()) {
                no = rs1.getString(1);
                csr.addItem(no);
            }
            con.commit();
            con.close();
        } catch (Exception e2) {
		//System.out.println(e2);//
            //e2.printStackTrace();
        }

    }

    void clearBook() {
        tid.setText("");
        tfa.setText("");
        tsrc.setText("");
        tdt.setText("");
        atm.setText("");
        ttm.setText("");
        tauthr.setText("");
        tacno.setText("");
    lstat.setText("");
    
       
        enText(true);
        tid.requestFocus();
        
        
    }

    void enText(boolean b) {
        tid.setEnabled(b);
       
        tfa.setEnabled(b);
        tsrc.setEnabled(b);
       ttm.setEnabled(b);
       
     
        tauthr.setEnabled(b);
        tacno.setEnabled(b);
      
       // tp.setEnabled(b);
    }

    void addComp(JComponent jc, String title, int x, int y, int w, int h) {
        jc = new JLabel(title);
        jc.setBounds(x, y, w, h);

        jc.setFont(fi);
        pf1.add(jc);
    }

    void addComp1(JComponent jc1, int x, int y, int w, int h) {

        jc1.setBounds(x, y, w, h);

        jc1.setBorder(bf3);
        jc1.setFont(fi);
        pf1.add(jc1);
    }

    public int print(Graphics g, PageFormat pf, int pi) throws PrinterException {
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(pf.getImageableX() + 5, pf.getImageableY() + 5);
        Font f = new Font("Monospaced", Font.PLAIN, 12);
        g2.setFont(f);
        paint(g2);
        return Printable.PAGE_EXISTS;
    }

    public void keyReleased(KeyEvent evt) {

        try {
            
            if (evt.getSource() == tsrc) {
                tsrc.setText(tsrc.getText().replaceAll(num3, ""));
            }
            if (evt.getSource() == tfa) {
                tfa.setText(tfa.getText().replaceAll(num2, ""));
            }
            if (evt.getSource() == tid) {
                tid.setText(tid.getText().replaceAll(num1, ""));
            }
            if (evt.getSource() == ttm) {
                ttm.setText(ttm.getText().replaceAll(num1, ""));
            }
            if (evt.getSource() == tauthr) {
                tauthr.setText(tauthr.getText().replaceAll(num1, ""));
            }
            if (evt.getSource() == tacno) {
                tacno.setText(tacno.getText().replaceAll(num3, ""));
            }
            
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void keyPressed(KeyEvent evt) {
    }

    public void keyTyped(KeyEvent evt) {
    }

    public void keyEntered(KeyEvent evt) {
    }

    public void keyExited(KeyEvent evt) {
    }
   /* public static void main(String args[])
    {
    FyBscSem1IssueForm  s1 = new FyBscSem1IssueForm("Book Issuing and Returning ");
    }*/
    
}
