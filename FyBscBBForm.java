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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aditya
 */
public class FyBscBBForm extends JInternalFrame implements ActionListener, ItemListener, Printable, KeyListener, FocusListener 
{
    ArrayList<Integer> rolls=new ArrayList<Integer>();
      ArrayList<String> names=new ArrayList<String>();
        ArrayList<Integer> contacts=new ArrayList<Integer>();
         ResultSetMetaData rsmd,rsmd1,rsmd2,rsmd3;
	  JScrollPane rsp,rsp1,rsp2,rsp3;
          JLabel l1;
    	JTable rpt,rpt1,rpt2,rpt3;
	Object Data[] = new Object[1000],Data1[] = new Object[1000],Data2[] = new Object[1000],Data3[] = new Object[1000];
    	String qu;
    	DefaultTableModel mod,mod1,mod2,mod3;	
    int count=0, count1;
    ResultSet rs;
    FileInputStream fis;
    File file;
    int rowCount=0,columnCount=0;
    String num3= "[^0-9]";
    String num1 = "[^A-Za-z]";
    String num2 = "[^A-Z]";
   Connection con12;
    String nj = "[[0-9]\\.[0-9]{2}{am,pm}]";
    DateChooserCombo bdt,bdt1,bdt12;
    Date d,d1;
    int hyo=0;
String d3,d4;
    String no,sru;
    JLayeredPane lop1;
    int r, tp1 = 0;
    String tabledata,tabledata1;
    JFileChooser fc;
    JPanel pf1, pf2, pf3, pf4, pf5, pf6,pf7,pf8,pf9;
    JTextField tid, tsrc, ttm,  tdt, atm, tfa, tauthr,tacno,lstat,tcls2,tcls3;
    JLabel fid, fnm, fsrc, ftm, fcls,  fdt, ftit, fsr, fatm, ftp, fa, lop2, Image, limg1, limg2,lstatus;
    JComboBox csr,csr1, tp,cbk1,cbk2,cbk3,cbk4,cbk5,cbk6,tnm;
    JLabel tcls, tcls1,fchgs,fseats;
    JButton baddf, bupdt, bdel, bcnc, brs,brs1, bpt, bcfl,badd,bdelle;
    JTextField tnm1,tnm2,trn1,trn2;
    Container cf;
    String tb1[]={"FY","SY","TY"};
    Color cfi = Color.red;
   JTextField title1,title2,title3,title4,title5,title6,title7,title8,title9,title10,title11,title12;
   JTextField author1,author2,author3,author4,author5,author6,author7,author8,author9,author10,author11,author12;
   JTextField accno1,accno2,accno3,accno4,accno5,accno6,accno7,accno8,accno9,accno10,accno11,accno12;
   int rollno=0,rollno1=0,rollno2=0;
double contact=0,contact1=0,contact2;
  String ele12="",ele13="",ele14="";
  String name="",name1="",name2="";
    Font fi = new Font("cooper", Font.BOLD, 16);
    Font fi1 = new Font("Latin", Font.BOLD, 20);
    Font fi3 = new Font("Latin", Font.BOLD, 22);
    Font fi2 = new Font("Latin", Font.BOLD, 16);
    String cbk[]={"ST","SC","OBC","OPEN","NT"};
    Border bf = BorderFactory.createLineBorder(Color.red);
    Border bf1 = BorderFactory.createEtchedBorder(1, Color.BLACK,Color.BLACK);
    Border bf2 = BorderFactory.createTitledBorder(bf1, "Student Information", TitledBorder.CENTER, TitledBorder.TOP, fi2, new Color(204, 0, 51));
    Border bf6 = BorderFactory.createTitledBorder(bf1, "Search", TitledBorder.CENTER, TitledBorder.TOP, fi2, Color.WHITE);
     Border bf3 = BorderFactory.createSoftBevelBorder(1, new Color(255, 0, 204), new Color(255, 255, 51), new Color(0, 0, 255), new Color(51, 255, 51));
  Border bf12 = BorderFactory.createTitledBorder(bf1, "Book Information", TitledBorder.CENTER, TitledBorder.TOP, fi2, new Color(204, 0, 51));
    Border b1=BorderFactory.createEtchedBorder(1,Color.WHITE,Color.PINK);
     Font fai2=new Font("Trebuchet MS",Font.PLAIN,15);
    public  FyBscBBForm(String s) {
     
      super(s);
        	 rpt = new JTable();
         
    		    rsp = new JScrollPane(rpt);
       		 rsp.setViewportView(rpt);

       		 mod = new DefaultTableModel();
        		rpt.setModel(mod);
		   rsp.setBorder(b1);
		   rsp.setBounds(3, 50, 590, 116);
                    rpt.setFont(fai2);
                     rpt1 = new JTable();
         
    		    rsp1 = new JScrollPane(rpt1);
       		 rsp1.setViewportView(rpt1);

       		 mod1= new DefaultTableModel();
        		rpt1.setModel(mod1);
		   rsp1.setBorder(bf12);
		   rsp1.setBounds(3, 166, 590, 405);
                    rpt1.setFont(fai2);
                    //
                     rpt2 = new JTable();
         
    		    rsp2 = new JScrollPane(rpt2);
       		 rsp2.setViewportView(rpt2);

       		 mod2= new DefaultTableModel();
        		rpt2.setModel(mod2);
		   rsp2.setBorder(bf1);
		   rsp2.setBounds(3, 50, 620, 116);
                    rpt2.setFont(fai2);
                    
                     rpt3 = new JTable();
         
    		    rsp3 = new JScrollPane(rpt3);
       		 rsp3.setViewportView(rpt3);

       		 mod3= new DefaultTableModel();
        		rpt3.setModel(mod3);
		   rsp3.setBorder(bf12);
		   rsp3.setBounds(3, 166, 620, 405);
                    rpt3.setFont(fai2);
        cf = getContentPane();
        fc = new JFileChooser("/project/sam/nw/");
       
        Image = new JLabel(new ImageIcon("a1.jpg"));
        limg1 = new JLabel();
        limg2 = new JLabel();
        cf.setLayout(null);
         pf9 = new JPanel();
        pf9.setLayout(null);
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
          pf7 = new JPanel();
        pf7.setLayout(null);
        pf8 = new JPanel();
        pf8.setLayout(null);
        tid = new JTextField(10);
        bdt=new DateChooserCombo();
        bdt1=new DateChooserCombo();
         bdt12=new DateChooserCombo();
        tnm = new JComboBox(tb1);
        atm = new JTextField(10);
        tsrc = new JTextField(10);
        ttm = new JTextField(10);
        tfa = new JTextField(10);
        tnm1 = new JTextField(10);
        tnm2 = new JTextField(10);
        trn1 = new JTextField(10);
       l1=new JLabel();
        trn2 = new JTextField(10);
        tdt = new JTextField(10);
      tcls2=new JTextField(10);
       tcls3=new JTextField(10);
        tauthr = new JTextField(10);
        tacno = new JTextField(10);
        lstat=new JTextField();
        title1=new JTextField();
         title2=new JTextField();
         title3=new JTextField();
          title4=new JTextField();
           title5=new JTextField();
            title6=new JTextField();
             title7=new JTextField();
              title8=new JTextField();
               title9=new JTextField();
                title10=new JTextField();
                 title11=new JTextField();
                  title12=new JTextField();
                  
                  
              accno1=new JTextField();
         accno2=new JTextField();
         accno3=new JTextField();
          accno4=new JTextField();
           accno5=new JTextField();
            accno6=new JTextField();
             accno7=new JTextField();
              accno8=new JTextField();
               accno9=new JTextField();
                accno10=new JTextField();
                 accno11=new JTextField();
                  accno12=new JTextField();
                   author1=new JTextField();
         author2=new JTextField();
         author3=new JTextField();
          author4=new JTextField();
           author5=new JTextField();
            author6=new JTextField();
             author7=new JTextField();
              author8=new JTextField();
               author9=new JTextField();
                author10=new JTextField();
                 author11=new JTextField();
                  author12=new JTextField();
        ftit = new JLabel("FYBSc BookBank Issue Form");
        fsr = new JLabel("Student Id");
        bdel = new JButton("Return", new ImageIcon("cancel.jpg"));
        baddf = new JButton("Search ", new ImageIcon("add.jpg"));
        bupdt = new JButton("Update", new ImageIcon("update.jpg"));
        bcnc = new JButton("Exit", new ImageIcon("exit4.jpg"));
        badd = new JButton("Add", new ImageIcon("add.jpg")); 
        bdelle = new JButton("Delete", new ImageIcon("delete.jpg"));
        brs = new JButton("Operations", new ImageIcon("search.jpg"));
           brs1 = new JButton("Print", new ImageIcon("print4.jpg"));
       bpt = new JButton("Cancel", new ImageIcon("cancel.jpg"));
        bcfl = new JButton("Clear", new ImageIcon("clear.jpg"));
        csr = new JComboBox();
             csr1 = new JComboBox();
         cbk1 = new JComboBox(cbk);
          cbk2 = new JComboBox(cbk);
           cbk3 = new JComboBox(cbk);
            cbk4 = new JComboBox(cbk);
             cbk5 = new JComboBox(cbk);
            cbk6= new JComboBox(cbk);
        lop1 = new JLayeredPane();
        lop2 = new JLabel(new ImageIcon("lib56.jpg"));
        pf1.setBorder(bf2);
        pf1.setBounds(5, 70, 600, 560);
         pf7.setBorder(bf1);
       pf7.setBounds(5, 70, 600, 570);
       pf2.setBorder(bf1);
        pf2.setBounds(300, 15, 800, 50);
      pf4.setBorder(bf12);
        pf4.setBounds(610, 70, 720, 560);
          pf8.setBorder(bf1);
        pf8.setBounds(610, 70, 720, 570);
       pf3.setBorder(bf1);
        pf3.setBounds(5, 650, 600, 60);
      pf9.setBorder(bf1);
        pf9.setBounds(5, 650, 600, 60);
        pf6.setBorder(bf1);
        pf6.setBounds(610, 650, 720, 60);
       
        pf2.add(ftit);
        //pf1.add(tp);
        //pf1.add(tcls);
        pf1.add(tauthr);
        pf1.add(tacno);
       
        pf7.add(rsp);
         pf7.add(rsp1);
                  
        pf8.add(rsp2);
         pf8.add(rsp3);
      pf7.add(bdel);
      pf3.add(bcfl);
      pf6.add(bpt);
        pf8.add(bupdt);
        pf3.add(bcnc);
        pf8.add(cbk4);
         pf8.add(cbk5);
          pf8.add(cbk6);
        pf3.add(badd);
        pf7.add(bdelle);
       
       // tnm.setEnabled(false);
       cf.add(pf7);
       cf.add(pf8);
        cf.add(pf1);
        cf.add(pf2);
        cf.add(pf3);
       cf.add(pf4);
       cf.add(pf9);
       
        pf3.add(pf5);
       
         cf.add(pf6);
        pf8.add(bdt12);
        pf7.add(csr);
        pf6.add(brs);
         pf8.add(csr1);
        pf9.add(l1);
        pf2.add(limg1);
        pf2.add(limg2);
        pf1.add(bdt);
        pf1.add(bdt1);
        pf6.add(brs1);
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
        pf7.setOpaque(false);
        pf8.setOpaque(false);
         pf9.setOpaque(false);
        ftit.setBounds(300, 10, 400, 30);
        fsr.setBounds(12, 22, 120, 30);
        csr.setBounds(50, 10, 150, 30);
        csr1.setBounds(50, 10, 150, 30);
         bdel.setBounds(400, 10, 120, 30);
          bdt12.setBounds(400,10,120,30);
       bdelle.setBounds(230, 10, 120, 30);
        brs.setBounds(300, 10, 130, 33);
        brs1.setBounds(70, 10, 120, 33);
         badd.setBounds(50, 10, 110, 30);
         bcnc.setBounds(430, 10, 110, 30);
         l1.setBounds(50, 10, 400, 30);
    /*  bpt.setBounds(10, 100, 140, 30);*/
       // 
         cbk4.setBounds(630, 70, 90, 30);
           cbk5.setBounds(630, 102, 90, 30);
             cbk6.setBounds(630, 135, 90, 30);
      pf7.setVisible(false);
       pf8.setVisible(false);
        bcfl.setBounds(230, 10, 110, 30);
        bupdt.setBounds(230, 10, 110, 30);
        //bdel.setBounds(400, 30, 110, 30);
      // bdelle.setBounds(230, 30, 110, 30);
        bpt.setBounds(570, 10, 110, 30);
       
 tauthr.setFont(fi);
  tacno.setFont(fi);
        bcfl.setFont(fi2);
        ftit.setFont(fi3);
        badd.setFont(fi2);
        bdelle.setFont(fi2);
        l1.setFont(fi2);
        baddf.setFont(fi2);
        bdel.setFont(fi2);
        bcnc.setFont(fi2);
        bupdt.setFont(fi2);
       // brs.setFont(fi2);
        bpt.setFont(fi2);
        csr.setFont(fi2);
         csr1.setFont(fi2);
        brs.setFont(fi2);
        brs1.setFont(fi2);
        fsr.setFont(fi2);
        csr.setBorder(bf3);
         csr1.setBorder(bf3);
        brs.setBorder(bf3);
        brs1.setBorder(bf3);
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
         addComp11(title1, 10, 80, 240, 30);
              addComp11(title2, 10, 120, 240, 30);
              addComp11(title3, 10, 160, 240, 30);
           addComp11(title4, 10,  200,240, 30);
             addComp11(title5, 10, 240, 240, 30);
               addComp11(title6, 10, 280, 240, 30);
               addComp11(title7, 10, 320, 240, 30);
                 addComp11(title8, 10, 360, 240, 30);
                   addComp11(title9, 10, 400, 240, 30);
                     addComp11(title10, 10, 440, 240, 30);
                       addComp11(title11, 10,480, 240, 30);
                         addComp11(title12, 10, 520, 240, 30);
                          addComp11(author1, 260, 80, 240, 30);
                           addComp11(author2, 260, 120, 240, 30);
              addComp11(author3, 260, 160, 240, 30);
           addComp11(author4, 260,  200,240, 30);
             addComp11(author5, 260, 240, 240, 30);
               addComp11(author6, 260, 280, 240, 30);
               addComp11(author7, 260, 320, 240, 30);
                 addComp11(author8, 260, 360, 240, 30);
                   addComp11(author9, 260, 400, 240, 30);
                     addComp11(author10, 260, 440, 240, 30);
                       addComp11(author11, 260,480, 240, 30);
                         addComp11(author12, 260, 520, 240, 30);
                          addComp11(accno1, 510, 80, 200, 30);
                          addComp11(accno2, 510, 120, 200, 30);
              addComp11(accno3, 510, 160, 200, 30);
           addComp11(accno4, 510,  200,200, 30);
             addComp11(accno5, 510, 240, 200, 30);
               addComp11(accno6, 510, 280, 200, 30);
               addComp11(accno7, 510, 320, 200, 30);
                 addComp11(accno8, 510, 360, 200, 30);
                   addComp11(accno9, 510, 400, 200, 30);
                     addComp11(accno10, 510, 440, 200, 30);
                       addComp11(accno11, 510,480, 200, 30);
                         addComp11(accno12, 510, 520, 200, 30);
        addComp1(tnm, 100, 40, 240, 30);
        addComp1(tfa, 460, 40, 120, 30);
          addComp1(tid, 100, 90, 240, 30);
        addComp1(tsrc, 460, 90, 120, 30);
         addComp1(tnm1, 100, 140, 240, 30);
          addComp1(tnm2, 100, 190, 240, 30);
        addComp1(trn1, 460, 140, 120, 30);
          addComp1(trn2, 460, 190, 120, 30);
       addComp1(tdt, 130, 500, 100, 30);
        bdt.setBounds(240,500,100,30);
         tauthr.setBounds(100, 430, 240, 35);
        tacno.setBounds(460, 430, 120, 35);
       // addComp1(atm, 270, 580, 100, 30);
     //   
       
       // addComp1(ttm, 270, 240, 240, 30);
         addComp1(lstat,100, 260, 240, 30);
        addComp1(tcls2, 100, 310, 240, 35);
        addComp1(tcls3, 100, 360, 240, 35);
         addComp1(cbk1,460, 260, 120, 30);
        addComp1(cbk2, 460, 310, 120, 35);
        addComp1(cbk3, 460, 360, 120, 35);
        //
        addComp(fid, "Name", 25, 90, 75, 30);
        addComp(fnm, "Class", 25, 40, 75, 30);
        addComp(fa, "Div", 380, 40, 60, 30);
        addComp(fsrc, "Roll No", 380, 90, 60, 30);
       addComp(fdt, "Issue Date", 25, 500, 240, 30);
      addComp(fatm, "Id", 380, 430, 240, 30);
        addComp(ftp, "Contact ", 25, 260, 240, 30);
        addComp(fcls, "Caste", 380, 260, 240, 30);
        addComp(lstatus,"Status",25, 430, 240, 30);
       
      addComp4(fchgs, "Title", 50, 30, 140, 30);
       addComp4(fseats, "Author ", 350, 30, 140, 30);
       addComp4(ftm, "Accession No", 500, 30, 240, 30);
         rsp.getViewport().setBackground(new Color(255,255,255));
		//rpt.setBackground(	new Color(0,255,255));
                rpt.setRowHeight(30);
		rpt.setRowMargin(10);
                        rsp1.getViewport().setBackground(new Color(255,255,255));
		//rpt.setBackground(	new Color(0,255,255));
                rpt1.setRowHeight(30);
                
		rpt1.setRowMargin(10);
                 rsp2.getViewport().setBackground(new Color(255,255,255));
		//rpt.setBackground(	new Color(0,255,255));
                rpt2.setRowHeight(30);
                
		rpt2.setRowMargin(10);
                 rsp3.getViewport().setBackground(new Color(255,255,255));
		//rpt.setBackground(	new Color(0,255,255));
                rpt3.setRowHeight(30);
                
		rpt3.setRowMargin(10);
        bupdt.addActionListener(this);
         bpt.addActionListener(this);
        badd.addActionListener(this);
        bcnc.addActionListener(this);
        bcfl.addActionListener(this);
        brs.addActionListener(this);
        bpt.setVisible(false);
        brs1.addActionListener(this);
        bdelle.addActionListener(this);
        bdel.addActionListener(this);
        csr.addItemListener(this);
         csr1.addItemListener(this);
        tsrc.addKeyListener(this);
         trn1.addKeyListener(this);
          trn2.addKeyListener(this);
        tfa.addKeyListener(this);
         tid.addKeyListener(this);
          tnm1.addKeyListener(this);
           tnm2.addKeyListener(this);
        lstat.addKeyListener(this);
         tcls2.addKeyListener(this);
          tcls3.addKeyListener(this);
       
        tauthr.addKeyListener(this);
        tacno.addKeyListener(this);
        
        title1.addKeyListener(this);
        title2.addKeyListener(this);
        title3.addKeyListener(this);
        title4.addKeyListener(this);
        title5.addKeyListener(this);
        title6.addKeyListener(this);
        title7.addKeyListener(this);
        title8.addKeyListener(this);
        title9.addKeyListener(this);
        title10.addKeyListener(this);
        title11.addKeyListener(this);
        title12.addKeyListener(this);
        
        author1.addKeyListener(this);
        author2.addKeyListener(this);
        author3.addKeyListener(this);
        author4.addKeyListener(this);
        author5.addKeyListener(this);
        author6.addKeyListener(this);
        author7.addKeyListener(this);
        author8.addKeyListener(this);
        author9.addKeyListener(this);
        author10.addKeyListener(this);
        author11.addKeyListener(this);
        author12.addKeyListener(this);
        
        accno1.addKeyListener(this);
        accno2.addKeyListener(this);
        accno3.addKeyListener(this);
        accno4.addKeyListener(this);
        accno5.addKeyListener(this);
        accno6.addKeyListener(this);
        accno7.addKeyListener(this);
        accno8.addKeyListener(this);
        accno9.addKeyListener(this);
        accno10.addKeyListener(this);
        accno11.addKeyListener(this);
        accno12.addKeyListener(this);
      //  csr.addItem("");
        l1.setForeground(Color.YELLOW);
      l1.setVisible(false);
      
        tid.addKeyListener(this);
 tid.addFocusListener(this);
 tfa.addFocusListener(this);
		//tnm.addKeyListener(this);
        //atm.addKeyListener(this);
   
//        resultset1();
        enText(false);
        setSize(1356, 768);
        setLocation(0, 0);
        
        setVisible(true);
        tauthr.setEnabled(false);
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
                    } else if (tchgs.getText().equals("00000") && tchgs.getText().equals("0000")) {
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
void showrn()
{
       try {
           
	//
           int ele =  Integer.parseInt((String) csr.getSelectedItem());
           String tablex=(String) tnm.getSelectedItem();
           if(tablex.equals("FY"))
            {
                tabledata="FyBscBBR";
                tabledata1="FyBscBB";
            
            }
             else  if(tablex.equals("SY"))
            {
                tabledata="SyBscBBR";
                 tabledata1="SyBscBB";
            
            }
             else  if(tablex.equals("TY"))
            {
                tabledata="TyBscBBR";
                 tabledata1="TyBscBB";
            }
           
        // String que="select * from fybscbb where id="+ele1+"";
         
            mod.setRowCount(0);
            mod.setColumnCount(0);

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           Statement stmt = con.createStatement();
           // PreparedStatement psd=con.prepareStatement(que);
           // psd.setInt(1,ele1);
            ResultSet  rs = stmt.executeQuery("select id,div,name,roll_no,contact_no,caste,status from "+tabledata1+"  where id=" + ele + "");
            rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                mod.addColumn(rsmd.getColumnLabel(i));
               
            }

            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    Data[i - 1] = rs.getString(i);
                 
                   
                } mod.addRow(Data);
              

            }
             mod1.setRowCount(0);
            mod1.setColumnCount(0);
              Statement stmt1 = con.createStatement();
           // PreparedStatement psd=con.prepareStatement(que);
           // psd.setInt(1,ele1);
            ResultSet  rs15 = stmt1.executeQuery("select title,author,accession_no,issue_date from "+tabledata+"  where id=" + ele + "");
            rsmd1 = rs15.getMetaData();
            for (int i = 1; i <= rsmd1.getColumnCount(); i++) {
                mod1.addColumn(rsmd1.getColumnLabel(i));
               
            }

