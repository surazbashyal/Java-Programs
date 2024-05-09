package com.layout.example;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
public static void main(String[] args) {
	JFrame f=new JFrame();
	JButton b1=new JButton("North");
	JButton b2=new JButton("East");
	JButton b3=new JButton("West");
	JButton b4=new JButton("South");
	JButton b5=new JButton("Center");
	f.setSize(300,300);
	f.setVisible(true);
	f.add(b1,BorderLayout.NORTH);
	f.add(b2,BorderLayout.EAST);
	f.add(b3,BorderLayout.WEST);
	f.add(b4,BorderLayout.SOUTH);
	f.add(b5,BorderLayout.CENTER);
}
}
