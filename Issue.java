package issue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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

import datechooser.beans.DateChooserCombo;

public class Issue extends JFrame implements ActionListener, ItemListener, Printable, KeyListener, FocusListener {

    int count, count1;
    ResultSet rs;
    FileInputStream fis;
    File file;
    String num4 = "[^0-9]";
    String num3 = "[^A-Za-z]";
    String num1 = "[^A-Z1-9]";
    String num2 = "[^F1-9]";
    String num = "[^1-9a-z]";
    String nj = "[[0-9]\\.[0-9]{2}{am,pm}]";
    DateChooserCombo bdt,bdt1;
    Date d;

    String no;
    JLayeredPane lop1;
    int r, tp1 = 0;
    JFileChooser fc;
    JPanel pf1, pf2, pf3, pf4, pf5, pf6;
    JTextField tid, tnm, tsrc, ttm, tchgs, tseats, tdt, atm, tfa, tseats1, tchgs1,tauthr,tacno;
    JLabel fid, fnm, fsrc, ftm, fcls, fchgs, fseats, fdt, ftit, fsr, fatm, ftp, fa, lop2, Image, limg1, limg2,lstatus,lstat;
    JComboBox csr, tp;
    JLabel tcls, tcls1;
    JButton baddf, bupdt, bdel, bcnc, brs, bpt, bcfl;
    //String[] x1 = {"Domestic", "International"};
    //String[] x2 = {"Bussiness", "Economy"};
    Container cf;
    Color cfi = Color.red;
    Font fi = new Font("cooper", Font.BOLD, 16);
    Font fi1 = new Font("Latin", Font.BOLD, 20);
    Font fi3 = new Font("Latin", Font.BOLD, 22);
    Font fi2 = new Font("Latin", Font.BOLD, 16);
    Border bf = BorderFactory.createLineBorder(Color.red);
    Border bf1 = BorderFactory.createEtchedBorder(1, Color.red, new Color(255, 255, 0));
    Border bf2 = BorderFactory.createTitledBorder(bf1, "Student Information", TitledBorder.CENTER, TitledBorder.TOP, fi2, new Color(204, 0, 51));
    Border bf6 = BorderFactory.createTitledBorder(bf1, "Update", TitledBorder.CENTER, TitledBorder.TOP, fi2, new Color(204, 0, 51));
    //Border bf4 = BorderFactory.createTitledBorder(bf1, "Photograph", TitledBorder.CENTER, TitledBorder.TOP, fi2, new Color(204, 0, 51));
    //Border bf5 = BorderFactory.createTitledBorder(bf1, "Search", TitledBorder.CENTER, TitledBorder.TOP, fi2, new Color(204, 0, 51));
    Border bf3 = BorderFactory.createSoftBevelBorder(1, new Color(255, 0, 204), new Color(255, 255, 51), new Color(0, 0, 255), new Color(51, 255, 51));

