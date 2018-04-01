/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Aditya
 */
public class AllDetailsView extends JInternalFrame  implements TreeSelectionListener,ActionListener,Printable
{
   JButton btn1,btn2,btn3;
      ResultSetMetaData rsmd;
	  JScrollPane rsp;
          JLabel l1;
    	JTable rpt;
	Object Data[] = new Object[1000];
    	String qu;
    	DefaultTableModel mod;	
        
   //JLabel l1;
   JPanel p1,p2,p3;
	Container c;
        JComboBox bx;
        String h[]={"FyBscSemI","hk"};
          JTree t;
  Font fai3=new Font("Lucida Sans",Font.BOLD,18);
   Font fai2=new Font("Trebuchet MS",Font.PLAIN,15);
   Font fai1=new Font("Corbel",Font.BOLD+Font.ITALIC,30);
	DefaultMutableTreeNode r,sci,com,arts,bsc,cs,it,bcom,bbi,eng,bca,mca,mscit,ba,msccs,msc,mscbio,mcom,ma,mba;
        DefaultMutableTreeNode fybsc,sybsc,tybsc,bscbbs,fyit,syit,tyit,itbbs,fycs,sycs,tycs,csbbs;
          DefaultMutableTreeNode fybio,sybio,tybio,biobbs,fybcom,sybcom,tybcom,bcombbs,fybaf,sybaf,tybaf,bafbbs;
           DefaultMutableTreeNode fybms,sybms,tybms,bmsbbs,fyba,syba,tyba,babbs,fybca,sybca,tybca,bcabbs,fymlt,symlt,tymlt,mltbbs;
         DefaultMutableTreeNode fybba,sybba,tybba,bbabbs,fymca,symca,tymca,mcabbs,part1it,part2it,mscitbbs;
          DefaultMutableTreeNode part1cs,part2cs,part1pmsc,part2pmsc,part1bio,part2bio,part1ma,part2ma,part1mcom,part2mcom;
          DefaultMutableTreeNode bbsmscs,bbspmsc,bbsma,bbsbio,bbsmcom,part1mba,part2mba,bbsmba;
          DefaultMutableTreeNode bscsem1,bscsem2,bscsem3,bscsem4,bscsem5,bscsem6, bsccssem1,bsccssem2,bsccssem3,bsccssem4,bsccssem5,bsccssem6;
          DefaultMutableTreeNode bscitsem1,bscitsem2,bscitsem3,bscitsem4,bscitsem5,bscitsem6, bscbiosem1,bscbiosem2,bscbiosem3,bscbiosem4,bscbiosem5,bscbiosem6;
	 DefaultMutableTreeNode bcomsem1,bcomsem2,bcomsem3,bcomsem4,bcomsem5,bcomsem6, bafsem1,bafsem2,bafsem3,bafsem4,bafsem5,bafsem6;
          DefaultMutableTreeNode bmssem1,bmssem2,bmssem3,bmssem4,bmssem5,bmssem6, basem1,basem2,basem3,basem4,basem5,basem6;
	  DefaultMutableTreeNode bcasem1,bcasem2,bcasem3,bcasem4,bcasem5,bcasem6,
                  mltsem1,mltsem2,mltsem3,mltsem4,mltsem5,mltsem6,
                   bbasem1,bbasem2,bbasem3,bbasem4,bbasem5,bbasem6;
            DefaultMutableTreeNode mscsem1,mscsem2,mscsem3,mscsem4,msccssem1,msccssem2,msccssem3,msccssem4,
                    mscitsem1,mscitsem2,mscitsem3,mscitsem4,mscbiosem1,mscbiosem2,mscbiosem3,mscbiosem4;
              DefaultMutableTreeNode mcomsem1,mcomsem2,mcomsem3,mcomsem4,masem1,masem2,masem3,masem4,
                    mbasem1,mbasem2,mbasem3,mbasem4,mcasem1,mcasem2,mcasem3,mcasem4,mcasem5,mcasem6;
                 
	
          JScrollPane p;
      
