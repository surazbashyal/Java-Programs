package com.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Stack;

public class Queue {
	public static void main(String[] args) {
	PriorityQueue st=new PriorityQueue<Integer>();
	Integer i1=new Integer(1);
	Integer i2=new Integer(2);
	Integer i3=new Integer(3);
	Integer i4=new Integer(4);
	Integer i5=new Integer(5);
	st.add(i1);
	st.add(i2);
	st.add(i5);
	System.out.println(st.remove());
}
}
