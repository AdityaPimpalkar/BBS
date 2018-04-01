/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagement;


  import java.awt.BorderLayout;

import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
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
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Aditya
 */
public class Home extends JFrame implements ActionListener{
	Container c;
        JDesktopPane p;
        JLabel lp;
	JPanel pn1,pn2;
	JMenuBar mb;
        JMenu r1,r2,r3,r4,r5,r6,r7;
	JMenu m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,
	m29,m30,m31,m32,m33,m34,m35,m36,m37,m38,m39,m40,m41,m42,m43,m44,m45,m46,m47,m48,m49,m50,m51,m52,
	 i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36,i37,i38,i39,i40,
	i41,i42,i43,i44,i45,i46,i47,i48,i49,i50,i51,i52,i53,i54,i55,i56,i57,i58,i59,i60,i61,i62,i63,i64,i65,i66,i67,i68,i69,i70,i71,i72,i73,i74,i75,i76,i77,i78,i79,i80,i81;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi20,mi21,mi22,mi23,mi24,mi25,mi26,mi27,mi28,mi29,mi30,mi31,mi32
	,mi33,mi34,mi35,mi36,mi37,mi38,mi39,mi40,
	mi41,mi42,mi43,mi44,mi45,mi46,mi47,mi48,mi49,mi50,mi51,mi52,mi53,mi54,mi55,mi56,mi57,mi58,mi59,mi60,mi61,mi62,mi63,mi64,mi65,mi66,mi67,mi68,mi69,mi70,mi71,mi72,mi73,mi74,mi75,mi76,mi77,mi78,mi79,mi80,
	mi81,mi82,mi83,mi84,mi85,mi86,mi87,mi88,mi89,mi90,mi91,mi92,mi93,mi94,mi95,mi96,mi97,mi98,mi99,mi100,mi101,mi102,mi103,mi104,mi105,mi106,mi107,mi108,mi109,mi110,mi111,mi112,mi113,mi114,mi115,mi116,
	mi117,mi118,mi119,mi120,mi121,mi122,mi123,mi124,mi125,mi126,mi127,mi128,mi129,mi130,mi131,mi132,mi133,mi134,mi135,mi136,mi137,mi138,mi139,mi140,mi141,mi142,mi143,mi144,mi145,mi146,mi147,mi148,mi149,
	mi150,mi151,mi152,mi153,mi154,mi155,mi156,mi157,mi158,mi159,mi160,mi161,mi162,mi163,mi164,mi165,mi166,mi167,mi168,mi169,mi170,mi171,mi172,mi173;
	
	
	public Home(String s){
		super(s);
		c=getContentPane();
                p=new JDesktopPane();
                lp=new JLabel(new ImageIcon("lib0.jpg"));
		c.setLayout(null);
		pn1=new JPanel();
		pn2=new JPanel();
		Font fm=new Font("castellar",Font.BOLD,15);
		Font fm1=new Font("cambria",Font.BOLD,17);
		Border bf = BorderFactory.createLineBorder(Color.black);
		
		
		
		
		
		
			mb= new JMenuBar();
                        r7=new JMenu("Records");
			m1=new JMenu("Bsc");
			m2=new JMenu("IT");
			m3=new JMenu("CS");
			m4=new JMenu("BioTech");
			m5=new JMenu("BCom");
			m6=new JMenu("BAF");
			m7=new JMenu("BMS"); 
			m8=new JMenu("MLT");
			m9=new JMenu("BBA");
			m10=new JMenu("BCA");
			m11=new JMenu("MCA");
			m12=new JMenu("MSc-IT");
			m13=new JMenu("B.A");
                        r1=new JMenu("Msc");
			r2=new JMenu("MSc-BioTech");  
			r3=new JMenu("MSc-CS");
			r4=new JMenu("MCom");
			r5=new JMenu("MA");
			r6=new JMenu("MBA");
			
			m14=new JMenu("F.Y");
			m15=new JMenu("S.Y");
			m16=new JMenu("T.Y");
			
			m17=new JMenu("F.Y");
			m18=new JMenu("S.Y");
			m19=new JMenu("T.Y");
			
			m20=new JMenu("F.Y");
			m21=new JMenu("S.Y");
			m22=new JMenu("T.Y");
			
			m23=new JMenu("F.Y");
			m24=new JMenu("S.Y");
			m25=new JMenu("T.Y");
			mi173=new JMenuItem("Show");
			m26=new JMenu("F.Y");
			m27=new JMenu("S.Y");
			m28=new JMenu("T.Y");
			
			m29=new JMenu("F.Y");
			m30=new JMenu("S.Y");
			m31=new JMenu("T.Y");
			
			m32=new JMenu("F.Y");
			m33=new JMenu("S.Y");
			m34=new JMenu("T.Y");
		
			m35=new JMenu("F.Y");
			m36=new JMenu("S.Y");
			m37=new JMenu("T.Y");
			
			m38=new JMenu("F.Y");
			m39=new JMenu("S.Y");
			m40=new JMenu("T.Y");
			
			m41=new JMenu("F.Y");
			m42=new JMenu("S.Y");
			m43=new JMenu("T.Y");
			
			m44=new JMenu("F.Y");
			m45=new JMenu("S.Y");
			m46=new JMenu("T.Y");
			
			m47=new JMenu("F.Y");
			m48=new JMenu("S.Y");
			m49=new JMenu("T.Y");
			
			m50=new JMenu("F.Y");
			m51=new JMenu("S.Y");
			m52=new JMenu("T.Y");
			
			i4=new JMenu("I");
			i5=new JMenu("II");
			i6=new JMenu("III");
			i7=new JMenu("IV");
			i8=new JMenu("V");
			i9=new JMenu("VI"); 
			
			i10=new JMenu("I");
			i11=new JMenu("II");
			i12=new JMenu("III");
			i13=new JMenu("IV");
			i14=new JMenu("V");
			i15=new JMenu("VI"); 
			
			i16=new JMenu("I");
			i17=new JMenu("II");
			i18=new JMenu("III");
			i19=new JMenu("IV");
			i20=new JMenu("V");
			i21=new JMenu("VI"); 
			
			i22=new JMenu("I");
			i23=new JMenu("II");
			i24=new JMenu("III");
			i25=new JMenu("IV");
			i26=new JMenu("V");
			i27=new JMenu("VI"); 
			
			i28=new JMenu("I");
			i29=new JMenu("II");
			i30=new JMenu("III");
			i31=new JMenu("IV");
			i32=new JMenu("V");
			i33=new JMenu("VI"); 
			
			i34=new JMenu("I");
			i35=new JMenu("II");
			i36=new JMenu("III");
			i37=new JMenu("IV");
			i38=new JMenu("V");
			i39=new JMenu("VI"); 
			
			i40=new JMenu("I");
			i41=new JMenu("II");
			i42=new JMenu("III");
			i43=new JMenu("IV");
			i44=new JMenu("V");
			i45=new JMenu("VI"); 
			
			i46=new JMenu("I");
			i47=new JMenu("II");
			i48=new JMenu("III");
			i49=new JMenu("IV");
			i50=new JMenu("V");
			i51=new JMenu("VI"); 
			
			i52=new JMenu("I");
			i53=new JMenu("II");
			i54=new JMenu("III");
			i55=new JMenu("IV");
			i56=new JMenu("V");
			i57=new JMenu("VI"); 
			
			i58=new JMenu("I");
			i59=new JMenu("II");
			i60=new JMenu("III");
			i61=new JMenu("IV");
			i62=new JMenu("V");
			i63=new JMenu("VI"); 
			
			i64=new JMenu("I");
			i65=new JMenu("II");
			i66=new JMenu("III");
			i67=new JMenu("IV");
			i68=new JMenu("V");
			i69=new JMenu("VI"); 
			
			i70=new JMenu("I");
			i71=new JMenu("II");
			i72=new JMenu("III");
			i73=new JMenu("IV");
			i74=new JMenu("V");
			i75=new JMenu("VI");
			
			i76=new JMenu("I");
			i77=new JMenu("II");
			i78=new JMenu("III");
			i79=new JMenu("IV");
			i80=new JMenu("V");
			i81=new JMenu("VI");
			
			m14=new JMenu("F.Y");
			m15=new JMenu("S.Y");
			m16=new JMenu("T.Y");
			
			m17=new JMenu("F.Y");
			m18=new JMenu("S.Y");
			m19=new JMenu("T.Y");
			
			m20=new JMenu("F.Y");
			m21=new JMenu("S.Y");
			m22=new JMenu("T.Y");
			
			m23=new JMenu("F.Y");
			m24=new JMenu("S.Y");
			m25=new JMenu("T.Y");
			
			m26=new JMenu("F.Y");
			m27=new JMenu("S.Y");
			m28=new JMenu("T.Y");
			
			m29=new JMenu("F.Y");
			m30=new JMenu("S.Y");
			m31=new JMenu("T.Y");
			
			m32=new JMenu("F.Y");
			m33=new JMenu("S.Y");
			m34=new JMenu("T.Y");
		
			m35=new JMenu("F.Y");
			m36=new JMenu("S.Y");
			m37=new JMenu("T.Y");
			
			m38=new JMenu("F.Y");
			m39=new JMenu("S.Y");
			m40=new JMenu("T.Y");
			
			m41=new JMenu("F.Y");
			m42=new JMenu("S.Y");
			m43=new JMenu("T.Y");
			
			m44=new JMenu("F.Y");
			m45=new JMenu("S.Y");
			m46=new JMenu("T.Y");
			
			m47=new JMenu("F.Y");
			m48=new JMenu("S.Y");
			m49=new JMenu("T.Y");
			
			m50=new JMenu("F.Y");
			m51=new JMenu("S.Y");
			m52=new JMenu("T.Y");
			
			mi4=new JMenuItem("Form");
			mi5=new JMenuItem("Details");
			mi6=new JMenuItem("Form");
			mi7=new JMenuItem("Details");
			mi8=new JMenuItem("Form");
			mi9=new JMenuItem("Details"); 
			
			mi10=new JMenuItem("Form");
			mi11=new JMenuItem("Details");
			mi12=new JMenuItem("Form");
			mi13=new JMenuItem("Details");
			mi14=new JMenuItem("Form");
			mi15=new JMenuItem("Details"); 
			
			mi16=new JMenuItem("Form");
			mi17=new JMenuItem("Details");
			mi18=new JMenuItem("Form");
			mi19=new JMenuItem("Details");
			mi20=new JMenuItem("Form");
			mi21=new JMenuItem("Details"); 
			
			mi22=new JMenuItem("Form");
			mi23=new JMenuItem("Details");
			mi24=new JMenuItem("Form");
			mi25=new JMenuItem("Details");
			mi26=new JMenuItem("Form");
			mi27=new JMenuItem("Details"); 
			
			mi28=new JMenuItem("Form");
			mi29=new JMenuItem("Details");
			mi30=new JMenuItem("Form");
			mi31=new JMenuItem("Details");
			mi32=new JMenuItem("Form");
			mi33=new JMenuItem("Details"); 
			
			mi34=new JMenuItem("Form");
			mi35=new JMenuItem("Details");
			mi36=new JMenuItem("Form");
			mi37=new JMenuItem("Details");
			mi38=new JMenuItem("Form");
			mi39=new JMenuItem("Details"); 
			
			mi40=new JMenuItem("Form");
			mi41=new JMenuItem("Details");
			mi42=new JMenuItem("Form");
			mi43=new JMenuItem("Details");
			mi44=new JMenuItem("Form");
			mi45=new JMenuItem("Details"); 
			
			mi46=new JMenuItem("Form");
			mi47=new JMenuItem("Details");
			mi48=new JMenuItem("Form");
			mi49=new JMenuItem("Details");
			mi50=new JMenuItem("Form");
			mi51=new JMenuItem("Details"); 
			
			mi52=new JMenuItem("Form");
			mi53=new JMenuItem("Details");
			mi54=new JMenuItem("Form");
			mi55=new JMenuItem("Details");
			mi56=new JMenuItem("Form");
			mi57=new JMenuItem("Details"); 
			
			mi58=new JMenuItem("Form");
			mi59=new JMenuItem("Details");
			mi60=new JMenuItem("Form");
			mi61=new JMenuItem("Details");
			mi62=new JMenuItem("Form");
			mi63=new JMenuItem("Details"); 
			
			mi64=new JMenuItem("Form");
			mi65=new JMenuItem("Details");
			mi66=new JMenuItem("Form");
			mi67=new JMenuItem("Details");
			mi68=new JMenuItem("Form");
			mi69=new JMenuItem("Details"); 
			
			mi70=new JMenuItem("Form");
			mi71=new JMenuItem("Details");
			mi72=new JMenuItem("Form");
			mi73=new JMenuItem("Details");
			mi74=new JMenuItem("Form");
			mi75=new JMenuItem("Details");
			
			mi76=new JMenuItem("Form");
			mi77=new JMenuItem("Details");
			mi78=new JMenuItem("Form");
			mi79=new JMenuItem("Details");
			mi80=new JMenuItem("Form");
			mi81=new JMenuItem("Details");
			
			
			mi82=new JMenuItem("Form");
			mi83=new JMenuItem("Details");
			mi84=new JMenuItem("Form");
			mi85=new JMenuItem("Details");
			mi86=new JMenuItem("Form");
			mi87=new JMenuItem("Details");
			
			mi88=new JMenuItem("Form");
			mi89=new JMenuItem("Details");
			mi90=new JMenuItem("Form");
			mi91=new JMenuItem("Details");
			mi92=new JMenuItem("Form");
			mi93=new JMenuItem("Details");
			
			mi94=new JMenuItem("Form");
			mi95=new JMenuItem("Details");
			mi96=new JMenuItem("Form");
			mi97=new JMenuItem("Details");
			mi98=new JMenuItem("Form");
			mi99=new JMenuItem("Details");
			
			mi100=new JMenuItem("Form");
			mi101=new JMenuItem("Details");
			mi102=new JMenuItem("Form");
			mi103=new JMenuItem("Details");
			mi104=new JMenuItem("Form");
			mi105=new JMenuItem("Details");
			
			mi106=new JMenuItem("Form");
			mi107=new JMenuItem("Details");
			mi108=new JMenuItem("Form");
			mi109=new JMenuItem("Details");
			mi110=new JMenuItem("Form");
			mi111=new JMenuItem("Details");
			
			mi112=new JMenuItem("Form");
			mi113=new JMenuItem("Details");
			mi114=new JMenuItem("Form");
			mi115=new JMenuItem("Details");
			mi116=new JMenuItem("Form");
			mi117=new JMenuItem("Details");
			
			mi118=new JMenuItem("Form");
			mi119=new JMenuItem("Details");
			mi120=new JMenuItem("Form");
			mi121=new JMenuItem("Details");
			mi122=new JMenuItem("Form");
			mi123=new JMenuItem("Details");
			
			mi124=new JMenuItem("Form");
			mi125=new JMenuItem("Details");
			mi126=new JMenuItem("Form");
			mi127=new JMenuItem("Details");
			mi128=new JMenuItem("Form");
			mi129=new JMenuItem("Details");
			
			mi130=new JMenuItem("Form");
			mi131=new JMenuItem("Details");
			mi132=new JMenuItem("Form");
			mi133=new JMenuItem("Details");
			mi134=new JMenuItem("Form");
			mi135=new JMenuItem("Details");
			
			mi136=new JMenuItem("Form");
			mi137=new JMenuItem("Details");
			mi138=new JMenuItem("Form");
			mi139=new JMenuItem("Details");
			mi140=new JMenuItem("Form");
			mi141=new JMenuItem("Details");
			
			mi142=new JMenuItem("Form");
			mi143=new JMenuItem("Details");
			mi144=new JMenuItem("Form");
			mi145=new JMenuItem("Details");
			mi146=new JMenuItem("Form");
			mi147=new JMenuItem("Details");
			
			mi148=new JMenuItem("Form");
			mi149=new JMenuItem("Details");
			mi150=new JMenuItem("Form");
			mi151=new JMenuItem("Details");
			mi152=new JMenuItem("Form");
			mi153=new JMenuItem("Details");
			
			mi154=new JMenuItem("Form");
			mi155=new JMenuItem("Details");
			mi156=new JMenuItem("Form");
			mi157=new JMenuItem("Details");
			mi158=new JMenuItem("Form");
			mi159=new JMenuItem("Details");
			
			mi160=new JMenuItem("BBS");
			mi161=new JMenuItem("BBS");
			mi162=new JMenuItem("BBS");
			mi163=new JMenuItem("BBS");
			mi164=new JMenuItem("BBS");
			mi165=new JMenuItem("BBS");
			mi166=new JMenuItem("BBS");
			mi167=new JMenuItem("BBS");
			mi168=new JMenuItem("BBS");
			mi169=new JMenuItem("BBS");
			mi170=new JMenuItem("BBS");
			mi171=new JMenuItem("BBS");
			mi172=new JMenuItem("BBS");
			
			/*m2.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m3.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m4.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m5.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m6.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m7.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m8.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m9.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m10.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m11.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m12.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
			m13.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);*/
			 p.add(lp);
                         lp.setBounds(0,0,1356,768);
			r1.setFont(fm);
			r2.setFont(fm);
			r3.setFont(fm);
			r4.setFont(fm);
			r5.setFont(fm);
			r6.setFont(fm);
			m1.setFont(fm);
			m2.setFont(fm);
			m3.setFont(fm);
			m4.setFont(fm);
			m5.setFont(fm);
			m6.setFont(fm);
			m7.setFont(fm);
			m8.setFont(fm);
			m9.setFont(fm);
			m10.setFont(fm);
			m11.setFont(fm);
			m12.setFont(fm);
			m13.setFont(fm);
			m14.setFont(fm);
			m15.setFont(fm);
			m16.setFont(fm);
			m17.setFont(fm);
			m18.setFont(fm);
			m19.setFont(fm);
			m20.setFont(fm);
			m21.setFont(fm);
			m22.setFont(fm);
			m23.setFont(fm);
			m24.setFont(fm);
			m25.setFont(fm);
			m26.setFont(fm);
			m27.setFont(fm);
			m28.setFont(fm);
			m29.setFont(fm);
			m30.setFont(fm);
			m31.setFont(fm);
			m32.setFont(fm);
			m33.setFont(fm);
			m34.setFont(fm);
			m35.setFont(fm);
			m36.setFont(fm);
                        mi173.setFont(fm);
			m37.setFont(fm);
			m38.setFont(fm);
			m39.setFont(fm);
			m40.setFont(fm);
			m41.setFont(fm);
			m42.setFont(fm);
			m43.setFont(fm);
			m44.setFont(fm);
			m45.setFont(fm);
			m46.setFont(fm);
			m47.setFont(fm);
			m48.setFont(fm);
			m49.setFont(fm);
			m50.setFont(fm);
			m51.setFont(fm);
			m52.setFont(fm);
			
			i4.setFont(fm);
			i5.setFont(fm);
			i6.setFont(fm);
			i7.setFont(fm);
			i8.setFont(fm);
			i9.setFont(fm);
			i10.setFont(fm);
			i11.setFont(fm);
			i12.setFont(fm);
			i13.setFont(fm);
			i14.setFont(fm);
			i15.setFont(fm);
			i16.setFont(fm);
			i17.setFont(fm);
			i18.setFont(fm);
			i19.setFont(fm);
			i20.setFont(fm);
			i21.setFont(fm);
			i22.setFont(fm);
			i23.setFont(fm);
			i24.setFont(fm);
			i25.setFont(fm);
			i26.setFont(fm);
			i27.setFont(fm);
			i28.setFont(fm);
			i29.setFont(fm);
			i30.setFont(fm);
			i31.setFont(fm);
			i32.setFont(fm);
			i33.setFont(fm);
			i34.setFont(fm);
			i35.setFont(fm);
			i36.setFont(fm);
			i37.setFont(fm);
			i38.setFont(fm);
			i39.setFont(fm);
			i40.setFont(fm);
			i41.setFont(fm);
			i42.setFont(fm);
			i43.setFont(fm);
			i44.setFont(fm);
			i45.setFont(fm);
			i46.setFont(fm);
			i47.setFont(fm);
			i48.setFont(fm);
			i49.setFont(fm);
			i50.setFont(fm);
			i51.setFont(fm);
			i52.setFont(fm);
			i53.setFont(fm);
			i54.setFont(fm);
			i55.setFont(fm);
			i56.setFont(fm);
			i57.setFont(fm);
			i58.setFont(fm);
			i59.setFont(fm);
			i60.setFont(fm);
			i61.setFont(fm);
			i62.setFont(fm);
			i63.setFont(fm);
			i64.setFont(fm);
			i65.setFont(fm);
			i66.setFont(fm);
			i67.setFont(fm);
			i68.setFont(fm);
			i69.setFont(fm);
			i70.setFont(fm);
			i71.setFont(fm);
			i72.setFont(fm);
			i73.setFont(fm);
			i74.setFont(fm);
			i75.setFont(fm);
			i76.setFont(fm);
			i77.setFont(fm);
			i78.setFont(fm);
			i79.setFont(fm);
			i80.setFont(fm);
			i81.setFont(fm);
			
			mi4.setFont(fm);
			mi5.setFont(fm);
			mi6.setFont(fm);
			mi7.setFont(fm);
			mi8.setFont(fm);
			mi9.setFont(fm);
			mi10.setFont(fm);
			mi11.setFont(fm);
			mi12.setFont(fm);
			mi13.setFont(fm);
			mi14.setFont(fm);
			mi15.setFont(fm);
			mi16.setFont(fm);
			mi17.setFont(fm);
			mi18.setFont(fm);
			mi19.setFont(fm);
			mi20.setFont(fm);
			mi21.setFont(fm);
			mi22.setFont(fm);
			mi23.setFont(fm);
			mi24.setFont(fm);
			mi25.setFont(fm);
			mi26.setFont(fm);
			mi27.setFont(fm);
			mi28.setFont(fm);
			mi29.setFont(fm);
			mi30.setFont(fm);
			mi31.setFont(fm);
			mi32.setFont(fm);
			mi33.setFont(fm);
			mi34.setFont(fm);
			mi35.setFont(fm);
			mi36.setFont(fm);
			mi37.setFont(fm);
			mi38.setFont(fm);
			mi39.setFont(fm);
			mi40.setFont(fm);
			mi41.setFont(fm);
			mi42.setFont(fm);
			mi43.setFont(fm);
			mi44.setFont(fm);
			mi45.setFont(fm);
			mi46.setFont(fm);
			mi47.setFont(fm);
			mi48.setFont(fm);
			mi49.setFont(fm);
			mi50.setFont(fm);
			mi51.setFont(fm);
			mi52.setFont(fm);
			mi53.setFont(fm);
			mi54.setFont(fm);
			mi55.setFont(fm);
			mi56.setFont(fm);
			mi57.setFont(fm);
			mi58.setFont(fm);
			mi59.setFont(fm);
			mi60.setFont(fm);
			mi61.setFont(fm);
			mi62.setFont(fm);
			mi63.setFont(fm);
			mi64.setFont(fm);
			mi65.setFont(fm);
			mi66.setFont(fm);
			mi67.setFont(fm);
			mi68.setFont(fm);
			mi69.setFont(fm);
			mi70.setFont(fm);
			mi71.setFont(fm);
			mi72.setFont(fm);
			mi73.setFont(fm);
			mi74.setFont(fm);
			mi75.setFont(fm);
			mi76.setFont(fm);
			mi77.setFont(fm);
			mi78.setFont(fm);
			mi79.setFont(fm);
			mi80.setFont(fm);
			mi81.setFont(fm);
			mi82.setFont(fm);
			mi83.setFont(fm);
			mi84.setFont(fm);
			mi85.setFont(fm);
			mi86.setFont(fm);
			mi87.setFont(fm);
			mi88.setFont(fm);
			mi89.setFont(fm);
			mi90.setFont(fm);
			mi91.setFont(fm);
			mi92.setFont(fm);
			mi93.setFont(fm);
			mi94.setFont(fm);
			mi95.setFont(fm);
			mi96.setFont(fm);
			mi97.setFont(fm);
			mi98.setFont(fm);
			mi99.setFont(fm);
			mi100.setFont(fm);
			mi101.setFont(fm);
			mi102.setFont(fm);
			mi103.setFont(fm);
			mi104.setFont(fm);
			mi105.setFont(fm);
			mi106.setFont(fm);
			mi107.setFont(fm);
			mi108.setFont(fm);
			mi109.setFont(fm);
			mi110.setFont(fm);
			mi111.setFont(fm);
			mi112.setFont(fm);
			mi113.setFont(fm);
			mi114.setFont(fm);
			mi115.setFont(fm);
			mi116.setFont(fm);
			mi117.setFont(fm);
			mi118.setFont(fm);
			mi119.setFont(fm);
			mi120.setFont(fm);
			mi121.setFont(fm);
			mi122.setFont(fm);
			mi123.setFont(fm);
			mi124.setFont(fm);
			mi125.setFont(fm);
			mi126.setFont(fm);
			mi127.setFont(fm);
			mi128.setFont(fm);
			mi129.setFont(fm);
			mi130.setFont(fm);
			mi131.setFont(fm);
			mi132.setFont(fm);
			mi133.setFont(fm);
			mi134.setFont(fm);
			mi135.setFont(fm);
			mi136.setFont(fm);
			mi137.setFont(fm);
			mi138.setFont(fm);
			mi139.setFont(fm);
			mi140.setFont(fm);
			mi141.setFont(fm);
			mi142.setFont(fm);
			mi143.setFont(fm);
			mi144.setFont(fm);
			mi145.setFont(fm);
			mi146.setFont(fm);
			mi147.setFont(fm);
			mi148.setFont(fm);
			mi149.setFont(fm);
			mi150.setFont(fm);
			mi151.setFont(fm);
			mi152.setFont(fm);
			mi153.setFont(fm);
			mi154.setFont(fm);
			mi155.setFont(fm);
			mi156.setFont(fm);
			mi157.setFont(fm);
			mi158.setFont(fm);
			mi159.setFont(fm);
			mi160.setFont(fm);
			mi161.setFont(fm);
			mi162.setFont(fm);
			mi163.setFont(fm);
			mi164.setFont(fm);
			mi165.setFont(fm);
			mi166.setFont(fm);
			mi167.setFont(fm);
			mi168.setFont(fm);
			mi169.setFont(fm);
			mi170.setFont(fm);
			mi171.setFont(fm);
			mi172.setFont(fm);
			r7.setFont(fm);
		
			
			c.add(pn1);
			c.add(pn2);
			pn1.add(mb);
			
			mb.add(m1);
			mb.add(m2);
			mb.add(m3);
			mb.add(m4);
			mb.add(m5);
			mb.add(m6);
			mb.add(m7);
                      
                                mb.add(m13);
                                mb.add(m10);
			mb.add(m8);
			mb.add(m9);
			
                        mb.add(r1);
			mb.add(m12);
                        mb.add(r2);
			mb.add(r3);
			mb.add(r4);
			mb.add(r5);
			mb.add(m11);
                        mb.add(r6);
			
			mb.add(r7);
			m1.add(m14);
			m1.add(m15);
			m1.add(m16);
			m1.add(mi160);
			m14.add(i4);
			m14.add(i5);
			m15.add(i6);
			m15.add(i7);
			m16.add(i8);
			m16.add(i9);
			
			i4.add(mi4);
			i4.add(mi5);
			i5.add(mi6);
			i5.add(mi7);
			i6.add(mi8);
			i6.add(mi9);
			i7.add(mi10);
			i7.add(mi11);
			i8.add(mi12);
			i8.add(mi13);
			i9.add(mi14);
			i9.add(mi15);
			
			m2.add(m17);
			m2.add(m18);
			m2.add(m19);
			m2.add(mi161);
			m17.add(i10);
			m17.add(i11);
			m18.add(i12);
			m18.add(i13);
			m19.add(i14);
			m19.add(i15);
			
			i10.add(mi16);
			i10.add(mi17);
			i11.add(mi18);
			i11.add(mi19);
			i12.add(mi20);
			i12.add(mi21);
			i13.add(mi22);
			i13.add(mi23);
			i14.add(mi24);
			i14.add(mi25);
			i15.add(mi26);
			i15.add(mi27);
			
			m3.add(m20);
			m3.add(m21);
			m3.add(m22);
			m3.add(mi162);
			m20.add(i16);
			m20.add(i17);
			m21.add(i18);
			m21.add(i19);
                       r7.add(mi173);
			m22.add(i20);
			m22.add(i21);
			
			i16.add(mi28);
			i16.add(mi29);
			i17.add(mi30);
			i17.add(mi31);
			i18.add(mi32);
			i18.add(mi33);
			i19.add(mi34);
			i19.add(mi35);
			i20.add(mi36);
			i20.add(mi37);
			i21.add(mi38);
			i21.add(mi39);
			
			m4.add(m23);
			m4.add(m24);
			m4.add(m25);
			m4.add(mi163);
			m23.add(i22);
			m23.add(i23);
			m24.add(i24);
			m24.add(i25);
			m25.add(i26);
			m25.add(i27);
			
			i22.add(mi40);
			i22.add(mi41);
			i23.add(mi42);
			i23.add(mi43);
			i24.add(mi44);
			i24.add(mi45);
			i25.add(mi46);
			i25.add(mi47);
			i26.add(mi48);
			i26.add(mi49);
			i27.add(mi50);
			i27.add(mi51);
			
			m5.add(m26);
			m5.add(m27);
			m5.add(m28);
			m5.add(mi164);
			m26.add(i28);
			m26.add(i29);
			m27.add(i30);
			m27.add(i31);
			m28.add(i32);
			m28.add(i33);
			
			i28.add(mi52);
			i28.add(mi53);
			i29.add(mi54);
			i29.add(mi55);
			i30.add(mi56);
			i30.add(mi57);
			i31.add(mi58);
			i31.add(mi59);
			i32.add(mi60);
			i32.add(mi61);
			i33.add(mi62);
			i33.add(mi63);
			
			m6.add(m29);
			m6.add(m30);
			m6.add(m31);
			m6.add(mi165);
			m29.add(i34);
			m29.add(i35);
			m30.add(i36);
			m30.add(i37);
			m31.add(i38);
			m31.add(i39);
			
			i34.add(mi64);
			i34.add(mi65);
			i35.add(mi66);
			i35.add(mi67);
			i36.add(mi68);
			i36.add(mi69);
			i37.add(mi70);
			i37.add(mi71);
			i38.add(mi72);
			i38.add(mi73);
			i39.add(mi74);
			i39.add(mi75);
		
			m7.add(m32);
			m7.add(m33);
			m7.add(m34);
			m7.add(mi166);
			m32.add(i40);
			m32.add(i41);
			m33.add(i42);
			m33.add(i43);
			m34.add(i44);
			m34.add(i45);
			
			i40.add(mi76);
			i40.add(mi77);
			i41.add(mi78);
			i41.add(mi79);
			i42.add(mi80);
			i42.add(mi81);
			i43.add(mi82);
			i43.add(mi83);
			i44.add(mi84);
			i44.add(mi85);
			i45.add(mi86);
			i45.add(mi87);
		
			m8.add(m35);
			m8.add(m36);
			m8.add(m37);
			m8.add(mi167);
			m35.add(i76);
			m35.add(i77);
			m36.add(i78);
			m36.add(i79);
			m37.add(i80);
			m37.add(i81);
			
			i76.add(mi88);
			i76.add(mi89);
			i77.add(mi90);
			i77.add(mi91);
			i78.add(mi92);
			i78.add(mi93);
			i79.add(mi94);
			i79.add(mi95);
			i80.add(mi96);
			i80.add(mi97);
			i81.add(mi98);
			i81.add(mi99);
			
			m9.add(m38);
			m9.add(m39);
			m9.add(m40);
			m9.add(mi168);
			m38.add(i70);
			m38.add(i71);
			m39.add(i72);
			m39.add(i73);
			m40.add(i74);
			m40.add(i75);
			
			i70.add(mi100);
			i70.add(mi101);
			i71.add(mi102);
			i71.add(mi103);
			i72.add(mi104);
			i72.add(mi105);
			i73.add(mi106);
			i73.add(mi107);
			i74.add(mi108);
			i74.add(mi109);
			i75.add(mi110);
			i75.add(mi111);
			
			m10.add(m41);
			m10.add(m42);
			m10.add(m43);
			m10.add(mi169);
			m41.add(i46);
			m41.add(i47);
			m42.add(i48);
			m42.add(i49);
			m43.add(i50);
			m43.add(i51);
			
			i46.add(mi112);
			i46.add(mi113);
			i47.add(mi114);
			i47.add(mi115);
			i48.add(mi116);
			i48.add(mi117);
			i49.add(mi118);
			i49.add(mi119);
			i50.add(mi120);
			i50.add(mi121);
			i51.add(mi122);
			i51.add(mi123);
			
			m11.add(m44);
			m11.add(m45);
			m11.add(m46);
			m11.add(mi170);
			m44.add(i52);
			m44.add(i53);
			m45.add(i54);
			m45.add(i55);
			m46.add(i56);
			m46.add(i57);
			
			i52.add(mi124);
			i52.add(mi125);
			i53.add(mi126);
			i53.add(mi127);
			i54.add(mi128);
			i54.add(mi129);
			i55.add(mi130);
			i55.add(mi131);
			i56.add(mi132);
			i56.add(mi133);
			i57.add(mi134);
			i57.add(mi135);
			
			m12.add(m47);
			m12.add(m48);
			m12.add(m49);
			m12.add(mi171);
			m47.add(i58);
			m47.add(i59);
			m48.add(i60);
			m48.add(i61);
			m49.add(i62);
			m49.add(i63);
			
			i58.add(mi136);
			i58.add(mi137);
			i59.add(mi138);
			i59.add(mi139);
			i60.add(mi140);
			i60.add(mi141);
			i61.add(mi142);
			i61.add(mi143);
			i62.add(mi144);
			i62.add(mi145);
			i63.add(mi146);
			i63.add(mi147);
			
			m13.add(m50);
			m13.add(m51);
			m13.add(m52);
			m13.add(mi172);
			m50.add(i64);
			m50.add(i65);
			m51.add(i66);
			m51.add(i67);
			m52.add(i68);
			m52.add(i69);
			
			i64.add(mi148);
			i64.add(mi149);
			i65.add(mi150);
			i65.add(mi151);
			i66.add(mi152);
			i66.add(mi153);
			i67.add(mi154);
			i67.add(mi155);
			i68.add(mi156);
			i68.add(mi157);
			i69.add(mi158);
			i69.add(mi159);
                        	mi4.addActionListener(this);
			mi5.addActionListener(this);
			mi6.addActionListener(this);
			mi7.addActionListener(this);
			mi8.addActionListener(this);
			mi9.addActionListener(this);
			mi10.addActionListener(this);
			mi11.addActionListener(this);
			mi12.addActionListener(this);
			mi13.addActionListener(this);
			mi14.addActionListener(this);
			mi15.addActionListener(this);
			mi16.addActionListener(this);
			mi17.addActionListener(this);
			mi18.addActionListener(this);
			mi19.addActionListener(this);
			mi20.addActionListener(this);
			mi21.addActionListener(this);
			mi22.addActionListener(this);
			mi23.addActionListener(this);
			mi24.addActionListener(this);
			mi25.addActionListener(this);
			mi26.addActionListener(this);
			mi27.addActionListener(this);
			mi28.addActionListener(this);
			mi29.addActionListener(this);
			mi30.addActionListener(this);
			mi31.addActionListener(this);
			mi32.addActionListener(this);
			mi33.addActionListener(this);
			mi34.addActionListener(this);
			mi35.addActionListener(this);
			mi36.addActionListener(this);
			mi37.addActionListener(this);
			mi38.addActionListener(this);
			mi39.addActionListener(this);
			mi40.addActionListener(this);
			mi41.addActionListener(this);
			mi42.addActionListener(this);
			mi43.addActionListener(this);
			mi44.addActionListener(this);
			mi45.addActionListener(this);
			mi46.addActionListener(this);
			mi47.addActionListener(this);
			mi48.addActionListener(this);
			mi49.addActionListener(this);
			mi50.addActionListener(this);
			mi51.addActionListener(this);
			mi52.addActionListener(this);
			mi53.addActionListener(this);
			mi54.addActionListener(this);
			mi55.addActionListener(this);
			mi56.addActionListener(this);
			mi57.addActionListener(this);
			mi58.addActionListener(this);
			mi59.addActionListener(this);
			mi60.addActionListener(this);
			mi61.addActionListener(this);
			mi62.addActionListener(this);
			mi63.addActionListener(this);
			mi64.addActionListener(this);
			mi65.addActionListener(this);
			mi66.addActionListener(this);
			mi67.addActionListener(this);
			mi68.addActionListener(this);
			mi69.addActionListener(this);
			mi70.addActionListener(this);
			mi71.addActionListener(this);
			mi72.addActionListener(this);
			mi73.addActionListener(this);
			mi74.addActionListener(this);
			mi75.addActionListener(this);
			mi76.addActionListener(this);
			mi77.addActionListener(this);
			mi78.addActionListener(this);
			mi79.addActionListener(this);
			mi80.addActionListener(this);
			mi81.addActionListener(this);
			mi82.addActionListener(this);
			mi83.addActionListener(this);
			mi84.addActionListener(this);
			mi85.addActionListener(this);
			mi86.addActionListener(this);
			mi87.addActionListener(this);
			mi88.addActionListener(this);
			mi89.addActionListener(this);
			mi90.addActionListener(this);
			mi91.addActionListener(this);
			mi92.addActionListener(this);
			mi93.addActionListener(this);
			mi94.addActionListener(this);
			mi95.addActionListener(this);
			mi96.addActionListener(this);
			mi97.addActionListener(this);
			mi98.addActionListener(this);
			mi99.addActionListener(this);
			mi100.addActionListener(this);
			mi101.addActionListener(this);
			mi102.addActionListener(this);
			mi103.addActionListener(this);
			mi104.addActionListener(this);
			mi105.addActionListener(this);
			mi106.addActionListener(this);
			mi107.addActionListener(this);
			mi108.addActionListener(this);
			mi109.addActionListener(this);
			mi110.addActionListener(this);
			mi111.addActionListener(this);
			mi112.addActionListener(this);
			mi113.addActionListener(this);
			mi114.addActionListener(this);
			mi115.addActionListener(this);
			mi116.addActionListener(this);
			mi117.addActionListener(this);
			mi118.addActionListener(this);
			mi119.addActionListener(this);
			mi120.addActionListener(this);
			mi121.addActionListener(this);
			mi122.addActionListener(this);
			mi123.addActionListener(this);
			mi124.addActionListener(this);
			mi125.addActionListener(this);
			mi126.addActionListener(this);
			mi127.addActionListener(this);
			mi128.addActionListener(this);
			mi129.addActionListener(this);
			mi130.addActionListener(this);
			mi131.addActionListener(this);
			mi132.addActionListener(this);
			mi133.addActionListener(this);
			mi134.addActionListener(this);
			mi135.addActionListener(this);
			mi136.addActionListener(this);
			mi137.addActionListener(this);
			mi138.addActionListener(this);
			mi139.addActionListener(this);
			mi140.addActionListener(this);
			mi141.addActionListener(this);
			mi142.addActionListener(this);
			mi143.addActionListener(this);
			mi144.addActionListener(this);
			mi145.addActionListener(this);
			mi146.addActionListener(this);
			mi147.addActionListener(this);
			mi148.addActionListener(this);
			mi149.addActionListener(this);
			mi150.addActionListener(this);
			mi151.addActionListener(this);
			mi152.addActionListener(this);
			mi153.addActionListener(this);
			mi154.addActionListener(this);
			mi155.addActionListener(this);
			mi156.addActionListener(this);
			mi157.addActionListener(this);
			mi158.addActionListener(this);
			mi159.addActionListener(this);
			mi160.addActionListener(this);
			mi161.addActionListener(this);
			mi162.addActionListener(this);
			mi163.addActionListener(this);
			mi164.addActionListener(this);
			mi165.addActionListener(this);
			mi166.addActionListener(this);
			mi167.addActionListener(this);
			mi168.addActionListener(this);
			mi169.addActionListener(this);
			mi170.addActionListener(this);
			mi171.addActionListener(this);
			mi172.addActionListener(this);
                        mi173.addActionListener(this);
                        setJMenuBar(mb);
			pn1.setBounds(0,0,1356,70);
			mb.setBorder(bf);
			pn2.setBounds(30,70,1300,470);
			pn2.setBorder(bf);
			 setContentPane(p);
			setSize(1400,1400);
			setVisible(true);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
	}
	void AddComp(JComponent jc, String title, int x, int y, int w, int h) {
        jc = new JLabel(title);
        jc.setBounds(x, y, w, h);

        //jc.setFont(fm1);
        pn2.add(jc);
    }
        FyBscSem1IssueForm f1;
         FyBscSem2IssueForm f2;
         AllDetailsView all;
          FyBscSem1Details d1;
          FyBscSem2Details d2;
           FyBscBBForm bb1;
	public void actionPerformed(ActionEvent e) {
             try
	    {
                if(e.getSource()==mi173)
		{
	 		all=new AllDetailsView("Library Records");
			all.setVisible(true);
			p.add(all);
			all.setSelected(true);
			
		}
		
		if(e.getSource()==mi4)
		{
	 		f1=new FyBscSem1IssueForm("Book Issuing and Returning");
			f1.setVisible(true);
			p.add(f1);
			f1.setSelected(true);
			
		}
                if(e.getSource()==mi5)
		{
	 		d1=new  FyBscSem1Details(" Details of Issuing and Returning ");
			d1.setVisible(true);
			p.add(d1);
			d1.setSelected(true);
			
		}
                if(e.getSource()==mi6)
		{
	 		f2=new FyBscSem2IssueForm("Book Issuing and Returning");
			f2.setVisible(true);
			p.add(f2);
			f2.setSelected(true);
			
		}
                if(e.getSource()==mi7)
		{
	 		d2=new  FyBscSem2Details(" Details of Issuing and Returning ");
			d2.setVisible(true);
			p.add(d2);
			d2.setSelected(true);
			
		}
                  if(e.getSource()==mi160)
		{
	 		bb1=new  FyBscBBForm("Book Bank");
			bb1.setVisible(true);
			p.add(bb1);
			bb1.setSelected(true);
			
		}
               
		if(e.getSource()==i16)
		{
			System.exit(0);
		}

	}
		catch(Exception ex){ex.printStackTrace();}
		
	}
	public static void main(String[] args) {
		Home m = new Home(" Home");

	}



    
}