	JLabel lnm1;
          Border b1=BorderFactory.createEtchedBorder(1,Color.WHITE,Color.PINK);
	
	AllDetailsView(String s){
            super(s);
	c=getContentPane();
          c.setLayout(null);
           
		
		lnm1=new JLabel("Details");
          l1=new JLabel(new ImageIcon("lib5.jpg"));
          lnm1.setFont(fai1);
          lnm1.setForeground(new Color(220,20,60));
      	 rpt = new JTable();
         
    		    rsp = new JScrollPane(rpt);
       		 rsp.setViewportView(rpt);

       		 mod = new DefaultTableModel();
        		rpt.setModel(mod);
		   rsp.setBorder(b1);
		   rsp.setBounds(0, 60, 1090, 628);
		  rpt.setFont(fai2);
       // rpt.setForeground(Color.red);
        p1=new JPanel();
        p2=new JPanel();
         p3=new JPanel();
        p1.setLayout(null);
       p2.setLayout(null);
       p3.setLayout(null);
    
	 p1.setBounds(0, 100, 250, 668);
        p1.setBorder(b1);
        p2.setBounds(250, 101, 1090, 668);
        p2.setBorder(b1);
 p3.setBounds(0, 0, 1340, 100);
        p3.setBorder(b1); 
        btn1=new JButton("Cancel",new ImageIcon("exit4.jpg"));
         btn3=new JButton("Delete",new ImageIcon("delete.jpg"));
		btn2=new JButton("Print",new ImageIcon("print4.jpg"));
                bx=new JComboBox(h);
       r=new DefaultMutableTreeNode("Course");
	sci=new DefaultMutableTreeNode("BSc");
	arts=new DefaultMutableTreeNode("IT");
	com=new DefaultMutableTreeNode("CS");
	bsc=new DefaultMutableTreeNode("BioTech");
	cs=new DefaultMutableTreeNode("BCom");
	it=new DefaultMutableTreeNode("BAF");
	bcom=new DefaultMutableTreeNode("BMS");
	bbi=new DefaultMutableTreeNode("MLT");
	eng=new DefaultMutableTreeNode("BBA");
        mscit=new DefaultMutableTreeNode("MSc-IT"); 
	bca=new DefaultMutableTreeNode("BCA");
	mca=new DefaultMutableTreeNode("MCA");
	ba=new DefaultMutableTreeNode("BA");
         msccs=new DefaultMutableTreeNode("MSc-Cs"); 
	msc=new DefaultMutableTreeNode("MSc");
	mscbio=new DefaultMutableTreeNode("MSc-BioTech");
	ma=new DefaultMutableTreeNode("MA");
        
         mcom=new DefaultMutableTreeNode("MCom"); 
	mba=new DefaultMutableTreeNode("MBA");
	
        fyit=new DefaultMutableTreeNode("Fy-IT");
	syit=new DefaultMutableTreeNode("Sy-IT");
        tyit=new DefaultMutableTreeNode("Ty-IT");
        bscitsem1=new DefaultMutableTreeNode("Fy-IT-SemI");
	bscitsem2=new DefaultMutableTreeNode("Fy-IT-SemII");
           bscitsem3=new DefaultMutableTreeNode("Sy-IT-SemIII");
	bscitsem4=new DefaultMutableTreeNode("Sy-IT-SemIV");
           bscitsem5=new DefaultMutableTreeNode("Ty-IT-SemV");
	bscitsem6=new DefaultMutableTreeNode("Ty-IT-SemVI");
        itbbs=new DefaultMutableTreeNode("BBS-IT");
        
         fycs=new DefaultMutableTreeNode("Fy-CS");
	sycs=new DefaultMutableTreeNode("Sy-CS");
        tycs=new DefaultMutableTreeNode("Ty-CS");
        csbbs=new DefaultMutableTreeNode("BBS-CS");
         bsccssem1=new DefaultMutableTreeNode("Fy-CS-SemI");
	bsccssem2=new DefaultMutableTreeNode("Fy-CS-SemII");
           bsccssem3=new DefaultMutableTreeNode("Sy-CS-SemIII");
	bsccssem4=new DefaultMutableTreeNode("Sy-CS-SemIV");
           bsccssem5=new DefaultMutableTreeNode("Ty-Cs-SemV");
	bsccssem6=new DefaultMutableTreeNode("Ty-Cs-SemVI");
         fybsc=new DefaultMutableTreeNode("Fy-BSc");
	sybsc=new DefaultMutableTreeNode("Sy-Bsc");
      
        tybsc=new DefaultMutableTreeNode("Ty-BSc");
          bscsem1=new DefaultMutableTreeNode("Fy-BSc-SemI");
	bscsem2=new DefaultMutableTreeNode("Fy-BSc-SemII");
           bscsem3=new DefaultMutableTreeNode("Sy-BSc-SemIII");
	bscsem4=new DefaultMutableTreeNode("Sy-BSc-SemIV");
           bscsem5=new DefaultMutableTreeNode("Ty-BSc-SemV");
	bscsem6=new DefaultMutableTreeNode("Ty-BSc-SemVI");
        bscbbs=new DefaultMutableTreeNode("BBS-BSc");
        //
          fybio=new DefaultMutableTreeNode("Fy-BioTech");
	sybio=new DefaultMutableTreeNode("Sy-BioTech");
        tybio=new DefaultMutableTreeNode("Ty-BioTech");
         bscbiosem1=new DefaultMutableTreeNode("Fy-BioTech-SemI");
	bscbiosem2=new DefaultMutableTreeNode("Fy-BioTech-SemII");
           bscbiosem3=new DefaultMutableTreeNode("Sy-BioTech-SemIII");
	bscbiosem4=new DefaultMutableTreeNode("Sy-BioTech-SemIV");
           bscbiosem5=new DefaultMutableTreeNode("Ty-BioTech-SemV");
	bscbiosem6=new DefaultMutableTreeNode("Ty-BioTech-SemVI");
        biobbs=new DefaultMutableTreeNode("BBS-BioTech");
         fybcom=new DefaultMutableTreeNode("Fy-BCom");
	sybcom=new DefaultMutableTreeNode("Sy-BCom");
        tybcom=new DefaultMutableTreeNode("Ty-BCom");
        bcomsem1=new DefaultMutableTreeNode("Fy-BCom-SemI");
	bcomsem2=new DefaultMutableTreeNode("Fy-BCom-SemII");
           bcomsem3=new DefaultMutableTreeNode("Sy-BCom-SemIII");
	bcomsem4=new DefaultMutableTreeNode("Sy-BCom-SemIV");
           bcomsem5=new DefaultMutableTreeNode("Ty-BCom-SemV");
	bcomsem6=new DefaultMutableTreeNode("Ty-BCom-SemVI");
        bcombbs=new DefaultMutableTreeNode("BBS-BCom");
         fybaf=new DefaultMutableTreeNode("Fy-BAF");
	sybaf=new DefaultMutableTreeNode("Sy-BAF");
        tybaf=new DefaultMutableTreeNode("Ty-BAF");
        bafsem1=new DefaultMutableTreeNode("Fy-BAF-SemI");
	bafsem2=new DefaultMutableTreeNode("Fy-BAF-SemII");
           bafsem3=new DefaultMutableTreeNode("Sy-BAF-SemIII");
	bafsem4=new DefaultMutableTreeNode("Sy-BAF-SemIV");
           bafsem5=new DefaultMutableTreeNode("Ty-BAF-SemV");
	bafsem6=new DefaultMutableTreeNode("Ty-BAF-SemVI");
        bafbbs=new DefaultMutableTreeNode("BBS-BAF");
        
        fybms=new DefaultMutableTreeNode("Fy-BMS");
	sybms=new DefaultMutableTreeNode("Sy-BMS");
        tybms=new DefaultMutableTreeNode("Ty-BMs");
        bmssem1=new DefaultMutableTreeNode("Fy-BMS-SemI");
	bmssem2=new DefaultMutableTreeNode("Fy-BMS-SemII");
           bmssem3=new DefaultMutableTreeNode("Sy-BMS-SemIII");
	bmssem4=new DefaultMutableTreeNode("Sy-BMS-SemIV");
           bmssem5=new DefaultMutableTreeNode("Ty-BMS-SemV");
	bmssem6=new DefaultMutableTreeNode("Ty-BMS-SemVI");
        bmsbbs=new DefaultMutableTreeNode("BBS-BMS");
         fybca=new DefaultMutableTreeNode("Fy-BCA");
	sybca=new DefaultMutableTreeNode("Sy-BCA");
        tybca=new DefaultMutableTreeNode("Ty-BCA");
          bcasem1=new DefaultMutableTreeNode("Fy-BCA-SemI");
	bcasem2=new DefaultMutableTreeNode("Fy-BCA-SemII");
           bcasem3=new DefaultMutableTreeNode("Sy-BCA-SemIII");
	bcasem4=new DefaultMutableTreeNode("Sy-BCA-SemIV");
           bcasem5=new DefaultMutableTreeNode("Ty-BCA-SemV");
	bcasem6=new DefaultMutableTreeNode("Ty-BCA-SemVI");
        
        bcabbs=new DefaultMutableTreeNode("BBS-BCA");
         fyba=new DefaultMutableTreeNode("Fy-BA");
	syba=new DefaultMutableTreeNode("Sy-BA");
        tyba=new DefaultMutableTreeNode("Ty-BA");
        basem1=new DefaultMutableTreeNode("Fy-BA-SemI");
	basem2=new DefaultMutableTreeNode("Fy-BA-SemII");
           basem3=new DefaultMutableTreeNode("Sy-BA-SemIII");
	basem4=new DefaultMutableTreeNode("Sy-BA-SemIV");
           basem5=new DefaultMutableTreeNode("Ty-BA-SemV");
	basem6=new DefaultMutableTreeNode("Ty-BA-SemVI");
        babbs=new DefaultMutableTreeNode("BBS-BA");
          fymlt=new DefaultMutableTreeNode("Fy-MLT");
	symlt=new DefaultMutableTreeNode("Sy-MLT");
        tymlt=new DefaultMutableTreeNode("Ty-MLT");
        
          mltsem1=new DefaultMutableTreeNode("Fy-MLT-SemI");
	mltsem2=new DefaultMutableTreeNode("Fy-MLT-SemII");
           mltsem3=new DefaultMutableTreeNode("Sy-MLT-SemIII");
	mltsem4=new DefaultMutableTreeNode("Sy-MLT-SemIV");
           mltsem5=new DefaultMutableTreeNode("Ty-MLT-SemV");
	mltsem6=new DefaultMutableTreeNode("Ty-MLT-SemVI");
        mltbbs=new DefaultMutableTreeNode("BBS-MLT");
         fybba=new DefaultMutableTreeNode("Fy-BBA");
	sybba=new DefaultMutableTreeNode("Sy-BBA");
        tybba=new DefaultMutableTreeNode("Ty-BBA");
          bbasem1=new DefaultMutableTreeNode("Fy-BBA-SemI");
	bbasem2=new DefaultMutableTreeNode("Fy-BBA-SemII");
           bbasem3=new DefaultMutableTreeNode("Sy-BBA-SemIII");
	bbasem4=new DefaultMutableTreeNode("Sy-BBA-SemIV");
           bbasem5=new DefaultMutableTreeNode("Ty-BBA-SemV");
	bbasem6=new DefaultMutableTreeNode("Ty-BBA-SemVI");
        bbabbs=new DefaultMutableTreeNode("BBS-BBA");
         fymca=new DefaultMutableTreeNode("Fy-MCA");
	symca=new DefaultMutableTreeNode("Sy-MCA");
        tymca=new DefaultMutableTreeNode("Ty-MCA");
           mcasem1=new DefaultMutableTreeNode("MCA-Part1-SemI");
	mcasem2=new DefaultMutableTreeNode("MCA-Part1-SemII");
           mcasem3=new DefaultMutableTreeNode("MCA-Part2-SemIII");
	mcasem4=new DefaultMutableTreeNode("MCA-Part2-SemIV");
         mcasem5=new DefaultMutableTreeNode("MCA-Part3-SemV");
	mcasem6=new DefaultMutableTreeNode("MCA-Part3-SemVI");
        mcabbs=new DefaultMutableTreeNode("BBS-MCA");
         part1it=new DefaultMutableTreeNode("MScIT-Part1");
	part2it=new DefaultMutableTreeNode("MscIT-Part2");
       
        mscitbbs=new DefaultMutableTreeNode("MScIT-BBS");
         mscitsem1=new DefaultMutableTreeNode("MScIT-Part1-SemI");
	mscitsem2=new DefaultMutableTreeNode("MScIT-Part1-SemII");
           mscitsem3=new DefaultMutableTreeNode("MScIT-Part2-SemIII");
	mscitsem4=new DefaultMutableTreeNode("MScIT-Part2-SemIV");
        
      
          part1cs=new DefaultMutableTreeNode("MScCS-Part1");
	part2cs=new DefaultMutableTreeNode("MscCS-Part2");
       
        bbsmscs=new DefaultMutableTreeNode("MScCS-BBS");
          msccssem1=new DefaultMutableTreeNode("MScCS-Part1-SemI");
	msccssem2=new DefaultMutableTreeNode("MScCS-Part1-SemII");
           msccssem3=new DefaultMutableTreeNode("MScCS-Part2-SemIII");
	msccssem4=new DefaultMutableTreeNode("MScCS-Part2-SemIV");
           part1bio=new DefaultMutableTreeNode("MScBioTech-Part1");
	part2bio=new DefaultMutableTreeNode("MscBioTech-Part2");
       
        bbsbio=new DefaultMutableTreeNode("MScBioTech-BBS");
          mscbiosem1=new DefaultMutableTreeNode("MScBioTech-Part1-SemI");
	mscbiosem2=new DefaultMutableTreeNode("MScBioTech-Part1-SemII");
           mscbiosem3=new DefaultMutableTreeNode("MScBioTech-Part2-SemIII");
	mscbiosem4=new DefaultMutableTreeNode("MScBioTech-Part2-SemIV");
          part1pmsc=new DefaultMutableTreeNode("MSc-Part1");
	part2pmsc=new DefaultMutableTreeNode("Msc-Part2");
        mscsem1=new DefaultMutableTreeNode("MSc-Part1-SemI");
	mscsem2=new DefaultMutableTreeNode("MSc-Part1-SemII");
           mscsem3=new DefaultMutableTreeNode("MSc-Part2-SemIII");
	mscsem4=new DefaultMutableTreeNode("MSc-Part2-SemIV");
        bbspmsc=new DefaultMutableTreeNode("MSc-BBS");
        
          part1mcom=new DefaultMutableTreeNode("MCom-Part1");
	part2mcom=new DefaultMutableTreeNode("MCom-Part2");
       mcomsem1=new DefaultMutableTreeNode("MA-Part1-SemI");
	mcomsem2=new DefaultMutableTreeNode("MA-Part1-SemII");
           mcomsem3=new DefaultMutableTreeNode("MA-Part2-SemIII");
	mcomsem4=new DefaultMutableTreeNode("MA-Part2-SemIV");
        bbsmcom=new DefaultMutableTreeNode("MCom-BBS");
        
          part1ma=new DefaultMutableTreeNode("MA-Part1");
	part2ma=new DefaultMutableTreeNode("MA-Part2");
          masem1=new DefaultMutableTreeNode("MCom-Part1-SemI");
	masem2=new DefaultMutableTreeNode("MCom-Part1-SemII");
           masem3=new DefaultMutableTreeNode("MCom-Part2-SemIII");
	masem4=new DefaultMutableTreeNode("MCom-Part2-SemIV");
        bbsma=new DefaultMutableTreeNode("MA-BBS");
        
          part1mba=new DefaultMutableTreeNode("MBA-Part1");
	part2mba=new DefaultMutableTreeNode("MBA-Part2");
          mbasem1=new DefaultMutableTreeNode("MBA-Part1-SemI");
	mbasem2=new DefaultMutableTreeNode("MBA-Part1-SemII");
           mbasem3=new DefaultMutableTreeNode("MBA-Part2-SemIII");
	mbasem4=new DefaultMutableTreeNode("MBA-Part2-SemIV");
        bbsmba=new DefaultMutableTreeNode("MBA-BBS");
        addCompn3(btn1,500,15,100,30);
        addCompn3(btn3,750,15,100,30);
         addCompn3(bx,870,15,200,30);
		addCompn3(btn2,630,15,100,30);
          part1mcom.add(mcomsem1);
            part1mcom.add(mcomsem2);
             part2mcom.add(mcomsem3);
            part2mcom.add(mcomsem4);
        
          part1ma.add(masem1);
            part1ma.add(masem2);
             part2ma.add(masem3);
            part2ma.add(masem4);
               part1mba.add(mbasem1);
            part1mba.add(mbasem2);
             part2mba.add(mbasem3);
            part2mba.add(mbasem4);
            
              fymca.add(mcasem1);
            fymca.add(mcasem2);
             symca.add(mcasem3);
            symca.add(mcasem4);
              tymca.add(mcasem5);
            tymca.add(mcasem6);
           
            
         part1pmsc.add(mscsem1);
            part1pmsc.add(mscsem2);
             part2pmsc.add(mscsem3);
            part2pmsc.add(mscsem4);
          part1cs.add(msccssem1);
            part1cs.add(msccssem2);
             part2cs.add(msccssem3);
            part2cs.add(msccssem4);
              part1it.add(mscitsem1);
            part1it.add(mscitsem2);
             part2it.add(mscitsem3);
            part2it.add(mscitsem4);
                    
                      part1bio.add(mscbiosem1);
            part1bio.add(mscbiosem2);
             part2bio.add(mscbiosem3);
            part2bio.add(mscbiosem4);
            
        fybca.add(bcasem1);
         fybca.add(bcasem2);
           sybca.add(bcasem3);
         sybca.add(bcasem4);
           tybca.add(bcasem5);
         tybca.add(bcasem6);
        fymlt.add(mltsem1);
         fymlt.add(mltsem2);
           symlt.add(mltsem3);
         symlt.add(mltsem4);
           tymlt.add(mltsem5);
         tymlt.add(mltsem6);
        fyba.add(bbasem1);
         fybba.add(bbasem2);
           sybba.add(bbasem3);
         sybba.add(bbasem4);
           tybba.add(bbasem5);
         tyba.add(basem6);
          fyba.add(basem1);
         fyba.add(basem2);
           syba.add(basem3);
         syba.add(basem4);
           tyba.add(basem5);
         tyba.add(basem6);
          fybms.add(bmssem1);
         fybms.add(bmssem2);
           sybms.add(bmssem3);
         sybms.add(bmssem4);
           tybms.add(bmssem5);
         tybms.add(bmssem6);
          fybaf.add(bafsem1);
         fybaf.add(bafsem2);
           sybaf.add(bafsem3);
         sybaf.add(bafsem4);
           tybaf.add(bafsem5);
         tybaf.add(bafsem6);
          fybcom.add(bcomsem1);
         fybcom.add(bcomsem2);
           sybcom.add(bcomsem3);
         sybcom.add(bcomsem4);
           tybcom.add(bcomsem5);
         tybcom.add(bcomsem6);
          fybms.add(bsccssem1);
         fycs.add(bsccssem2);
           sycs.add(bsccssem3);
         sycs.add(bsccssem4);
           tycs.add(bsccssem5);
         tycs.add(bsccssem6);
          fybio.add(bscbiosem1);
         fybio.add(bscbiosem2);
           sybio.add(bscbiosem3);
         sybio.add(bscbiosem4);
           tybio.add(bscbiosem5);
         tybio.add(bscbiosem6);
         fyit.add(bscitsem1);
         fyit.add(bscitsem2);
           syit.add(bscitsem3);
         syit.add(bscitsem4);
           tyit.add(bscitsem5);
         tyit.add(bscitsem6);
         fybsc.add(bscsem1);
         fybsc.add(bscsem2);
           sybsc.add(bscsem3);
         sybsc.add(bscsem4);
           tybsc.add(bscsem5);
         tybsc.add(bscsem6);
           mba.add(part1mba);
         mba.add(part2mba);
          mba.add(bbsmba);
        msccs.add(part1cs);
         msccs.add(part2cs);
          msccs.add(bbsmscs);
          
         msc.add(part1pmsc);
         msc.add(part2pmsc);
          msc.add(bbspmsc);   
        
          mscbio.add(part1bio);
         mscbio.add(part2bio);
          mscbio.add(bbsbio);
          
            ma.add(part1ma);
         ma.add(part2ma);
          ma.add(bbsma);
          
            mcom.add(part1mcom);
         mcom.add(part2mcom);
          mcom.add(bbsmcom);
          
            eng.add(fybba);
            eng.add(sybba);
            eng.add(tybba);
            eng.add(bbabbs);
              bbi.add(fymlt);
            bbi.add(symlt);
            bbi.add(tymlt);
            bbi.add(mltbbs);
            mscit.add(part1it);
            mscit.add(part2it);
            mscit.add(mscitbbs);
           
            mca.add(fymca);
            mca.add(symca);
            mca.add(tymca);
            mca.add(mcabbs);
        
            bca.add(fybca);
        bca.add(sybca);
        bca.add(tybca);
        bca.add(bcabbs);
        ba.add(fyba);
        ba.add(syba);
        ba.add(tyba);
        ba.add(babbs);
        bcom.add(fybms);
        bcom.add(sybms);
        bcom.add(tybms);
        bcom.add(bmsbbs);
        
	
        bsc.add(fybio);
        bsc.add(sybio);
        bsc.add(tybio);
        bsc.add(biobbs);
        cs.add(fybcom);
        cs.add(sybcom);
        cs.add(tybcom);
        cs.add(bcombbs);
        it.add(fybaf);
        it.add(sybaf);
        it.add(tybaf);
        it.add(bafbbs);
        
	arts.add(fyit);
        arts.add(syit);
        arts.add(tyit);
        arts.add(itbbs);
        sci.add(fybsc);
        sci.add(sybsc);
        sci.add(tybsc);
        sci.add(bscbbs);
        com.add(fycs);
        com.add(sycs);
        com.add(tycs);
        com.add(csbbs);
        r.add(sci);
	r.add(arts);
	r.add(com);
	r.add(bsc);
	r.add(cs);
	r.add(it);
	r.add(bcom);
        r.add(ba);
        r.add(bca);
	r.add(bbi);
	r.add(eng);
        r.add(msc);
        r.add(mscit);
        r.add(msccs);
        r.add(mscbio);
	r.add(mcom);
        r.add(ma);
        r.add(mba);
	r.add(mca);
	
         JSplitPane j1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
          l1.setBounds(0, 0, 1340, 100);      
        t=new JTree(r);
       // t.setOpaque(false);
         //t.setRowHeight(15);
        // t.setColumnHeight(20);
	p=new JScrollPane(t);
        
        p.setBounds(2,2,297,666);
       // p.setViewPortView(t);
        p2.add(lnm1);
        p3.add(l1);
       p1.add(p);
       p2.add(rsp);
       t.setFont(fai2);
       
        c.add(p1);
        c.add(p2);
        c.add(p3);
        
        c.add(j1);
       
              
		lnm1.setBounds(200,5,500,55);
                 lnm1.setBackground(Color.YELLOW);
                // lnm1.setBorder(b1);
        t.setRootVisible(true);
         p1.setOpaque(false);
       //  lnm1.setOpaque(false);
        p2.setOpaque(false); p3.setOpaque(false);
        
           rsp.getViewport().setBackground(new Color(255,255,255));
		//rpt.setBackground(	new Color(0,255,255));
                rpt.setRowHeight(30);
		rpt.setRowMargin(10);
       t.addTreeSelectionListener(this);
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
         setSize(1356, 768);
        setLocation(0, 0);
        setVisible(true);
     
        }
         void del(String q) {

        try {

            //ef(false);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            PreparedStatement pfadd = con.prepareStatement(q);
           

            pfadd.executeUpdate();
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null, "Table deleted", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            

        } catch (Exception e2) {
            System.out.println(e2);//e2.printStackTrace();
        }

    } 
        public void actionPerformed(ActionEvent e2)
  	{
		
            if(e2.getSource()==btn3)
	      {
                    int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(dialogResult == JOptionPane.YES_OPTION){
                        String h=(String) bx.getSelectedItem();
                        if(h.equals("hk"))
                        {
                            del("delete  from emp1");
                        }
                    }
                    else
                    {
                        
                    }
			
            }
		if(e2.getSource()==btn1)
	         	{
			this.dispose();
			
		}
                 if (e2.getSource() == btn2) {
                //bpt.setVisible(false);
                setSize(1356, 768);
                PrinterJob printJob = PrinterJob.getPrinterJob();
                printJob.setPrintable(this);
                if (printJob.printDialog()) {
                    try {
                        printJob.print();
                    } catch (PrinterException ex) {
                        Logger.getLogger(FyBscSem1Details.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    printJob.cancel();
                }
                printJob.cancel();
                btn2.setVisible(true);
                setSize(1356, 768);
            }
    
		
		
		
	}
	  public int print(Graphics g, PageFormat pf, int pi) throws PrinterException {
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(pf.getImageableX() + 5, pf.getImageableY() + 5);
        Font f = new Font("Monospaced", Font.PLAIN, 12);
        g2.setFont(f);
        paint(g2);
        return Printable.PAGE_EXISTS;
    }
        void addCompn3(JComponent jc,int x,int y,int w,int h)
	{
		
		jc.setFont(fai3);
		jc.setBorder(b1);
		jc.setBounds(x,y,w,h);
		p2.add(jc);
		
	}
	 public void valueChanged(TreeSelectionEvent e)
    {
            
       
        if(t.getLastSelectedPathComponent().toString()=="Fy-BSc-SemI")
        {
            lnm1.setText("FyBsc SemI Records");
            show("select * from FYSemI");
		
        }
    }
         void show(String que) {
        try {
	
            mod.setRowCount(0);
            mod.setColumnCount(0);

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aditya", "system", "server");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(que);
            rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                mod.addColumn(rsmd.getColumnLabel(i));
               
            }

            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    Data[i - 1] = rs.getString(i);
                 
                   
                } mod.addRow(Data);
              

            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

    
}