    Issue() {
        super("Issue Entry");
        cf = getContentPane();
        fc = new JFileChooser("/project/sam/nw/");
        //fc.addChoosableFileFilter(new FilterImage());
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
        //tp = new JComboBox(x1);
        //tcls = new JLabel("Economy");
        //tcls1 = new JLabel("Bussiness");
        tid = new JTextField(10);
        bdt=new DateChooserCombo();
        bdt1=new DateChooserCombo();
        tnm = new JTextField(10);
        atm = new JTextField(10);
        tsrc = new JTextField(10);
        ttm = new JTextField(10);
        tfa = new JTextField(10);
        tchgs = new JTextField(10);
        tdt = new JTextField(10);
        tseats = new JTextField(10);
        tchgs1 = new JTextField(10);
        tseats1 = new JTextField(10);
        tauthr = new JTextField(10);
        tacno = new JTextField(10);
        ftit = new JLabel("Issue Form");
        fsr = new JLabel("Student Id");
        bdel = new JButton("Search", new ImageIcon("delete.jpg"));
        baddf = new JButton("Update ", new ImageIcon("add.jpg"));
        bupdt = new JButton("Return", new ImageIcon("update.jpg"));
        bcnc = new JButton("Exit", new ImageIcon("cancel.jpg"));
        //brs = new JButton("Browse", new ImageIcon("browse.jpg"));
       // bpt = new JButton("Print", new ImageIcon("print4.jpg"));
        bcfl = new JButton("Clear", new ImageIcon("clear.jpg"));
        csr = new JComboBox();
        lop1 = new JLayeredPane();
        lop2 = new JLabel(new ImageIcon("images/issue.jpg"));
        pf1.setBorder(bf2);
        pf1.setBounds(100, 70, 600, 610);
        pf2.setBorder(bf1);
        pf2.setBounds(100, 15, 800, 50);
        //pf4.setBorder(bf4);
        pf4.setBounds(15, 10, 160, 170);
        pf3.setBorder(bf1);
        pf3.setBounds(710, 78, 190, 330);
        //pf5.setBorder(bf5);
        pf5.setBounds(10, 90, 170, 230);
        pf6.setBorder(bf6);
        pf6.setBounds(10, 10, 170, 230);
        pf2.add(ftit);
        //pf1.add(tp);
        //pf1.add(tcls);
        pf1.add(tauthr);
        pf1.add(tacno);

        pf1.add(csr);
        pf5.add(bdel);
        pf5.add(baddf);
        pf5.add(bupdt);
        pf5.add(bcnc);
       // pf3.add(brs);
        //pf3.add(bpt);
        pf5.add(bcfl);
        cf.add(pf1);
        cf.add(pf2);
        cf.add(pf3);
        pf3.add(pf4);
        pf3.add(pf5);
        pf3.add(pf6);
        pf6.add(fsr);
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
        lop1.setBounds(0, 0, 1024, 768);
        lop2.setBounds(0, 0, 1024, 768);
        pf1.setOpaque(false);
        pf2.setOpaque(false);
        pf3.setOpaque(false);
        pf4.setOpaque(false);
        pf5.setOpaque(false);
        pf6.setOpaque(false);
        ftit.setBounds(300, 10, 400, 30);
        fsr.setBounds(12, 22, 120, 30);
        csr.setBounds(10, 55, 140, 30);
        tauthr.setBounds(270, 390, 240, 35);
        tacno.setBounds(270, 440, 240, 35);

        baddf.setBounds(10, 20, 140, 30);
        bupdt.setBounds(10, 60, 140, 30);
        bdel.setBounds(10, 100, 140, 30);
        bcnc.setBounds(10, 200, 140, 30);
        bcfl.setBounds(10, 160, 140, 30);
        //bpt.setBounds(15, 232, 160, 33);
       // brs.setBounds(15, 190, 160, 33);

        bcfl.setFont(fi2);
        ftit.setFont(fi3);

        //tp.setFont(fi);
        baddf.setFont(fi2);
        bdel.setFont(fi2);
        bcnc.setFont(fi2);
        bupdt.setFont(fi2);
       // brs.setFont(fi2);
       // bpt.setFont(fi2);
        csr.setFont(fi2);
        fsr.setFont(fi2);
        csr.setBorder(bf3);
       // tp.setBorder(bf3);
        bcnc.setBorder(bf3);
        bdel.setBorder(bf3);
        baddf.setBorder(bf3);
        bupdt.setBorder(bf3);
        //brs.setBorder(bf3);
        //bpt.setBorder(bf3);
        bcfl.setBorder(bf3);
        tauthr.setBorder(bf3);
        tacno.setBorder(bf3);
 
        addComp1(tid, 270, 40, 240, 30);
        addComp1(tnm, 270, 90, 100, 30);
        addComp1(tfa, 270, 140, 100, 30);
        addComp1(tsrc, 270, 190, 120, 30);
        addComp1(tdt, 270, 240, 100, 30);
        bdt.setBounds(380,240,100,30);
        
        addComp1(atm, 270, 290, 100, 30);
        bdt1.setBounds(380,290,100,30);
        //addComp1(tchgs, 270, 490, 115, 30);
        //addComp1(tseats, 270, 540, 115, 30);
        //addComp1(tchgs1, 395, 490, 115, 30);
        //addComp1(tseats1, 395, 540, 115, 30);
        addComp1(ttm, 270, 340, 240, 30);
        //addComp1(tcls, 270, 440, 120, 35);
        //addComp1(tcls1, 395, 440, 120, 35);
        //
        addComp(fid, "Name", 100, 40, 240, 30);
        addComp(fnm, "Class", 100, 90, 240, 30);
        addComp(fa, "Div", 100, 140, 240, 30);
        addComp(fsrc, "Roll No.", 100, 190, 260, 30);
        addComp(fdt, "Issue Date", 100, 240, 240, 30);
        addComp(fatm, "Due Date", 100, 290, 240, 30);
        addComp(ftp, "Author", 100, 390, 240, 30);
        addComp(fcls, "Accession No.", 100, 440, 240, 30);
        addComp(lstatus,"Status:",100, 500, 240, 30);
        addComp(lstat,"",300, 500, 240, 30);
        //addComp(fchgs, "", 100, 490, 240, 30);
        //addComp(fseats, "Seats", 100, 540, 240, 30);
        addComp(ftm, "Title", 100, 340, 240, 30);
        bupdt.addActionListener(this);
        bupdt.addActionListener(this);
        baddf.addActionListener(this);
        bcnc.addActionListener(this);
        bcfl.addActionListener(this);
        //brs.addActionListener(this);
        bdel.addActionListener(this);
        //bpt.addActionListener(this);
        csr.addItemListener(this);
        tsrc.addKeyListener(this);
        tdt.addKeyListener(this);
        tfa.addKeyListener(this);
        atm.addKeyListener(this);
        ttm.addKeyListener(this);
        tseats.addKeyListener(this);
        tchgs1.addKeyListener(this);
        tchgs.addKeyListener(this);
        tseats1.addKeyListener(this);
        tid.addKeyListener(this);

		//tnm.addKeyListener(this);
        //atm.addKeyListener(this);
        tseats.addFocusListener(this);
        tseats1.addFocusListener(this);
        tchgs.addFocusListener(this);
        tchgs1.addFocusListener(this);
        resultset1();
        //enText(false);
        setSize(1024, 768);
        setLocation(0, 0);
        setVisible(true);
       // setClosable(true);
    }
    /* public boolean validateTime(String time)
     {
     //return time.matches("[1-9]+(\.[1-9]+)(\\{a,p}+)([m_])");
        
     }*/

