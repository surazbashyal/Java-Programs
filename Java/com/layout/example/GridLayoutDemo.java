package com.layout.example;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo{
public static void main(String[] args) {
	JFrame f=new JFrame();
	JButton b1=new JButton("A");
	JButton b2=new JButton("B");
	JButton b3=new JButton("C");
	JButton b4=new JButton("D");
	JButton b5=new JButton("E");
	JButton b6=new JButton("F");
	f.setSize(300,300);
	f.setVisible(true);
	f.setLayout(new GridLayout(3,2));
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
}
}