            while (rs15.next()) {
                for (int i = 1; i <= rsmd1.getColumnCount(); i++) {
                    Data1[i - 1] = rs15.getString(i);
                 
                   
                } mod1.addRow(Data1);
              

            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
}
    public void actionPerformed(ActionEvent e1) {
        
        try {
            if (e1.getSource() == brs1) {
                //brs1.setVisible(false);
                setSize(1356, 768);
                PrinterJob printJob = PrinterJob.getPrinterJob();
                printJob.setPrintable(this);
                if (printJob.printDialog()) {

                    printJob.print();

                    printJob.cancel();
                }
                printJob.cancel();
                brs1.setVisible(true);
                setSize(1356, 768);
            }
        } catch (PrinterException ex) {
        }
         if (e1.getSource() == bpt) 
         {
            btnen(true);
              clearBook();
                  mod.setRowCount(0);
            mod.setColumnCount(0);
              mod1.setRowCount(0);
            mod1.setColumnCount(0);
                  mod2.setRowCount(0);
            mod2.setColumnCount(0);
              mod3.setRowCount(0);
            mod3.setColumnCount(0);
            csr.removeAllItems();
            csr1.removeAllItems();
            pf1.setVisible(true);
             pf4.setVisible(true);
            pf7.setVisible(false);
            pf8.setVisible(false);
            pf3.setVisible(true);
            pf9.setVisible(false);
            bpt.setVisible(false);
            
            
         }
       
        if (e1.getSource() == badd) {
             String tablex = (String) tnm.getSelectedItem();
          
            if ( tfa.getText().equals("")  || tacno.getText().equals("")  ) 
                    {
                JOptionPane.showMessageDialog(null, "Please Enter The Details", "Confirm", JOptionPane.INFORMATION_MESSAGE);
            } 
            
            else  if(tablex.equals("FY"))
            {
                tabledata="FyBscBBR";
                tabledata1="FyBscBB";
             tauthr.setText("Issued");
             saveBook();
            }
             else  if(tablex.equals("SY"))
            {
                tabledata="SyBscBBR";
                 tabledata1="SyBscBB";
             tauthr.setText("Issued");
             saveBook();
            }
             else  if(tablex.equals("TY"))
            {
                tabledata="TyBscBBR";
                 tabledata1="TyBscBB";
             tauthr.setText("Issued");
             saveBook();
            }

        }
        if (e1.getSource() == bupdt) {

      	  Object cellvalue[][] = new Object[1000][1000];
            
    int rowCount1 = mod2.getRowCount();
int columnCount1 = mod2.getColumnCount();
for(int i=0; i<rowCount1; i++) {
    
  for(int j=0; j<columnCount1; j++) {
      
     cellvalue[i][j] = mod2.getValueAt(i,j);
    
  }
}
 
 
  
 
 int j=  Integer.parseInt((String) cellvalue[0][0]);
 String k=cellvalue[0][1].toString();
 String l =cellvalue[0][2].toString();
       int m=Integer.parseInt((String) cellvalue[0][3]);
 Double n=Double.parseDouble((String) cellvalue[0][4]);
 String o=(String) cbk4.getSelectedItem();

          Date  dg = null;
            try {
                dg = new SimpleDateFormat("dd/MM/yyyy").parse(bdt12.getText());
            } catch (ParseException ex) {
                Logger.getLogger(FyBscBBForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                          String d3 = new SimpleDateFormat("dd-MMM-yyyy").format(dg);
 String p=d3;
 String q=cellvalue[0][5].toString();
 
 if(rowCount1==1)
 {
    updateBook(j,k,l,m,n,o,p,q);
     
        
         //  JOptionPane.showMessageDialog(null, "1 Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
        
         
 }
  else
  if(rowCount1==2)
 {
   int j1=  Integer.parseInt((String) cellvalue[1][0]);
 String k1=cellvalue[1][1].toString();
 String l1 =cellvalue[1][2].toString();
       int m1=Integer.parseInt((String) cellvalue[1][3]);
 Double n1=Double.parseDouble((String) cellvalue[1][4]);
  String o1=(String) cbk5.getSelectedItem();

        
 String p1=d3;
 String q1=cellvalue[1][5].toString();
     updateBook1(j,k,l,m,n,o,p,q,j1,k1,l1,m1,n1,o1,p1,q1);
     
    // JOptionPane.showMessageDialog(null, "2 Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
     
     
     
     
         
 }
 else
     if(rowCount1==3)
 {
   int j1=  Integer.parseInt((String) cellvalue[1][0]);
 String k1=cellvalue[1][1].toString();
 String l1 =cellvalue[1][2].toString();
       int m1=Integer.parseInt((String) cellvalue[1][3]);
 Double n1=Double.parseDouble((String) cellvalue[1][4]);
 String o1=(String) cbk5.getSelectedItem();
 String p1=d3;//cellvalue[1][6].toString();
 String q1=cellvalue[1][5].toString();
  int j2=  Integer.parseInt((String) cellvalue[2][0]);
 String k2=cellvalue[2][1].toString();
 String l2 =cellvalue[2][2].toString();
       int m2=Integer.parseInt((String) cellvalue[2][3]);
 Double n2=Double.parseDouble((String) cellvalue[2][4]);
 String o2=(String) cbk6.getSelectedItem();
 String p2=d3;//cellvalue[2][6].toString();
 String q2=cellvalue[2][5].toString();
     updateBook2(j,k,l,m,n,o,p,q,j1,k1,l1,m1,n1,o1,p1,q1,j2,k2,l2,m2,n2,o2,p2,q2);
     
     //JOptionPane.showMessageDialog(null, "3 Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
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
        if(e1.getSource() == bdelle)
            {
                
              l1.setVisible(true);
              delBook();
              
               
            }
        if (e1.getSource() == brs) {
            
            resultset1();
                  //btnen(false);
            
            pf3.setVisible(false);
            pf1.setVisible(false);
             pf4.setVisible(false);
            pf7.setVisible(true);
            pf8.setVisible(true);
            pf9.setVisible(true);
             bpt.setVisible(true);
             
           
              
            /*  */
           // delBook();
           // showBook();
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
            
            showrn();
            //showBook();
        }
        if (ie.getSource() == csr1) {
            count = 0;
            count1 = 0;
            
            show1();
            //showBook();
        }

    }
 void show1(){
        try {
	
            mod2.setRowCount(0);
            mod2.setColumnCount(0);
                String tablex=(String) tnm.getSelectedItem();
           if(tablex.equals("FY"))
            {
                tabledata="FyBscBBR";
                tabledata1="FyBscBB";
            
            }
             else  if(tablex.equals("SY"))
            {
                tabledata="SyBscBBR";
                 tabledata1="SyBscBB";
            
            }
             else  if(tablex.equals("TY"))
            {
                tabledata="TyBscBBR";
                 tabledata1="TyBscBB";
            }
           
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            Statement stmt = con.createStatement();
            int j =  Integer.parseInt((String) csr1.getSelectedItem());
           
		  ResultSet  rs = stmt.executeQuery("select id,div,name,roll_no,contact_no,status from "+tabledata1+" where id="+j);
            rsmd2 = rs.getMetaData();
            for (int i = 1; i <= rsmd2.getColumnCount(); i++) {
                mod2.addColumn(rsmd2.getColumnLabel(i));
               
            }

            while (rs.next()) {
                for (int i = 1; i <= rsmd2.getColumnCount(); i++) {
                    Data2[i - 1] = rs.getString(i);
                 
                   
                } mod2.addRow(Data2);
              

            }
              mod3.setRowCount(0);
            mod3.setColumnCount(0);
              ResultSet  rs1 = stmt.executeQuery("select title,author,accession_no from "+tabledata+" where id="+j);
            rsmd3 = rs1.getMetaData();
            for (int i = 1; i <= rsmd3.getColumnCount(); i++) {
                mod3.addColumn(rsmd3.getColumnLabel(i));
               
            }

            while (rs1.next()) {
                for (int i = 1; i <= rsmd3.getColumnCount(); i++) {
                    Data3[i - 1] = rs1.getString(i);
                 
                   
                } mod3.addRow(Data3);
              

            }
          con.commit();
          con.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
    void btnen(Boolean b) {

        badd.setEnabled(b);
        bcfl.setEnabled(b);
        bcnc.setEnabled(b);
    }
 void returnBook()
 {
       try {
            String tablex=(String) tnm.getSelectedItem();
           if(tablex.equals("FY"))
            {
                tabledata="FyBscBBR";
                tabledata1="FyBscBB";
            
            }
             else  if(tablex.equals("SY"))
            {
                tabledata="SyBscBBR";
                 tabledata1="SyBscBB";
            
            }
             else  if(tablex.equals("TY"))
            {
                tabledata="TyBscBBR";
                 tabledata1="TyBscBB";
            }
           
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
             int ele1 =  Integer.parseInt((String) csr.getSelectedItem());
              java.sql.Statement stmt1 = con.createStatement();

            ResultSet rs1 = stmt1.executeQuery("select status from "+tabledata1+" where id="+ele1+"");
            while (rs1.next()) {
                no = rs1.getString("status");
                //csr.addItem(no);
            }
            if(no.equals("Returned"))
            {
                   l1.setVisible(true);
               l1.setText("Book Bank is already Returned By Id "+ele1);
            }
            else
            {
            PreparedStatement pfadd = con.prepareStatement("update "+tabledata1+" set status=? where id=? and status=?");
            pfadd.setString(1,"Returned");
           // int y=Integer.parseInt(ele1);
            pfadd.setInt(2,ele1);
             
            pfadd.setString(3,"Issued");
            pfadd.executeUpdate();
           
          
          
            con.commit();
            con.close();
               enText(false);
               l1.setVisible(true);
               l1.setText("Book Bank Books Returned By Id "+ele1);
               showrn();
            }  
           // JOptionPane.showMessageDialog(null, "Booked Returned", "confirm ", JOptionPane.INFORMATION_MESSAGE);

          

        } catch (Exception e2) {
		//System.out.println(e2);
            //e2.printStackTrace
        }

 }
   void updateBook(int a,String b,String c,int d,Double e,String f,String g,String h) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
             ele12=(String) csr1.getSelectedItem();
 
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata1+" where id=?");
            pfadd1.setInt(1, Integer.parseInt(ele12));

            pfadd1.executeUpdate();
         
              PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, a);
          
            pfadd.setString(2, b);
              pfadd.setString(3,c);
              pfadd.setInt(4,d);
              pfadd.setDouble(5,e);
               pfadd.setString(6,f);
         
                           
    	  	pfadd.setString(7,g);
        
            pfadd.setString(8,h);
          
           
         
            pfadd.executeUpdate();
            int x=a;
            find(x,g);
 
 
 
         

        } catch (Exception e2) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }

    }
   
    void Book(int a,String b,String c,Double d,String e) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } catch (Exception e2) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    }
      void Book1(int a,String b,String c,Double d,String e,String b1,String c1,Double d1) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
            
       } catch (Exception e2) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    }
    void Book2(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    }
     void Book3(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    }
      void Book4(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    }
       void Book5(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4,String b5,String c5,Double d5) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             PreparedStatement pfadd6= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd6.setInt(1, a);
          pfadd6.setString(2, b5);
           pfadd6.setString(3,c5);
             pfadd6.setDouble(4,d5);
             pfadd6.setString(5,e);
            pfadd6.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    
}
       void Book6(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4,String b5,String c5,Double d5,String b6,String c6,Double d6) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             PreparedStatement pfadd6= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd6.setInt(1, a);
          pfadd6.setString(2, b5);
           pfadd6.setString(3,c5);
             pfadd6.setDouble(4,d5);
             pfadd6.setString(5,e);
            pfadd6.executeUpdate();
            PreparedStatement pfadd7= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd7.setInt(1, a);
          pfadd7.setString(2, b6);
           pfadd7.setString(3,c6);
             pfadd7.setDouble(4,d6);
             pfadd7.setString(5,e);
            pfadd7.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    
}
       
       void Book7(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4,String b5,String c5,Double d5,String b6,String c6,Double d6,String b7,String c7,Double d7) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             PreparedStatement pfadd6= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd6.setInt(1, a);
          pfadd6.setString(2, b5);
           pfadd6.setString(3,c5);
             pfadd6.setDouble(4,d5);
             pfadd6.setString(5,e);
            pfadd6.executeUpdate();
            PreparedStatement pfadd7= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd7.setInt(1, a);
          pfadd7.setString(2, b6);
           pfadd7.setString(3,c6);
             pfadd7.setDouble(4,d6);
             pfadd7.setString(5,e);
            pfadd7.executeUpdate();
            PreparedStatement pfadd8= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd8.setInt(1, a);
          pfadd8.setString(2, b7);
           pfadd8.setString(3,c7);
             pfadd8.setDouble(4,d7);
             pfadd8.setString(5,e);
            pfadd8.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    
}
            void Book8(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4,String b5,String c5,Double d5,String b6,String c6,Double d6,String b7,String c7,Double d7,String b8,String c8,Double d8) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             PreparedStatement pfadd6= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd6.setInt(1, a);
          pfadd6.setString(2, b5);
           pfadd6.setString(3,c5);
             pfadd6.setDouble(4,d5);
             pfadd6.setString(5,e);
            pfadd6.executeUpdate();
            PreparedStatement pfadd7= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd7.setInt(1, a);
          pfadd7.setString(2, b6);
           pfadd7.setString(3,c6);
             pfadd7.setDouble(4,d6);
             pfadd7.setString(5,e);
            pfadd7.executeUpdate();
            PreparedStatement pfadd8= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd8.setInt(1, a);
          pfadd8.setString(2, b7);
           pfadd8.setString(3,c7);
             pfadd8.setDouble(4,d7);
             pfadd8.setString(5,e);
            pfadd8.executeUpdate();
             PreparedStatement pfadd9= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd9.setInt(1, a);
          pfadd9.setString(2, b8);
           pfadd9.setString(3,c8);
             pfadd9.setDouble(4,d8);
             pfadd9.setString(5,e);
            pfadd9.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    
}
              void Book9(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4,String b5,String c5,Double d5,String b6,String c6,Double d6,String b7,String c7,Double d7,String b8,String c8,Double d8,String b9,String c9,Double d9) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             PreparedStatement pfadd6= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd6.setInt(1, a);
          pfadd6.setString(2, b5);
           pfadd6.setString(3,c5);
             pfadd6.setDouble(4,d5);
             pfadd6.setString(5,e);
            pfadd6.executeUpdate();
            PreparedStatement pfadd7= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd7.setInt(1, a);
          pfadd7.setString(2, b6);
           pfadd7.setString(3,c6);
             pfadd7.setDouble(4,d6);
             pfadd7.setString(5,e);
            pfadd7.executeUpdate();
            PreparedStatement pfadd8= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd8.setInt(1, a);
          pfadd8.setString(2, b7);
           pfadd8.setString(3,c7);
             pfadd8.setDouble(4,d7);
             pfadd8.setString(5,e);
            pfadd8.executeUpdate();
             PreparedStatement pfadd9= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd9.setInt(1, a);
          pfadd9.setString(2, b8);
           pfadd9.setString(3,c8);
             pfadd9.setDouble(4,d8);
             pfadd9.setString(5,e);
            pfadd9.executeUpdate();
             PreparedStatement pfadd10= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd10.setInt(1, a);
          pfadd10.setString(2, b9);
           pfadd10.setString(3,c9);
             pfadd10.setDouble(4,d9);
             pfadd10.setString(5,e);
            pfadd10.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    
}
                       void Book10(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4,String b5,String c5,Double d5,String b6,String c6,Double d6,String b7,String c7,Double d7,String b8,String c8,Double d8,String b9,String c9,Double d9,String b10,String c10,Double d10) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             PreparedStatement pfadd6= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd6.setInt(1, a);
          pfadd6.setString(2, b5);
           pfadd6.setString(3,c5);
             pfadd6.setDouble(4,d5);
             pfadd6.setString(5,e);
            pfadd6.executeUpdate();
            PreparedStatement pfadd7= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd7.setInt(1, a);
          pfadd7.setString(2, b6);
           pfadd7.setString(3,c6);
             pfadd7.setDouble(4,d6);
             pfadd7.setString(5,e);
            pfadd7.executeUpdate();
            PreparedStatement pfadd8= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd8.setInt(1, a);
          pfadd8.setString(2, b7);
           pfadd8.setString(3,c7);
             pfadd8.setDouble(4,d7);
             pfadd8.setString(5,e);
            pfadd8.executeUpdate();
             PreparedStatement pfadd9= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd9.setInt(1, a);
          pfadd9.setString(2, b8);
           pfadd9.setString(3,c8);
             pfadd9.setDouble(4,d8);
             pfadd9.setString(5,e);
            pfadd9.executeUpdate();
             PreparedStatement pfadd10= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd10.setInt(1, a);
          pfadd10.setString(2, b9);
           pfadd10.setString(3,c9);
             pfadd10.setDouble(4,d9);
             pfadd10.setString(5,e);
            pfadd10.executeUpdate();
            PreparedStatement pfadd11= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd11.setInt(1, a);
          pfadd11.setString(2, b10);
           pfadd11.setString(3,c10);
             pfadd11.setDouble(4,d10);
             pfadd11.setString(5,e);
            pfadd11.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    
}
                       
                       void Book11(int a,String b,String c,Double d,String e,String b1,String c1,Double d1,String b2,String c2,Double d2,String b3,String c3,Double d3,String b4,String c4,Double d4,String b5,String c5,Double d5,String b6,String c6,Double d6,String b7,String c7,Double d7,String b8,String c8,Double d8,String b9,String c9,Double d9,String b10,String c10,Double d10,String b11,String c11,Double d11) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           PreparedStatement pfadd1 = con20.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, a);
         pfadd1.executeUpdate();
          PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd.setInt(1, a);
          pfadd.setString(2, b);
           pfadd.setString(3,c);
             pfadd.setDouble(4,d);
             pfadd.setString(5,e);
            pfadd.executeUpdate();
             PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd2.setInt(1, a);
          pfadd2.setString(2, b1);
           pfadd2.setString(3,c1);
             pfadd2.setDouble(4,d1);
             pfadd2.setString(5,e);
            pfadd2.executeUpdate();
             PreparedStatement pfadd3 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd3.setInt(1, a);
          pfadd3.setString(2, b2);
           pfadd3.setString(3,c2);
             pfadd3.setDouble(4,d2);
             pfadd3.setString(5,e);
            pfadd3.executeUpdate();
             PreparedStatement pfadd4 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd4.setInt(1, a);
          pfadd4.setString(2, b3);
           pfadd4.setString(3,c3);
             pfadd4.setDouble(4,d3);
             pfadd4.setString(5,e);
            pfadd4.executeUpdate();
              PreparedStatement pfadd5 = con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd5.setInt(1, a);
          pfadd5.setString(2, b4);
           pfadd5.setString(3,c4);
             pfadd5.setDouble(4,d4);
             pfadd5.setString(5,e);
            pfadd5.executeUpdate();
             PreparedStatement pfadd6= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd6.setInt(1, a);
          pfadd6.setString(2, b5);
           pfadd6.setString(3,c5);
             pfadd6.setDouble(4,d5);
             pfadd6.setString(5,e);
            pfadd6.executeUpdate();
            PreparedStatement pfadd7= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd7.setInt(1, a);
          pfadd7.setString(2, b6);
           pfadd7.setString(3,c6);
             pfadd7.setDouble(4,d6);
             pfadd7.setString(5,e);
            pfadd7.executeUpdate();
            PreparedStatement pfadd8= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd8.setInt(1, a);
          pfadd8.setString(2, b7);
           pfadd8.setString(3,c7);
             pfadd8.setDouble(4,d7);
             pfadd8.setString(5,e);
            pfadd8.executeUpdate();
             PreparedStatement pfadd9= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd9.setInt(1, a);
          pfadd9.setString(2, b8);
           pfadd9.setString(3,c8);
             pfadd9.setDouble(4,d8);
             pfadd9.setString(5,e);
            pfadd9.executeUpdate();
             PreparedStatement pfadd10= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd10.setInt(1, a);
          pfadd10.setString(2, b9);
           pfadd10.setString(3,c9);
             pfadd10.setDouble(4,d9);
             pfadd10.setString(5,e);
            pfadd10.executeUpdate();
            PreparedStatement pfadd11= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd11.setInt(1, a);
          pfadd11.setString(2, b10);
           pfadd11.setString(3,c10);
             pfadd11.setDouble(4,d10);
             pfadd11.setString(5,e);
            pfadd11.executeUpdate();
             PreparedStatement pfadd12= con20.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");
             pfadd12.setInt(1, a);
          pfadd12.setString(2, b11);
           pfadd12.setString(3,c11);
             pfadd12.setDouble(4,d11);
             pfadd12.setString(5,e);
            pfadd12.executeUpdate();
             System.out.println("sam");
              con20.commit();
              con20.close();
       } 
       catch (ClassNotFoundException | SQLException en)
       {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
    
}
     void updateBook1(int a,String b,String c,int d,Double e,String f,String g,String h,int a1,String b1,String c1,int d1,Double e1,String f1,String g1,String h1) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           ele12=(String) csr1.getSelectedItem();
 
           PreparedStatement pfadd12 = con20.prepareStatement("delete  from "+tabledata1+" where id=?");
            pfadd12.setInt(1, Integer.parseInt(ele12));

            pfadd12.executeUpdate();
          
          
              PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, a);
           System.out.println(a);
           System.out.println(b); System.out.println(c); System.out.println(d); System.out.println(e); System.out.println(f);
            System.out.println(g); System.out.println(h);
            pfadd.setString(2, b);
              pfadd.setString(3,c);
              pfadd.setInt(4,d);
              pfadd.setDouble(5,e);
             // 
           
            pfadd.setString(6,f);
     
    	  	pfadd.setString(7,g);
        
            pfadd.setString(8,h);
          
        
         
            pfadd.executeUpdate();
            PreparedStatement pfadd1 = con20.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd1.setInt(1, a1);
         
            pfadd1.setString(2, b1);
              pfadd1.setString(3,c1);
              pfadd1.setInt(4,d1);
              pfadd1.setDouble(5,e1);
             // ele12=(String) cbk1.getSelectedItem();
           
            pfadd1.setString(6,f1);
        pfadd1.setString(7,g1);
        
            pfadd1.setString(8,h1);
           pfadd1.executeUpdate();
            find(a1,g);  
            //
         
 
         

        } catch (Exception e82) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }

    }
     void find(int a,String g1 )
     {
         try
         {
               String u=g1;
           
            Object cellvalue1[][] = new Object[1000][1000];  
             int  rowCount = mod3.getRowCount();
int columnCount = mod3.getColumnCount();
for(int i=0; i<rowCount; i++) {
    
  for(int j=0; j<columnCount; j++) {
      
     cellvalue1[i][j] = mod3.getValueAt(i,j);
    
  }
}

for(int i=0; i<rowCount; i++) {
    
  for(int j=0; j<columnCount; j++) {
      
      System.out.println( cellvalue1[i][j]);
    
  }
}
 String r=cellvalue1[0][0].toString();
 String s =cellvalue1[0][1].toString();
 Double t=Double.parseDouble((String) cellvalue1[0][2]);
//  System.out.println();
 if(rowCount==1)
 {
     
    Book(a,r,s,t,u);
      System.out.println(rowCount+"sam");
     JOptionPane.showMessageDialog(null, "1 Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
  else
  if(rowCount==2)
 {
 
 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);
 
    Book1(a,r,s,t,u,r1,s1,t1);
     JOptionPane.showMessageDialog(null, "2 Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
  else
  if(rowCount==3)
 {
 
 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);
 
 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
    Book2(a,r,s,t,u,r1,s1,t1,r2,s2,t2);
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
 else
  if(rowCount==4)
 {
 

 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
    Book3(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3);
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
 else
  if(rowCount==5)
 {
 

 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
 String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);

 
    Book4(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4);
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
  else
       if(rowCount==6)
 {
 

 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
 String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);
 String r5=cellvalue1[5][0].toString();
 String s5 =cellvalue1[5][1].toString();
 Double t5=Double.parseDouble((String) cellvalue1[5][2]);
 

    Book5(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4,r5,s5,t5);
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
 else
            if(rowCount==7)
 {
 

 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
  String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);
 String r5=cellvalue1[5][0].toString();
 String s5 =cellvalue1[5][1].toString();
 Double t5=Double.parseDouble((String) cellvalue1[5][2]);
  String r6=cellvalue1[6][0].toString();
 String s6=cellvalue1[6][1].toString();
 Double t6=Double.parseDouble((String) cellvalue1[6][2]);
 
    Book6(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4,r5,s5,t5,r6,s6,t6);
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
 else
                 if(rowCount==8)
 {
 

 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
  String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);
 String r5=cellvalue1[5][0].toString();
 String s5 =cellvalue1[5][1].toString();
 Double t5=Double.parseDouble((String) cellvalue1[5][2]);
  String r6=cellvalue1[6][0].toString();
 String s6=cellvalue1[6][1].toString();
 Double t6=Double.parseDouble((String) cellvalue1[6][2]);
 String r7=cellvalue1[7][0].toString();
 String s7=cellvalue1[7][1].toString();
 Double t7=Double.parseDouble((String) cellvalue1[7][2]);
    Book7(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4,r5,s5,t5,r6,s6,t6, r7,s7,t7);
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
 else
       if(rowCount==9)
 {
 

  String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
  String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);
 String r5=cellvalue1[5][0].toString();
 String s5 =cellvalue1[5][1].toString();
 Double t5=Double.parseDouble((String) cellvalue1[5][2]);
  String r6=cellvalue1[6][0].toString();
 String s6=cellvalue1[6][1].toString();
 Double t6=Double.parseDouble((String) cellvalue1[6][2]);
 String r7=cellvalue1[7][0].toString();
 String s7=cellvalue1[7][1].toString();
 Double t7=Double.parseDouble((String) cellvalue1[7][2]);
 String r8=cellvalue1[8][0].toString();
 String s8=cellvalue1[8][1].toString();
 Double t8=Double.parseDouble((String) cellvalue1[8][2]);
    Book8(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4,r5,s5,t5,r6,s6,t6, r7,s7,t7,r8,s8,t8);
 
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
 else
            if(rowCount==10)
 {
 
 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
  String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);
 String r5=cellvalue1[5][0].toString();
 String s5 =cellvalue1[5][1].toString();
 Double t5=Double.parseDouble((String) cellvalue1[5][2]);
  String r6=cellvalue1[6][0].toString();
 String s6=cellvalue1[6][1].toString();
 Double t6=Double.parseDouble((String) cellvalue1[6][2]);
 String r7=cellvalue1[7][0].toString();
 String s7=cellvalue1[7][1].toString();
 Double t7=Double.parseDouble((String) cellvalue1[7][2]);
 String r8=cellvalue1[8][0].toString();
 String s8=cellvalue1[8][1].toString();
 Double t8=Double.parseDouble((String) cellvalue1[8][2]);
 String r9=cellvalue1[9][0].toString();
 String s9=cellvalue1[9][1].toString();
 Double t9=Double.parseDouble((String) cellvalue1[9][2]);
    Book9(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4,r5,s5,t5,r6,s6,t6, r7,s7,t7,r8,s8,t8,r9,s9,t9);
  
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            
         
 }
 else
                 if(rowCount==11)
 {
 
 String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
  String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);
 String r5=cellvalue1[5][0].toString();
 String s5 =cellvalue1[5][1].toString();
 Double t5=Double.parseDouble((String) cellvalue1[5][2]);
  String r6=cellvalue1[6][0].toString();
 String s6=cellvalue1[6][1].toString();
 Double t6=Double.parseDouble((String) cellvalue1[6][2]);
 String r7=cellvalue1[7][0].toString();
 String s7=cellvalue1[7][1].toString();
 Double t7=Double.parseDouble((String) cellvalue1[7][2]);
 String r8=cellvalue1[8][0].toString();
 String s8=cellvalue1[8][1].toString();
 Double t8=Double.parseDouble((String) cellvalue1[8][2]);
 String r9=cellvalue1[9][0].toString();
 String s9=cellvalue1[9][1].toString();
 Double t9=Double.parseDouble((String) cellvalue1[9][2]);
  String r10=cellvalue1[10][0].toString();
 String s10=cellvalue1[10][1].toString();
 Double t10=Double.parseDouble((String) cellvalue1[10][2]);
    Book10(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4,r5,s5,t5,r6,s6,t6, r7,s7,t7,r8,s8,t8,r9,s9,t9,r10,s10,t10);
  
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
             
            
         
 }
                  if(rowCount==12)
 {
 

  String r1=cellvalue1[1][0].toString();
 String s1 =cellvalue1[1][1].toString();
 Double t1=Double.parseDouble((String) cellvalue1[1][2]);

 String r2=cellvalue1[2][0].toString();
 String s2 =cellvalue1[2][1].toString();
 Double t2=Double.parseDouble((String) cellvalue1[2][2]);
 String r3=cellvalue1[3][0].toString();
 String s3 =cellvalue1[3][1].toString();
 Double t3=Double.parseDouble((String) cellvalue1[3][2]);
  String r4=cellvalue1[4][0].toString();
 String s4 =cellvalue1[4][1].toString();
 Double t4=Double.parseDouble((String) cellvalue1[4][2]);
 String r5=cellvalue1[5][0].toString();
 String s5 =cellvalue1[5][1].toString();
 Double t5=Double.parseDouble((String) cellvalue1[5][2]);
  String r6=cellvalue1[6][0].toString();
 String s6=cellvalue1[6][1].toString();
 Double t6=Double.parseDouble((String) cellvalue1[6][2]);
 String r7=cellvalue1[7][0].toString();
 String s7=cellvalue1[7][1].toString();
 Double t7=Double.parseDouble((String) cellvalue1[7][2]);
 String r8=cellvalue1[8][0].toString();
 String s8=cellvalue1[8][1].toString();
 Double t8=Double.parseDouble((String) cellvalue1[8][2]);
 String r9=cellvalue1[9][0].toString();
 String s9=cellvalue1[9][1].toString();
 Double t9=Double.parseDouble((String) cellvalue1[9][2]);
  String r10=cellvalue1[10][0].toString();
 String s10=cellvalue1[10][1].toString();
 Double t10=Double.parseDouble((String) cellvalue1[10][2]);
 String r11=cellvalue1[11][0].toString();
 String s11=cellvalue1[11][1].toString();
 Double t11=Double.parseDouble((String) cellvalue1[11][2]);
    Book11(a,r,s,t,u,r1,s1,t1,r2,s2,t2,r3,s3,t3,r4,s4,t4,r5,s5,t5,r6,s6,t6, r7,s7,t7,r8,s8,t8,r9,s9,t9,r10,s10,t10,r11,s11,t11);
  
     JOptionPane.showMessageDialog(null, " Student record updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);
             
            
         
 }
 
  
         }
         catch(Exception on)
         {
             
         }
     }
     
         void updateBook2(int a,String b,String c,int d,Double e,String f,String g,String h,int a1,String b1,String c1,int d1,Double e1,String f1,String g1,String h1,int a2,String b2,String c2,int d2,Double e2,String f2,String g2,String h2) {

       try {
           
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              //int ele =  Integer.parseInt((String) csr.getSelectedItem());
            Connection con20= DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           
 
           PreparedStatement pfadd12 = con20.prepareStatement("delete  from "+tabledata1+" where id=?");
            pfadd12.setInt(1, a);

            pfadd12.executeUpdate();
          
              PreparedStatement pfadd = con20.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, a);
         
            pfadd.setString(2, b);
              pfadd.setString(3,c);
              pfadd.setInt(4,d);
              pfadd.setDouble(5,e);
             // ele12=(String) cbk1.getSelectedItem();
           
            pfadd.setString(6,f);
        
                           
    	  	pfadd.setString(7,g);
        
            pfadd.setString(8,h);
          
        
         
            pfadd.executeUpdate();
            PreparedStatement pfadd1 = con20.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd1.setInt(1, a1);
          
            pfadd1.setString(2, b1);
              pfadd1.setString(3,c1);
              pfadd1.setInt(4,d1);
              pfadd1.setDouble(5,e1);
             // ele12=(String) cbk1.getSelectedItem();
           
            pfadd1.setString(6,f1);
        
                           
    	  	pfadd1.setString(7,g1);
        
            pfadd1.setString(8,h1);
          
        
        
            pfadd1.executeUpdate();
              PreparedStatement pfadd2 = con20.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd2.setInt(1, a2);
        
            pfadd2.setString(2, b2);
              pfadd2.setString(3,c2);
              pfadd2.setInt(4,d2);
              pfadd2.setDouble(5,e2);
             // ele22=(String) cbk2.getSelectedItem();
           
            pfadd2.setString(6,f2);
        
                           
    	  	pfadd2.setString(7,g2);
        
            pfadd2.setString(8,h2);
          
        
         
            pfadd2.executeUpdate();
            find(a1,g);  
            //
       }

        
       catch (Exception e72) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }
         

    }

    void saveBook() {
         
        try {
             //JOptionPane.showMessageDialog(null, "Details", "Confirm", JOptionPane.INFORMATION_MESSAGE);
         
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con12 = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
                         int  i=0;
                         int t=0;
  
                         
                   if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") &&  !tnm2.getText().equals("") && !trn2.getText().equals("") && tcls3.getText().equals(""))
                {
                    
                 JOptionPane.showMessageDialog(null, "please enter the contact of third student  ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                  
                }
                  else
                     if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") && !trn1.getText().equals("") && !tcls2.getText().equals("") && !tnm2.getText().equals("") &&  trn2.getText().equals("") && !tcls3.getText().equals(""))
                {
                 JOptionPane.showMessageDialog(null, "please enter the roll no of third student   ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                  else
                     if(!tid.getText().equals("") && !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && tnm2.getText().equals("") &&  !trn2.getText().equals("") && !tcls3.getText().equals(""))
                {
                 JOptionPane.showMessageDialog(null, "please enter  the name of third student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                } else
                     if(!tid.getText().equals("") && !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && tnm2.getText().equals("") &&  trn2.getText().equals("") && !tcls3.getText().equals(""))
                {
                 JOptionPane.showMessageDialog(null, "please enter  the name and roll no of third student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                      else
                     if(!tid.getText().equals("") && !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && tnm2.getText().equals("") &&  !trn2.getText().equals("") && tcls3.getText().equals(""))
                {
                 JOptionPane.showMessageDialog(null, "please enter  the name and contact of  third student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                      else
                     if(!tid.getText().equals("") && !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && !tnm2.getText().equals("") &&  trn2.getText().equals("") && tcls3.getText().equals(""))
                {
                 JOptionPane.showMessageDialog(null, "please enter  the roll no and contact no  of third student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                     else
                       if(tid.getText().equals("") && tsrc.getText().equals("") &&  lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && !tnm2.getText().equals("") &&  !trn2.getText().equals("") && !tcls3.getText().equals(""))
                {
                 JOptionPane.showMessageDialog(null, "please enter  details of  first student record dont leave it empty ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                } 
                     else
                           if(!tid.getText().equals("") && !tsrc.getText().equals("") &&  !lstat.getText().equals("") && tnm1.getText().equals("") &&  trn1.getText().equals("") && tcls2.getText().equals("") && !tnm2.getText().equals("") &&  !trn2.getText().equals("") && !tcls3.getText().equals(""))
                {
                 JOptionPane.showMessageDialog(null, "please enter  details of second  student record dont leave it empty ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                    else
                if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && !tnm2.getText().equals("") &&  !trn2.getText().equals("") && !tcls3.getText().equals("") && (title1.getText().equals("")  || author1.getText().equals("") || accno1.getText().equals("")))
                {
                 JOptionPane.showMessageDialog(null, "please enter the book details  ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }     
                     
                     else
                if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && !tnm2.getText().equals("") &&  !trn2.getText().equals("") && !tcls3.getText().equals("") && !title1.getText().equals("")  && !author1.getText().equals("") && !accno1.getText().equals(""))
                {
                    for( i=0;i<3;i++){
                    if(i==0)
                    {
                 PreparedStatement pfadd = con12.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, Integer.parseInt(tacno.getText()));
            pfadd.setString(2, tfa.getText());
              pfadd.setString(3,tid.getText());
              pfadd.setInt(4,Integer.parseInt(tsrc.getText()));
              pfadd.setDouble(5,Double.parseDouble(lstat.getText()));
              ele12=(String) cbk1.getSelectedItem();
            pfadd.setString(6,ele12);
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(7,d3);
       
            pfadd.setString(8, tauthr.getText());
          
        
         
            pfadd.executeUpdate();
                 }
                   
                    //1
                  if(i==1)
                  {
                 PreparedStatement pfadd = con12.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, Integer.parseInt(tacno.getText()));
            pfadd.setString(2, tfa.getText());
              pfadd.setString(3,tnm1.getText());
              pfadd.setInt(4,Integer.parseInt(trn1.getText()));
              pfadd.setDouble(5,Double.parseDouble(tcls2.getText()));
              ele12=(String) cbk2.getSelectedItem();
            pfadd.setString(6,ele12);
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(7,d3);
       
            pfadd.setString(8, tauthr.getText());
          
        
         
            pfadd.executeUpdate();
               
                  }
                   if(i==2)
                  {
                        
                 PreparedStatement pfadd = con12.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, Integer.parseInt(tacno.getText()));
            pfadd.setString(2, tfa.getText());
              pfadd.setString(3,tnm2.getText());
              pfadd.setInt(4,Integer.parseInt(trn2.getText()));
              pfadd.setDouble(5,Double.parseDouble(tcls3.getText()));
              ele12=(String) cbk3.getSelectedItem();
            pfadd.setString(6,ele12);
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(7,d3);
       
            pfadd.setString(8, tauthr.getText());
          
        
         
            pfadd.executeUpdate();
                 
                      
                  }
    
                    } //stud
                 book();
            }
                else
                          if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && tcls2.getText().equals("") )
                {
                  JOptionPane.showMessageDialog(null, "please enter the contact no of second student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                 else
                 if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  trn1.getText().equals("") && !tcls2.getText().equals("") )
                {
                  JOptionPane.showMessageDialog(null, "please enter the roll no of second student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                 else
                 if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") )
                {
                  JOptionPane.showMessageDialog(null, "please enter the name of second student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                  else
                 if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && tnm1.getText().equals("") &&  trn1.getText().equals("") && !tcls2.getText().equals("") )
                {
                  JOptionPane.showMessageDialog(null, "please enter the name and roll no of second student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                  else
                 if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && tnm1.getText().equals("") &&  !trn1.getText().equals("") && tcls2.getText().equals("") )
                {
                  JOptionPane.showMessageDialog(null, "please enter the name and contact no of second student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                  else
                 if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  trn1.getText().equals("") && tcls2.getText().equals("") )
                {
                  JOptionPane.showMessageDialog(null, "please enter the roll no and contact no  of second student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                 else
                     if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && tnm2.getText().equals("") &&  trn2.getText().equals("") && tcls3.getText().equals("") && (title1.getText().equals("")  || author1.getText().equals("") || accno1.getText().equals("")) )
                {
                 JOptionPane.showMessageDialog(null, "please enter the book details ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                }
                else
                 
                     if(!tid.getText().equals("") &&  !tsrc.getText().equals("") &&  !lstat.getText().equals("") && !tnm1.getText().equals("") &&  !trn1.getText().equals("") && !tcls2.getText().equals("") && tnm2.getText().equals("") &&  trn2.getText().equals("") && tcls3.getText().equals("") && !title1.getText().equals("")  && !author1.getText().equals("") && !accno1.getText().equals("") )
                {
                    //!title1.getText().equals("")  && !author1.getText().equals("") && !accno1.getText().equals(""))
           
                    for( i=0;i<2;i++){
                    if(i==0)
                    {
                 PreparedStatement pfadd = con12.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, Integer.parseInt(tacno.getText()));
            pfadd.setString(2, tfa.getText());
              pfadd.setString(3,tid.getText());
              pfadd.setInt(4,Integer.parseInt(tsrc.getText()));
              pfadd.setDouble(5,Double.parseDouble(lstat.getText()));
              ele12=(String) cbk1.getSelectedItem();
            pfadd.setString(6,ele12);
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(7,d3);
       
            pfadd.setString(8, tauthr.getText());
          
        
         
            pfadd.executeUpdate();
                 }
                   
                    //1
                  if(i==1)
                  {
                 PreparedStatement pfadd = con12.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, Integer.parseInt(tacno.getText()));
            pfadd.setString(2, tfa.getText());
              pfadd.setString(3,tnm1.getText());
              pfadd.setInt(4,Integer.parseInt(trn1.getText()));
              pfadd.setDouble(5,Double.parseDouble(tcls2.getText()));
              ele12=(String) cbk2.getSelectedItem();
            pfadd.setString(6,ele12);
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(7,d3);
       
            pfadd.setString(8, tauthr.getText());
          
        
         
            pfadd.executeUpdate();
               
                  }
                  
    //for
                 } 
                   
                book();
                     
     }
                else
                         if(tid.getText().equals("") &&  !tsrc.getText().equals("") && !lstat.getText().equals(""))
                         {
                              JOptionPane.showMessageDialog(null, "please enter the name of first student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                         }
                      else
                         if(!tid.getText().equals("") &&  tsrc.getText().equals("") && !lstat.getText().equals(""))
                         {
                           JOptionPane.showMessageDialog(null, "please enter the roll no of first student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                
                         }
                      else
                         if(!tid.getText().equals("") &&  !tsrc.getText().equals("") && lstat.getText().equals(""))
                         {
                           JOptionPane.showMessageDialog(null, "please enter the contact no  of first student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                
                         }
                     else
                               
                         if(tid.getText().equals("") &&  !tsrc.getText().equals("") && lstat.getText().equals(""))
                         {
                              JOptionPane.showMessageDialog(null, "please enter the name and contact no  of first student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                         }
                       else
                         if(tid.getText().equals("") &&  tsrc.getText().equals("") && !lstat.getText().equals(""))
                         {
                              JOptionPane.showMessageDialog(null, "please enter the name  roll no of first student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                         }
                       else
                         if(!tid.getText().equals("") &&  tsrc.getText().equals("") && lstat.getText().equals(""))
                         {
                              JOptionPane.showMessageDialog(null, "please enter the contact no and roll no  of first student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                         }
                     else
                          if(tid.getText().equals("") &&  tsrc.getText().equals("") && lstat.getText().equals(""))
                         {
                              JOptionPane.showMessageDialog(null, "please enter the name ,contact no and roll no  of first student ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                         }
                     else
                            if(!tid.getText().equals("") &&  !tsrc.getText().equals("")  && !lstat.equals("") && tnm1.getText().equals("") &&  trn1.getText().equals("") && tcls2.getText().equals("") && tnm2.getText().equals("") &&  trn2.getText().equals("") && tcls3.getText().equals("") && (title1.getText().equals("")  || author1.getText().equals("") || accno1.getText().equals("")))
                     {  
                         JOptionPane.showMessageDialog(null, "please enter the book details  ", "Confirm", JOptionPane.INFORMATION_MESSAGE);
             
                         
                     
                     }
                       else
                     if(!tid.getText().equals("") &&  !tsrc.getText().equals("")  && !lstat.equals("") && tnm1.getText().equals("") &&  trn1.getText().equals("") && tcls2.getText().equals("") && tnm2.getText().equals("") &&  trn2.getText().equals("") && tcls3.getText().equals("") && !title1.getText().equals("")  && !author1.getText().equals("") && !accno1.getText().equals(""))
              {
                    
                 PreparedStatement pfadd = con12.prepareStatement("insert into "+tabledata1+" values(?,?,?,?,?,?,?,?)");

           pfadd.setInt(1, Integer.parseInt(tacno.getText()));
            pfadd.setString(2, tfa.getText());
              pfadd.setString(3,tid.getText());
              pfadd.setInt(4,Integer.parseInt(tsrc.getText()));
              pfadd.setDouble(5,Double.parseDouble(lstat.getText()));
              ele12=(String) cbk1.getSelectedItem();
            pfadd.setString(6,ele12);
              d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
    	  	pfadd.setString(7,d3);
       
            pfadd.setString(8, tauthr.getText());
          
        
         
            pfadd.executeUpdate();
            book();
               
    
                    
            }    
                
       
                 
           con12.commit();
           con12.close();
           
             
            // resultset1();
             
         

        } catch (Exception e2) {
            //e2.printStackTrace();
            System.out.println(e2);
        }
    }
    void book() throws SQLException, ParseException, ClassNotFoundException
    {int t=0;
          int y=0;          
                 
              
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con13 = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
           
                    //if(y==0)
                    {
                        System.out.println("sam");
                        if(!title1.getText().equals("")  && !author1.getText().equals("") && !accno1.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title1.getText());
                             pfadd.setString(3,author1.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno1.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                           
                             if(!title2.getText().equals("")  && !author2.getText().equals("") && !accno2.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title2.getText());
                             pfadd.setString(3,author2.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno2.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                              if(!title3.getText().equals("")  && !author3.getText().equals("") && !accno3.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title3.getText());
                             pfadd.setString(3,author3.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno3.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                               if(!title4.getText().equals("")  && !author4.getText().equals("") && !accno4.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title4.getText());
                             pfadd.setString(3,author4.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno4.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                         if(!title5.getText().equals("")  && !author5.getText().equals("") && !accno5.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title5.getText());
                             pfadd.setString(3,author5.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno5.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                          if(!title6.getText().equals("")  && !author6.getText().equals("") && !accno6.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title6.getText());
                             pfadd.setString(3,author6.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno6.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                           if(!title7.getText().equals("")  && !author7.getText().equals("") && !accno7.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title7.getText());
                             pfadd.setString(3,author7.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno7.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                            if(!title8.getText().equals("")  && !author8.getText().equals("") && !accno8.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title8.getText());
                             pfadd.setString(3,author8.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno8.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                             if(!title9.getText().equals("")  && !author9.getText().equals("") && !accno9.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title9.getText());
                             pfadd.setString(3,author9.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno9.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                              if(!title10.getText().equals("")  && !author10.getText().equals("") && !accno10.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title10.getText());
                             pfadd.setString(3,author10.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno10.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                               if(!title11.getText().equals("")  && !author11.getText().equals("") && !accno11.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title11.getText());
                             pfadd.setString(3,author11.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno11.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                                if(!title12.getText().equals("")  && !author12.getText().equals("") && !accno12.getText().equals(""))
                         {
                            PreparedStatement pfadd = con13.prepareStatement("insert into "+tabledata+" values(?,?,?,?,?)");

                             pfadd.setInt(1, Integer.parseInt(tacno.getText()));
                             pfadd.setString(2, title12.getText());
                             pfadd.setString(3,author12.getText());
                            pfadd.setDouble(4,Double.parseDouble(accno12.getText()));
                            d= new SimpleDateFormat("dd/MM/yyyy").parse(bdt.getText());
                           d3 = new SimpleDateFormat("dd-MMM-yyyy").format(d);
                            pfadd.setString(5,d3);
                             pfadd.executeUpdate();
                         }
                                
                      } 
                    if(!tid.getText().equals("")  && !tsrc.getText().equals("") && !lstat.getText().equals("")  && tnm1.getText().equals("")  && trn1.getText().equals("") && tcls2.getText().equals("") &&  tnm2.getText().equals("")  && trn2.getText().equals("") && tcls3.getText().equals(""))
                    {   
                        
                    JOptionPane.showMessageDialog(null, "Data Saved for 1 student", "Confirm", JOptionPane.INFORMATION_MESSAGE); 
                      clearBook();
                    }
                    else
                      if(!tid.getText().equals("")  && !tsrc.getText().equals("") && !lstat.getText().equals("")  && !tnm1.getText().equals("")  && !trn1.getText().equals("") && !tcls2.getText().equals("") &&  tnm2.getText().equals("")  && trn2.getText().equals("") && tcls3.getText().equals(""))
                    {   
                        
                    JOptionPane.showMessageDialog(null, "Data Saved for 2 student", "Confirm", JOptionPane.INFORMATION_MESSAGE); 
                      clearBook();
                    }
                    else
                      {
                         JOptionPane.showMessageDialog(null, "Data Saved for 3 student", "Confirm", JOptionPane.INFORMATION_MESSAGE); 
                           clearBook();
                      
                      }
                    
         }    
        
      
       

    void delBook() {

        try {
             String tablex=(String) tnm.getSelectedItem();
           if(tablex.equals("FY"))
            {
                tabledata="FyBscBBR";
                tabledata1="FyBscBB";
            
            }
             else  if(tablex.equals("SY"))
            {
                tabledata="SyBscBBR";
                 tabledata1="SyBscBB";
            
            }
             else  if(tablex.equals("TY"))
            {
                tabledata="TyBscBBR";
                 tabledata1="TyBscBB";
            }
           
            //ef(false);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
             int ele =  Integer.parseInt((String) csr.getSelectedItem());
            PreparedStatement pfadd = con.prepareStatement("delete  from "+tabledata1+" where id=?");
            pfadd.setInt(1, ele);

            pfadd.executeUpdate();
            PreparedStatement pfadd1 = con.prepareStatement("delete  from "+tabledata+" where id=?");
            pfadd1.setInt(1, ele);

            pfadd1.executeUpdate();
            con.commit();
            con.close();
           // JOptionPane.showMessageDialog(null, "1 record deleted", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            l1.setText("The Book Bank Of Id No"+ele+"Is Delted");
            csr.removeItem(String.valueOf(ele));
             csr1.removeItem(String.valueOf(ele));
           // clearBook();
              mod.setRowCount(0);
            mod.setColumnCount(0);
              mod1.setRowCount(0);
            mod1.setColumnCount(0);
                 mod2.setRowCount(0);
            mod2.setColumnCount(0);
              mod3.setRowCount(0);
            mod3.setColumnCount(0);

        } catch (Exception e2) {
            System.out.println(e2);//e2.printStackTrace();
        }

    }

    void resultset1() {
        try {
             String tablex=(String) tnm.getSelectedItem();
           if(tablex.equals("FY"))
            {
                tabledata="FyBscBBR";
                tabledata1="FyBscBB";
            
            }
             else  if(tablex.equals("SY"))
            {
                tabledata="SyBscBBR";
                 tabledata1="SyBscBB";
            
            }
             else  if(tablex.equals("TY"))
            {
                tabledata="TyBscBBR";
                 tabledata1="TyBscBB";
            }
           
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            java.sql.Statement stmt1 = con.createStatement();

            ResultSet rs1 = stmt1.executeQuery("select distinct id from "+tabledata1+"");
            while (rs1.next()) {
              int  no1 = rs1.getInt(1);
                csr.addItem(String.valueOf(no1));
                 csr1.addItem(String.valueOf(no1));
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
        lstat.setText("");
       tauthr.setText("");
        tacno.setText("");
         tnm1.setText("");
       
        tnm2.setText("");
        trn1.setText("");
       trn2.setText("");
       
        tcls2.setText("");
        tcls3.setText("");
       title1.setText("");
       title2.setText("");
       title3.setText("");
       title4.setText("");
       title5.setText("");
       title6.setText("");
       title7.setText("");
       title8.setText("");
       title9.setText("");
       title10.setText("");
        title11.setText("");
        title12.setText("");
        
        author1.setText("");
        author2.setText("");
        author3.setText("");
        author4.setText("");
        author5.setText("");
        author6.setText("");
        author7.setText("");
        author8.setText("");
        author9.setText("");
        author10.setText("");
        author11.setText("");
        author12.setText("");
        
        accno1.setText("");
        accno2.setText("");
        accno3.setText("");
        accno4.setText("");
        accno5.setText("");
        accno6.setText("");
        accno7.setText("");
        accno8.setText("");
        accno9.setText("");
        accno10.setText("");
        accno11.setText("");
        accno12.setText("");
        
        
        enText(true);
        tfa.requestFocus();
        
        
    }

    void enText(boolean b) {
        /*
         tnm1.setEnabled(b);
       
        tnm2.setEnabled(b);
        trn1.setEnabled(b);
       trn2.setEnabled(b);
       
        tcls2.setEnabled(b);
        tcls3.setEnabled(b);
     tid.setEnabled(b);
       
        tfa.setEnabled(b);
        tsrc.setEnabled(b);
        lstat.setEnabled(b);
       
        tauthr.setEnabled(b);
        tacno.setEnabled(b);
       title1.setEnabled(b);
       title2.setEnabled(b);
       title3.setEnabled(b);
       title4.setEnabled(b);
       title5.setEnabled(b);
       title6.setEnabled(b);
       title7.setEnabled(b);
       title8.setEnabled(b);
       title9.setEnabled(b);
       title10.setEnabled(b);
        title11.setEnabled(b);
        title12.setEnabled(b);
        
        author1.setEnabled(b);
        author2.setEnabled(b);
        author3.setEnabled(b);
        author4.setEnabled(b);
        author5.setEnabled(b);
        author6.setEnabled(b);
        author7.setEnabled(b);
        author8.setEnabled(b);
        author9.setEnabled(b);
        author10.setEnabled(b);
        author11.setEnabled(b);
        author12.setEnabled(b);
        
        accno1.setEnabled(b);
        accno2.setEnabled(b);
        accno3.setEnabled(b);
        accno4.setEnabled(b);
        accno5.setEnabled(b);
        accno6.setEnabled(b);
        accno7.setEnabled(b);
        accno8.setEnabled(b);
        accno9.setEnabled(b);
        accno10.setEnabled(b);
        accno11.setEnabled(b);
        accno12.setEnabled(b);
        
      */
       // tp.setEnabled(b);
    }

    void addComp(JComponent jc, String title, int x, int y, int w, int h) {
        jc = new JLabel(title);
        jc.setBounds(x, y, w, h);
           jc.setForeground(Color.WHITE);
        jc.setFont(fi);
        pf1.add(jc);
    }
void addComp4(JComponent jc, String title, int x, int y, int w, int h) {
        jc = new JLabel(title);
        jc.setBounds(x, y, w, h);
           jc.setForeground(Color.WHITE);
        jc.setFont(fi);
        pf4.add(jc);
    }
    void addComp1(JComponent jc1, int x, int y, int w, int h) {

        jc1.setBounds(x, y, w, h);

        jc1.setBorder(bf3);
        jc1.setFont(fi);
        pf1.add(jc1);
    }
 void addComp11(JComponent jc1, int x, int y, int w, int h) {

        jc1.setBounds(x, y, w, h);

        jc1.setBorder(bf3);
        jc1.setFont(fi);
        pf4.add(jc1);
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
            if (evt.getSource() == title1) {
                title1.setText(title1.getText().replaceAll(num1, ""));
            }
             if (evt.getSource() == title2) {
                title2.setText(title2.getText().replaceAll(num1, ""));
            }
            
              if (evt.getSource() == title3) {
                title3.setText(title3.getText().replaceAll(num1, ""));
            }
              
               if (evt.getSource() == title4) {
                title4.setText(title4.getText().replaceAll(num1, ""));
            }
               
                if (evt.getSource() == title5) {
                title5.setText(title5.getText().replaceAll(num1, ""));
            }
                 if (evt.getSource() == title6) {
                title6.setText(title6.getText().replaceAll(num1, ""));
            }
                 
                  if (evt.getSource() == title7) {
                title7.setText(title7.getText().replaceAll(num1, ""));
            }
                  
                   if (evt.getSource() == title8) {
                title8.setText(title8.getText().replaceAll(num1, ""));
            }
                   
                    if (evt.getSource() == title9) {
                title9.setText(title9.getText().replaceAll(num1, ""));
            }
                     if (evt.getSource() == title10) {
                title10.setText(title10.getText().replaceAll(num1, ""));
            }
            
                      if (evt.getSource() == title11) {
                title11.setText(title11.getText().replaceAll(num1, ""));
            }
                      
                       if (evt.getSource() == title12) {
                title12.setText(title12.getText().replaceAll(num1, ""));
            }
            
            
             if (evt.getSource() == author1) {
                author1.setText(author1.getText().replaceAll(num1, ""));
            }
            
               if (evt.getSource() == author2) {
                author2.setText(author2.getText().replaceAll(num1, ""));
            }
               
                 if (evt.getSource() == author3) {
                author3.setText(author3.getText().replaceAll(num1, ""));
            }
                 
                   if (evt.getSource() == author4) {
                author4.setText(author4.getText().replaceAll(num1, ""));
            }
                   
                     if (evt.getSource() == author5) {
                author5.setText(author5.getText().replaceAll(num1, ""));
            }
            
                       if (evt.getSource() == author6) {
                author6.setText(author6.getText().replaceAll(num1, ""));
            }
            
                         if (evt.getSource() == author7) {
                author7.setText(author7.getText().replaceAll(num1, ""));
                
                         }    
                  if (evt.getSource() == author8) {
                author8.setText(author8.getText().replaceAll(num1, ""));
                
            }
                    if (evt.getSource() == author9) {
                author9.setText(author9.getText().replaceAll(num1, ""));
            }
                      if (evt.getSource() == author10) {
                author10.setText(author10.getText().replaceAll(num1, ""));
            }
                        if (evt.getSource() == author11) {
                author11.setText(author11.getText().replaceAll(num1, ""));
            }
                          if (evt.getSource() == author12) {
                author12.setText(author12.getText().replaceAll(num1, ""));
            }
                          
                            if (evt.getSource() == accno1) {
                accno1.setText(accno1.getText().replaceAll(num3, ""));
            }
                            if (evt.getSource() == accno2) {
                accno2.setText(accno2.getText().replaceAll(num3, ""));
            }
                            
                           if (evt.getSource() == accno3) {
                accno3.setText(accno3.getText().replaceAll(num3, ""));
            }
                            if (evt.getSource() == accno4) {
                accno4.setText(accno4.getText().replaceAll(num3, ""));
            }
                              if (evt.getSource() == accno5) {
                accno5.setText(accno5.getText().replaceAll(num3, ""));
            }
                               if (evt.getSource() == accno6) {
                accno6.setText(accno6.getText().replaceAll(num3, ""));
            }
                                if (evt.getSource() == accno7) {
                accno7.setText(accno7.getText().replaceAll(num3, ""));
                                }
                                if (evt.getSource() == accno8) {
                accno8.setText(accno8.getText().replaceAll(num3, ""));
            }
                              if (evt.getSource() == accno9) {
                accno9.setText(accno9.getText().replaceAll(num3, ""));
            }
                           if (evt.getSource() == accno10) {
                accno10.setText(accno10.getText().replaceAll(num3, ""));
            }
                             if (evt.getSource() == accno11) {
                accno11.setText(accno11.getText().replaceAll(num3, ""));
            }
                          if (evt.getSource() == accno12) {
                accno12.setText(accno12.getText().replaceAll(num3, ""));
            }
            
            
            
            
            
            
            
            
            if (evt.getSource() == tsrc) {
                tsrc.setText(tsrc.getText().replaceAll(num3, ""));
            }
               if (evt.getSource() == trn1) {
                trn1.setText(trn1.getText().replaceAll(num3, ""));
            }
                  if (evt.getSource() == trn2) {
                trn2.setText(trn2.getText().replaceAll(num3, ""));
            }
            if (evt.getSource() == tfa) {
                tfa.setText(tfa.getText().replaceAll(num2, ""));
            }
            if (evt.getSource() == tnm1) {
                tnm1.setText(tnm1.getText().replaceAll(num1, ""));
            }
             if (evt.getSource() == tnm2) {
                tnm2.setText(tnm2.getText().replaceAll(num1, ""));
            }
              if (evt.getSource() == tid) {
                tid.setText(tid.getText().replaceAll(num1, ""));
            }
           
           
            if (evt.getSource() == lstat) {
                lstat.setText(lstat.getText().replaceAll(num3, ""));
            }
             if (evt.getSource() == tcls2) {
                tcls2.setText(tcls2.getText().replaceAll(num3, ""));
            }
              if (evt.getSource() == tcls3) {
                tcls3.setText(tcls3.getText().replaceAll(num3, ""));
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
 /*   public static void main(String args[])
    
  
    {
        "+tabledata1+"Form bb=new "+tabledata1+"Form("Book Bank Form ");
}*/

    
}