    public void focusGained(FocusEvent e) {
    }

    public void focusLost(FocusEvent e) {
        try {

            if (e.getSource() == tseats) {
                if (!tseats.getText().equals("")) {
                    if (Integer.parseInt(tseats.getText()) > 250) {
                        JOptionPane.showMessageDialog(null, "Seats in Bussiness Class should be less than 250");
                        tseats.setText("");
                    }

                    if (tseats.getText().length() != 3) {
                        JOptionPane.showMessageDialog(null, "Enter only 3  digits");
                        tseats.setText("");
                    } else if (tseats.getText().equals("000")) {
                        JOptionPane.showMessageDialog(null, "plzz enter correct number");
                        tseats.setText("");
                    }

                }
            }
            if (e.getSource() == tseats1) {
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
            if (e.getSource() == tchgs1) {
                if (!tchgs1.getText().equals("")) {
                    if (Integer.parseInt(tchgs1.getText()) > 80000) {
                        JOptionPane.showMessageDialog(null, "Charges Should be less than  80000 thousand");
                        tchgs1.setText("");
                    }

                    if (tchgs1.getText().length() > 5) {
                        JOptionPane.showMessageDialog(null, "Enter the  charges of 4 or 5 disgits");
                        tchgs1.setText("");
                    } else if (tchgs1.getText().equals("00000") || tchgs1.getText().equals("0000")) {
                        JOptionPane.showMessageDialog(null, "plzz enter correct amount");
                        tchgs1.setText("");
                    }

                }
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e1) {
        try {
            if (e1.getSource() == bpt) {
                //bpt.setVisible(false);
                setSize(1024, 768);
                PrinterJob printJob = PrinterJob.getPrinterJob();
                printJob.setPrintable(this);
                if (printJob.printDialog()) {

                    printJob.print();

                    printJob.cancel();
                }
                printJob.cancel();
                bpt.setVisible(true);
                setSize(1024, 768);
            }
        } catch (PrinterException ex) {
        }
        if (e1.getSource() == brs) {

            r = fc.showOpenDialog(this);
            if (r == JFileChooser.APPROVE_OPTION) {
                Image.setIcon(new ImageIcon(fc.getSelectedFile().getPath()));
                tp1 = 1;
            } else {
                tp1 = 0;
            }
        }
        if (e1.getSource() == baddf) {
            if (baddf.getText().equals("Add ")) {
                clearFlight();
                baddf.setText("Save ");
                //btnen(false);
                enText(true);

            }
            if ((tid.getText().equals("") || tnm.getText().equals("") || tsrc.getText().equals("") || ttm.getText().equals("") || tchgs.getText().equals("") || tseats.getText().equals("") || tdt.getText().equals("") || atm.getText().equals("") || tfa.getText().equals("")) && count1 >= 1) {
                JOptionPane.showMessageDialog(null, "Please Enter The Details", "Confirm", JOptionPane.INFORMATION_MESSAGE);
            } else {
                count1++;
                //btnen(false);
                savedFlight();
            }

        }
        if (e1.getSource() == bupdt) {

            bupdt.setText("Save");
            enText(true);
            tid.setEnabled(false);
            count++;
            if (count > 1 && count <= 3) {
                bcfl.setEnabled(false);
                baddf.setEnabled(false);
                bdel.setEnabled(false);
            }

            System.out.println(count);
            if (count > 2 && count < 4 && bupdt.getText().equals("Save")) {

                updateFlight();
                enText(false);
            }

        }
        if (e1.getSource() == bcnc) {
            this.dispose();
        }
        if (e1.getSource() == bdel) {

            showFlight();
            delFlight();
        }
        if (e1.getSource() == bcfl) {

            clearFlight();

        }
    }

    public void itemStateChanged(ItemEvent ie) {

        if (ie.getSource() == csr) {
            count = 0;
            count1 = 0;
            //btnen(true);
            showFlight();
        }

    }

    void btnen(Boolean b) {

       // bdel.setEnabled(b);
       // bupdt.setEnabled(b);
    }

    void updateFlight() {

        try {
            file = new File(fc.getSelectedFile().getPath());
            fis = new FileInputStream(file);

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:sameera", "system", "server");
            PreparedStatement pfadd = con.prepareStatement("update flight set fnm=?,far=?,fsrc=? ,fdst=?,farrtm=?,fdtm=?,ftype=?,fclass=?,charges=?,seats=?,fclass1=?,charges1=?,seats1=?,image=? where fid=?");
            PreparedStatement pfadd1 = con.prepareStatement("update availableSeats set seatsb=?,seatse=?  where fid=?");

            pfadd.setString(1, tnm.getText());
            pfadd.setString(2, tfa.getText());
            pfadd.setString(3, tsrc.getText());
            pfadd.setString(4, tdt.getText());
            pfadd.setString(5, atm.getText());
            pfadd.setString(6, ttm.getText());
            pfadd.setString(7, tp.getSelectedItem().toString());
            pfadd.setString(8, tcls.getText());
            int ch = Integer.parseInt(tchgs.getText());
            int st = Integer.parseInt(tseats.getText());
            pfadd.setInt(9, ch);
            pfadd.setInt(10, st);
            pfadd.setString(11, tcls1.getText());
            int ch1 = Integer.parseInt(tchgs1.getText());
            int st1 = Integer.parseInt(tseats1.getText());
            pfadd.setInt(12, ch1);
            pfadd.setInt(13, st1);
            pfadd.setBinaryStream(14, fis, (int) file.length());
            pfadd.setString(15, tid.getText());
            pfadd.executeUpdate();
            int b = Integer.parseInt(tseats1.getText());
            int e = Integer.parseInt(tseats.getText());
            pfadd1.setInt(1, b);
            pfadd1.setInt(2, e);
            pfadd1.setString(3, tid.getText());

            pfadd1.executeUpdate();
            con.commit();
            con.close();

            JOptionPane.showMessageDialog(null, "flight updated", "confirm ", JOptionPane.INFORMATION_MESSAGE);

            bcfl.setEnabled(true);
            baddf.setEnabled(true);
            bdel.setEnabled(true);

        } catch (Exception e2) {
		//System.out.println(e2);
            //e2.printStackTrace();
        }

    }

    void showFlight() {
        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:sameera", "system", "server");
            Statement stmt = con.createStatement();
            String ele = (String) csr.getSelectedItem();
            rs = stmt.executeQuery("select * from flight where fid='" + ele + "'");
            if (rs.next()) {

                tid.setText(rs.getString(1));
                tnm.setText(rs.getString(2));
                tfa.setText(rs.getString(3));
                tsrc.setText(rs.getString(4));
                tdt.setText(rs.getString(5));
                atm.setText(rs.getString(6));
                ttm.setText(rs.getString(7));
                tp.setSelectedItem(rs.getString(8));
                //tcls.setSelectedItem(rs.getString(9));
                tchgs.setText(String.valueOf(rs.getInt(10)));
                tseats.setText(String.valueOf(rs.getInt(11)));
                tchgs1.setText(String.valueOf(rs.getInt(13)));
                tseats1.setText(String.valueOf(rs.getInt(14)));
                GetImage1();
            }
            con.commit();
            con.close();

        } catch (Exception e2) {
            //e2.printStackTrace();
        }
    }

    void GetImage1() throws Exception {
        InputStream stream = rs.getBinaryStream(15);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int a1 = stream.read();
        while (a1 >= 0) {
            output.write((char) a1);
            a1 = stream.read();
        }
        Image myImage = Toolkit.getDefaultToolkit().createImage(output.toByteArray());
        Image.setIcon(new ImageIcon(myImage));
        output.close();
    }

    void savedFlight() {

        try {
            file = new File(fc.getSelectedFile().getPath());
            fis = new FileInputStream(file);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:sameera", "system", "server");
            PreparedStatement pfadd = con.prepareStatement("insert into flight values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pfadd.setString(1, tid.getText());
            pfadd.setString(2, tnm.getText());
            pfadd.setString(3, tfa.getText());
            pfadd.setString(4, tsrc.getText());
            pfadd.setString(5, tdt.getText());
            pfadd.setString(6, atm.getText());
            pfadd.setString(7, ttm.getText());
            pfadd.setString(8, tp.getSelectedItem().toString());
            pfadd.setString(9, "Economy");
            int ch = Integer.parseInt(tchgs.getText());
            int st = Integer.parseInt(tseats.getText());
            pfadd.setInt(10, ch);
            pfadd.setInt(11, st);
            pfadd.setString(12, "Bussiness");
            int ch1 = Integer.parseInt(tchgs1.getText());
            int st1 = Integer.parseInt(tseats1.getText());
            pfadd.setInt(13, ch1);
            pfadd.setInt(14, st1);
            pfadd.setBinaryStream(15, fis, (int) file.length());
            pfadd.executeUpdate();
            resultset1();
            JOptionPane.showMessageDialog(null, "saved ", "confirm ", JOptionPane.INFORMATION_MESSAGE);
           // btnen(true);
            con.commit();
            con.close();
            enText(false);
            baddf.setText("Add");
           // btnen(true);

        } catch (Exception e2) {
            //e2.printStackTrace();
        }
    }

    void delFlight() {

        try {

            //ef(false);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:sameera", "system", "server");
            PreparedStatement pfadd = con.prepareStatement("delete  from flight where fid=?");
            pfadd.setString(1, tid.getText());

            pfadd.executeUpdate();
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null, "1 record deleted", "confirm ", JOptionPane.INFORMATION_MESSAGE);
            csr.removeItem(tid.getText());
            clearFlight();

        } catch (Exception e2) {
            System.out.println(e2);//e2.printStackTrace();
        }

    }

    void resultset1() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:sameera", "system", "server");
            java.sql.Statement stmt1 = con.createStatement();

            ResultSet rs1 = stmt1.executeQuery("select fid from flight");
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

    void clearFlight() {
        tid.setText("");
        tnm.setText("");
        tfa.setText("");
        tsrc.setText("");
        tdt.setText("");
        atm.setText("");
        ttm.setText("");
        tchgs.setText("");
        tseats.setText("");
        tchgs1.setText("");
        tseats1.setText("");
        tp.setSelectedIndex(0);
        enText(true);
        tid.requestFocus();
    }

    void enText(boolean b) {
        tid.setEnabled(b);
        tnm.setEnabled(b);
        tfa.setEnabled(b);
        tsrc.setEnabled(b);
        tdt.setEnabled(b);
        atm.setEnabled(b);
        ttm.setEnabled(b);
        tchgs.setEnabled(b);
        tseats.setEnabled(b);
        //tcls.setEnabled(b);
        tchgs1.setEnabled(b);
        tseats1.setEnabled(b);
        Image.setEnabled(b);
        tp.setEnabled(b);
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
            if (evt.getSource() == tfa) {
                tfa.setText(tfa.getText().replaceAll(num3, ""));
            }
            if (evt.getSource() == tsrc) {
                tsrc.setText(tsrc.getText().replaceAll(num3, ""));
            }
            if (evt.getSource() == tdt) {
                tdt.setText(tdt.getText().replaceAll(num3, ""));
            }
            if (evt.getSource() == tid) {
                tid.setText(tid.getText().replaceAll(num2, ""));
            }
            if (evt.getSource() == tnm) {
                tnm.setText(tnm.getText().replaceAll(num1, ""));
            }
            if (evt.getSource() == tchgs) {
                tchgs.setText(tchgs.getText().replaceAll(num4, ""));
            }
            if (evt.getSource() == tseats) {
                tseats.setText(tseats.getText().replaceAll(num4, ""));
            }
            if (evt.getSource() == tchgs1) {
                tchgs1.setText(tchgs1.getText().replaceAll(num4, ""));
            }
            if (evt.getSource() == tseats1) {
                tseats1.setText(tseats1.getText().replaceAll(num4, ""));
            }
            /*   if(evt.getSource()==atm)
             {
             atm.setText(atm.getText().replaceAll(nj,""));
             }  
             if(evt.getSource()==ttm)
             {
             ttm.setText(ttm.getText().replaceAll(nj,""));
             }*/

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
    public static void main(String args[])
    {
    	Issue e = new Issue();
    }
}


