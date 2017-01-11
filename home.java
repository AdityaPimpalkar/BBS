import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
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
import javax.swing.border.Border;

import java.util.Date;
import java.text.SimpleDateFormat;
public class home extends JFrame implements ActionListener{
	Container c;
	JPanel pn1;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,
	m29,m30,m31,m32,m33,m34,m35,m36,m37,m38,m39,m40,m41,m42,m43,m44,m45,m46,m47,m48,m49,m50,m51,m52,
	 i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36,i37,i38,i39,i40,
	i41,i42,i43,i44,i45,i46,i47,i48,i49,i50,i51,i52,i53,i54,i55,i56,i57,i58,i59,i60,i61,i62,i63,i64,i65,i66,i67,i68,i69,i70,i71,i72,i73,i74,i75,i76,i77,i78,i79,i80,i81;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi20,mi21,mi22,mi23,mi24,mi25,mi26,mi27,mi28,mi29,mi30,mi31,mi32
	,mi33,mi34,mi35,mi36,mi37,mi38,mi39,mi40,
	mi41,mi42,mi43,mi44,mi45,mi46,mi47,mi48,mi49,mi50,mi51,mi52,mi53,mi54,mi55,mi56,mi57,mi58,mi59,mi60,mi61,mi62,mi63,mi64,mi65,mi66,mi67,mi68,mi69,mi70,mi71,mi72,mi73,mi74,mi75,mi76,mi77,mi78,mi79,mi80,
	mi81,mi82,mi83,mi84,mi85,mi86,mi87,mi88,mi89,mi90,mi91,mi92,mi93,mi94;
	
