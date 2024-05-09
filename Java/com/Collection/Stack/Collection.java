package com.Collection.Stack;

import java.util.Stack;

public class Collection {
	public static void main(String[] args) {
	Stack<Integer> st=new Stack<Integer>();
	Integer i1=new Integer(1);
	Integer i2=new Integer(2);
	Integer i3=new Integer(3);
	Integer i4=new Integer(4);
	Integer i5=new Integer(5);
	st.push(i1);
	st.push(i2);
	System.out.println(st.pop());
}
}