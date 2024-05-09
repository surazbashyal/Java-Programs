package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BasicCalculation implements ActionListener {
JFrame frame;	
JLabel Num1,Num2;
JButton Multi,Sum,Div,Sub;
JTextField Txt1,Txt2,Out;
BasicCalculation(){
	frame=new JFrame();
	frame.setLayout(new FlowLayout());
	Num1=new JLabel("First Num.");
	Num2=new JLabel("Second Num.");
	Multi=new JButton("Multiply");
	Sum=new JButton("Addition");
	Div=new JButton("Division");
	Sub=new JButton("Subtraction");
	Txt1=new JTextField(30);
	Txt2=new JTextField(30);
	Out=new JTextField(10);
	Out.setEditable(false);
	frame.setSize(400,400);
	frame.setVisible(true);
	frame.add(Num1);
	frame.add(Txt1);
	frame.add(Num2);
	frame.add(Txt2);
	frame.add(Multi);
	frame.add(Div);
	frame.add(Sub);
	frame.add(Sum);
	frame.add(Out);
	Multi.addActionListener(this);
	Div.addActionListener(this);
	Sub.addActionListener(this);
	Sum.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	String a=Txt1.getText();
	String b=Txt2.getText();
	int x=Integer.parseInt(a);
	int y=Integer.parseInt(b);
	if(e.getSource()==Multi)
	{
		int z=x*y;
		String m=Integer.toString(z);
		System.out.println(x*y);
		Out.setText(m);
	}
	if(e.getSource()==Sub)
	{
		int z=x-y;
		String m=Integer.toString(z);
		System.out.println(x-y);
		Out.setText(m);
	}	
	if(e.getSource()==Sum)
	{
		int z=x+y;
		String m=Integer.toString(z);
		System.out.println(x+y);
		Out.setText(m);
	}	
	if(e.getSource()==Div)
	{
		int z=x/y;
		String m=Integer.toString(z);
		System.out.println(x/y);
		Out.setText(m);
		}
}
	public static void main(String[] args)
	{
		new BasicCalculation();
	}
	
}


