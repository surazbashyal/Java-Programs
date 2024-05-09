package com.swing.demo;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//we are using checkbox by extending JFrame
public class CheckboxDemo extends JFrame {
	JCheckBox jcb;
	JComboBox cb;
	JList l;
	JMenuBar m1;
	JMenu jm;
	JMenuItem item1,item2,item3;
	CheckboxDemo(){
		String countrylist[]= {"Nepal","India","Brazil","USA"};
		setVisible(true);
		setSize(300,300);
		setLayout(new FlowLayout());
		jcb=new JCheckBox("Check 1");
		add(jcb);
		jcb=new JCheckBox("Check 2");
		add(jcb);
		cb=new JComboBox(countrylist);
		add(cb);
		l=new JList(countrylist);
		add(l);
		m1=new JMenuBar();
		jm=new JMenu("Branch");
		item1=new JMenuItem("Butwal");
		item2=new JMenuItem("BHW");
		item3=new JMenuItem("Pokhara");
		jm.add(item1);
		jm.add(item2);
		jm.add(item3);
		m1.add(jm);
		add(m1);
		
		
		
		}
		public static void main(String[] args) {
			new CheckboxDemo();
		}
		
	}