	public home(){
		super("BBS");
		c=getContentPane();
		pn1=new JPanel();
		Font fm=new Font("castellar",Font.BOLD,18);
		Font fm1=new Font("cambria",Font.BOLD,16);
			mb= new JMenuBar();
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
			
			mi4=new JMenuItem("New Form");
			mi5=new JMenuItem("Details");
			mi6=new JMenuItem("New Form");
			mi7=new JMenuItem("Details");
			mi8=new JMenuItem("New Form");
			mi9=new JMenuItem("Details"); 
			
			mi10=new JMenuItem("New Form");
			mi11=new JMenuItem("Details");
			mi12=new JMenuItem("New Form");
			mi13=new JMenuItem("Details");
			mi14=new JMenuItem("New Form");
			mi15=new JMenuItem("Details"); 
			
			mi16=new JMenuItem("New Form");
			mi17=new JMenuItem("Details");
			mi18=new JMenuItem("New Form");
			mi19=new JMenuItem("Details");
			mi20=new JMenuItem("New Form");
			mi21=new JMenuItem("Details"); 
			
			mi22=new JMenuItem("New Form");
			mi23=new JMenuItem("Details");
			mi24=new JMenuItem("New Form");
			mi25=new JMenuItem("Details");
			mi26=new JMenuItem("New Form");
			mi27=new JMenuItem("Details"); 
			
			mi28=new JMenuItem("New Form");
			mi29=new JMenuItem("Details");
			mi30=new JMenuItem("New Form");
			mi31=new JMenuItem("Details");
			mi32=new JMenuItem("New Form");
			mi33=new JMenuItem("Details"); 
			
			mi34=new JMenuItem("New Form");
			mi35=new JMenuItem("Details");
			mi36=new JMenuItem("New Form");
			mi37=new JMenuItem("Details");
			mi38=new JMenuItem("New Form");
			mi39=new JMenuItem("Details"); 
			
			mi40=new JMenuItem("New Form");
			mi41=new JMenuItem("Details");
			mi42=new JMenuItem("New Form");
			mi43=new JMenuItem("Details");
			mi44=new JMenuItem("New Form");
			mi45=new JMenuItem("Details"); 
			
			mi46=new JMenuItem("New Form");
			mi47=new JMenuItem("Details");
			mi48=new JMenuItem("New Form");
			mi49=new JMenuItem("Details");
			mi50=new JMenuItem("New Form");
			mi51=new JMenuItem("Details"); 
			
			mi52=new JMenuItem("New Form");
			mi53=new JMenuItem("Details");
			mi54=new JMenuItem("New Form");
			mi55=new JMenuItem("Details");
			mi56=new JMenuItem("New Form");
			mi57=new JMenuItem("Details"); 
			
			mi58=new JMenuItem("New Form");
			mi59=new JMenuItem("Details");
			mi60=new JMenuItem("New Form");
			mi61=new JMenuItem("Details");
			mi62=new JMenuItem("New Form");
			mi63=new JMenuItem("Details"); 
			
			mi64=new JMenuItem("New Form");
			mi65=new JMenuItem("Details");
			mi66=new JMenuItem("New Form");
			mi67=new JMenuItem("Details");
			mi68=new JMenuItem("New Form");
			mi69=new JMenuItem("Details"); 
			
			mi70=new JMenuItem("New Form");
			mi71=new JMenuItem("Details");
			mi72=new JMenuItem("New Form");
			mi73=new JMenuItem("Details");
			mi74=new JMenuItem("New Form");
			mi75=new JMenuItem("Details");
			
			mi76=new JMenuItem("New Form");
			mi77=new JMenuItem("Details");
			mi78=new JMenuItem("New Form");
			mi79=new JMenuItem("Details");
			mi80=new JMenuItem("New Form");
			mi81=new JMenuItem("Details");
			
			
			mi82=new JMenuItem("BBS");
			mi83=new JMenuItem("BBS");
			mi84=new JMenuItem("BBS");
			mi85=new JMenuItem("BBS");
			mi86=new JMenuItem("BBS");
			mi87=new JMenuItem("BBS");
			mi88=new JMenuItem("BBS");
			mi89=new JMenuItem("BBS");
			mi90=new JMenuItem("BBS");
			mi91=new JMenuItem("BBS");
			mi92=new JMenuItem("BBS");
			mi93=new JMenuItem("BBS");
			mi94=new JMenuItem("BBS");
			
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
			
			i4.addActionListener(this);
			i5.addActionListener(this);
			i6.addActionListener(this);
			i7.addActionListener(this);
			i8.addActionListener(this);
			i9.addActionListener(this);
			i10.addActionListener(this);
			i11.addActionListener(this);
			i12.addActionListener(this);
			i13.addActionListener(this);
			i14.addActionListener(this);
			i15.addActionListener(this);
			i16.addActionListener(this);
			i17.addActionListener(this);
			i18.addActionListener(this);
			i19.addActionListener(this);
			i20.addActionListener(this);
			i21.addActionListener(this);
			i22.addActionListener(this);
			i23.addActionListener(this);
			i24.addActionListener(this);
			i25.addActionListener(this);
			i26.addActionListener(this);
			i27.addActionListener(this);
			i28.addActionListener(this);
			i29.addActionListener(this);
			i30.addActionListener(this);
			i31.addActionListener(this);
			i32.addActionListener(this);
			i33.addActionListener(this);
			i34.addActionListener(this);
			i35.addActionListener(this);
			i36.addActionListener(this);
			i37.addActionListener(this);
			i38.addActionListener(this);
			i39.addActionListener(this);
			i40.addActionListener(this);
			i41.addActionListener(this);
			i42.addActionListener(this);
			i43.addActionListener(this);
			i44.addActionListener(this);
			i45.addActionListener(this);
			i46.addActionListener(this);
			i47.addActionListener(this);
			i48.addActionListener(this);
			i49.addActionListener(this);
			i50.addActionListener(this);
			i51.addActionListener(this);
			i52.addActionListener(this);
			i53.addActionListener(this);
			i54.addActionListener(this);
			i55.addActionListener(this);
			i56.addActionListener(this);
			i57.addActionListener(this);
			i58.addActionListener(this);
			i59.addActionListener(this);
			i60.addActionListener(this);
			i61.addActionListener(this);
			i62.addActionListener(this);
			i63.addActionListener(this);
			i64.addActionListener(this);
			i65.addActionListener(this);
			i66.addActionListener(this);
			i67.addActionListener(this);
			i68.addActionListener(this);
			i69.addActionListener(this);
			i70.addActionListener(this);
			i71.addActionListener(this);
			i72.addActionListener(this);
			i73.addActionListener(this);
			i74.addActionListener(this);
			i75.addActionListener(this);
			i76.addActionListener(this);
			i77.addActionListener(this);
			i78.addActionListener(this);
			i79.addActionListener(this);
			i80.addActionListener(this);
			i81.addActionListener(this);
			
			c.add(pn1);
			pn1.add(mb);
			
			mb.add(m1);
			mb.add(m2);
			mb.add(m3);
			mb.add(m4);
			mb.add(m5);
			mb.add(m6);
			mb.add(m7);
			mb.add(m8);
			mb.add(m9);
			mb.add(m10);
			mb.add(m11);
			mb.add(m12);
			mb.add(m13);
			
			m1.add(m14);
			m1.add(m15);
			m1.add(m16);
			m1.add(mi82);
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
			m2.add(mi83);
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
			m3.add(mi84);
			m20.add(i16);
			m20.add(i17);
			m21.add(i18);
			m21.add(i19);
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
			m4.add(mi85);
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
			m5.add(mi86);
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
			m6.add(mi87);
			m29.add(i34);
			m29.add(i35);
			m30.add(i36);
			m30.add(i37);
			m31.add(i38);
			m31.add(i39);
			
			m7.add(m32);
			m7.add(m33);
			m7.add(m34);
			m7.add(mi88);
			m32.add(i40);
			m32.add(i41);
			m33.add(i42);
			m33.add(i43);
			m34.add(i44);
			m34.add(i45);
			
			m8.add(m35);
			m8.add(m36);
			m8.add(m37);
			m8.add(mi89);
			m35.add(i76);
			m35.add(i77);
			m36.add(i78);
			m36.add(i79);
			m37.add(i80);
			m37.add(i81);
			
			m9.add(m38);
			m9.add(m39);
			m9.add(m40);
			m9.add(mi90);
			m38.add(i70);
			m38.add(i71);
			m39.add(i72);
			m39.add(i73);
			m40.add(i74);
			m40.add(i75);
			
			m10.add(m41);
			m10.add(m42);
			m10.add(m43);
			m10.add(mi91);
			m41.add(i46);
			m41.add(i47);
			m42.add(i48);
			m42.add(i49);
			m43.add(i50);
			m43.add(i51);
			
			m11.add(m44);
			m11.add(m45);
			m11.add(m46);
			m11.add(mi92);
			m44.add(i52);
			m44.add(i53);
			m45.add(i54);
			m45.add(i55);
			m46.add(i56);
			m46.add(i57);
			
			m12.add(m47);
			m12.add(m48);
			m12.add(m49);
			m12.add(mi93);
			m47.add(i58);
			m47.add(i59);
			m48.add(i60);
			m48.add(i61);
			m49.add(i62);
			m49.add(i63);
			
			m13.add(m50);
			m13.add(m51);
			m13.add(m52);
			m13.add(mi94);
			m50.add(i64);
			m50.add(i65);
			m51.add(i66);
			m51.add(i67);
			m52.add(i68);
			m52.add(i69);
			
			setSize(900,900);
			setVisible(true);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		home m = new home();

	}

}
